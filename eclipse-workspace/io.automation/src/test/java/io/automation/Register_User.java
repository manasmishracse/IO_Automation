package io.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register_User {

	private WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	private void setup() {
		// Creating Driver and initializing the path
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
	}

	
	  @Test() public void RegisterUser_Mail() throws InterruptedException {
	  
	  System.out.println("Starting User Registration Test");
	  
	  // opening the login page 
	  String url = "https://thepromoapp.com/#!/login";
	  driver.get(url);
	  
	  System.out.println("Login Page is Opened!!!");
	  
	  // Waiting for the visiblity of page
	  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	  
	  // Select User registration Page 
	  WebElement userpage = driver.findElement(By.xpath("//a[@class='create-account login']"));
	  userpage.click(); System.out.println("Sign Up Page is opened!!");
	  
	  // Waiting for the visiblity of page
	  driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	  
	  // Entering First Name
	  WebElement F_name = driver.findElement( By.xpath("/html//form[@id='signup_form']/div[@class='half_filed_prent']/md-input-container[1]/input"));
	  F_name.sendKeys("Manas");
	  
	  // Entering Second Name
	  WebElement S_name = driver.findElement( By.xpath("/html//form[@id='signup_form']/div[@class='half_filed_prent']/md-input-container[2]/input"));
	  S_name.sendKeys("Mishra");
	  
	  // Entering EmailAddress
	  WebElement E_mail = driver.findElement(By.xpath("/html//form[@id='signup_form']//input[@name='Email']"));
	  E_mail.sendKeys("mishra.manash0@gmail.com");
	  
	  // Entering Password 
	  WebElement pass = driver.findElement(By.xpath("/html//form[@id='signup_form']//input[@name='password']"));
	  pass.sendKeys("Qwerty@1234");
	  
	  // Selecting City 
	  WebElement city = driver.findElement(By.xpath("/html//form[@id='signup_form']/md-input-container[3]//md-icon[@role='img']"));
	  city.click();
	  
	  // Waiting for the value of city to be fetched
	  
	  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  System.out.println("City is fetched");
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  // Sign Up Button
	  WebElement button = driver.findElement(By.xpath("/html//form[@id='signup_form']/div[4]/div[@class='col-md-12 pa-no-padding pt-top-10']/button[@type='submit']"));
	  button.click();
	  
	  System.out.println("button is clicked"); 
	  Thread.sleep(12000);
	  
	  }
	 

	@AfterMethod(alwaysRun = true)
	private void tearDown() {
		// Close Browser
		driver.quit();

	}

}
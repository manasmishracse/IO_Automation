package io.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserLogin {

	private WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	private void setup() {
		// Creating Driver and initializing the path
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
	}

	@Test()
	public void PositiveLoginTest() throws InterruptedException {

		System.out.println("Starting User Login Test");

		// opening the login page
		String url = "https://thepromoapp.com/#!/login";
		driver.get(url);

		System.out.println("Page is Opened!!!");

		// Waiting for the visiblity of page
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Enter Username
		WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
		username.sendKeys("mishra.manash0@gmail.com");

		// Enter Password
		WebElement password = driver.findElement(By.xpath("//input[@id='input_1']"));
		password.sendKeys("Qwerty@1234");

		// Click Login Button
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		Thread.sleep(15000);

		driver.quit();


	}

}

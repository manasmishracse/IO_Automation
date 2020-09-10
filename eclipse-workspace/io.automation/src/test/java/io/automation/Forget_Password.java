package io.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forget_Password {

	public class Forget_Pass {

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
		public void ForgetPass() throws InterruptedException {

			System.out.println("Starting Forget Password Test");

			// opening the login page
			String url = "https://thepromoapp.com/#!/login";
			driver.get(url);

			System.out.println("Login Page is Opened!!!");

			// Waiting for the visiblity of page
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

			// Click on Forget Pass button
			WebElement FP = driver.findElement(
					By.xpath("/html//form[@id='login_form']/div[@class='col-md-12 text-right']/a[@role='button']"));
			FP.click();

			// Clicking on Radio Button Mobile

			WebElement Mobile = driver.findElement(By.xpath(
					"//body/div[2]/div//md-content/form[@name='ResetFormOne']//md-input-container/md-radio-group[@role='radiogroup']/md-radio-button[1]//div[@class='md-off']"));
			Mobile.click();

			// Waiting for the visiblity of page
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Clicking the Drop Down
			WebElement Drop_Down = driver.findElement(By.xpath(
					"//form[@id='ResetFormMobile']/md-input-container//div[@title='United States: +1']/div[@class='iti-arrow']"));
			Drop_Down.click();

			// Waiting for the visiblity of page
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Selecting India

			WebElement Country = driver.findElement(By.xpath(
					"//form[@id='ResetFormMobile']/md-input-container//ul[@class='country-list dropup']/li[101]"));
			Country.click();

			// Entering Mobile Number

			WebElement Number = driver.findElement(
					By.xpath("//form[@id='ResetFormMobile']/md-input-container//input[@name='mobile_number']"));
			Number.sendKeys("9205983843");

			// Clicking on Reset Button

			WebElement Reset = driver.findElement(By.xpath("//form[@id='ResetFormMobile']//button[@type='submit']"));
			Reset.click();

			Thread.sleep(40000);

			driver.quit();

		}

	}

}

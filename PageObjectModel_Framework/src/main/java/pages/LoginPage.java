package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonImplementation;

public class LoginPage extends CommonImplementation {

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage EnterUsername(String Username) {

		driver.findElement(By.id("username")).sendKeys(Username);
		return this;

	}

	public LoginPage EnterPassword(String Password) {

		driver.findElement(By.id("password")).sendKeys(Password);
		return this;

	}

	public LandingPage ClickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();
		return new LandingPage(driver);

	}

}

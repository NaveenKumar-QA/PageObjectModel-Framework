package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonImplementation;

public class HomePage extends CommonImplementation {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage ClickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}

	public LeadsPage ClickLeadsTab() {

		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);

	}

}

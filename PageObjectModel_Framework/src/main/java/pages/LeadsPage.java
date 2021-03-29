package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonImplementation;

public class LeadsPage extends CommonImplementation {

	public LeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadsPage ClickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);

	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonImplementation;

public class CreateLeadPage extends CommonImplementation {

	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage EnterCompanyName(String CompanyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		return this;
	}

	public CreateLeadPage EnterFirstName(String FirstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		return this;
	}

	public CreateLeadPage EnterLastame(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}

	public CreateLeadPage EnterPhoneNumber(String PhoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
		return this;
	}

	public CreateLeadPage EnterEmailID(String EmailId) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(EmailId);
		return this;
	}

	public ViewLeadPage ClickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

}

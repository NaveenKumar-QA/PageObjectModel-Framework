package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.CommonImplementation;
import pages.LoginPage;

public class CreateLead extends CommonImplementation {

	@BeforeClass
	public void filesheetExcel_Name() {
		FileSheet_Name = "CreateLead";

	}

	@Test(dataProvider = "Excel_ReadTC")
	public void Create_Lead(String Username, String Password, String CompanyName, String FirstName, String lastName,
			String PhoneNumber, String EmailId) {

		LoginPage obj = new LoginPage(driver);
		obj.EnterUsername(Username).EnterPassword(Password).ClickLogin().ClickCRMSFA().ClickCreateLead()
				.EnterCompanyName(CompanyName).EnterFirstName(FirstName).EnterLastame(lastName)
				.EnterPhoneNumber(PhoneNumber).EnterEmailID(EmailId).ClickCreateLead();

	}

}

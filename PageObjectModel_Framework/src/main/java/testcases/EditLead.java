package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.CommonImplementation;
import pages.LoginPage;

public class EditLead extends CommonImplementation {

	@BeforeClass
	public void FileName() {
		FileSheet_Name = "EditLead";
	}

	@Test(dataProvider = "Excel_ReadTC")
	public void EditLeadTC(String Username, String Password, String FirstName, String CompanyName)
			throws InterruptedException {

		LoginPage obj = new LoginPage(driver);

		obj.EnterUsername(Username).EnterPassword(Password).ClickLogin().ClickCRMSFA().ClickLeadsTab().ClickFindLeads()
				.EnterFirstName(FirstName).ClickFindLeads().ClickFirstRecord().ClickEditLead()
				.EditCompanyName(CompanyName).clickSubmitButton().ValidateNewCompanyName(CompanyName);

	}

}

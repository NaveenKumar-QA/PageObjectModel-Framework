package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.CommonImplementation;
import pages.LoginPage;

public class DuplicateLead extends CommonImplementation {

	@BeforeClass
	public void FileName() {
		FileSheet_Name = "DuplicateLead";
	}

	@Test(dataProvider = "Excel_ReadTC")
	public void Duplicate_LeadExecution(String Username, String Password, String EmailID) throws InterruptedException {

		LoginPage obj = new LoginPage(driver);
		obj.EnterUsername(Username).EnterPassword(Password).ClickLogin().ClickCRMSFA().ClickLeadsTab().ClickFindLeads()
				.ClickEmailTab().EnterEmailId(EmailID).ClickFindLeadsEmail().ClickFirstRecord().ClickDuplicateLead()
				.ClickCreateLead();

	}

}

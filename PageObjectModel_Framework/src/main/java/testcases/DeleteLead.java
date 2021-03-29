package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.CommonImplementation;
import pages.LoginPage;

public class DeleteLead extends CommonImplementation {

	@BeforeClass
	public void FileName() {
		FileSheet_Name = "DeleteLead";
	}

	@Test(dataProvider = "Excel_ReadTC")
	public void DeleteLead_Execution(String Username, String Password, String PhoneNumber) throws InterruptedException {
		LoginPage obj = new LoginPage(driver);

		obj.EnterUsername(Username).EnterPassword(Password).ClickLogin().ClickCRMSFA().ClickLeadsTab().ClickFindLeads()
				.ClickPhoneTab().EnterPhoneNumber(PhoneNumber).ClickFindLeadsPhone().ClickFirstRecord()
				.ClickDeleteLead();

	}

}

package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonImplementation extends Excel_ReadTC {

	public ChromeDriver driver;
	public String FileSheet_Name;

	@BeforeMethod
	public void PreCondition()

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod

	public void PostCondition() {

		driver.close();
	}

	@DataProvider(name = "Excel_ReadTC")
	public String[][] CommonExcelRead() throws IOException {
		Excel_ReadTC obj = new Excel_ReadTC();
		return obj.ReadingExcelFile(FileSheet_Name);

	}

}

package Zouktest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import UtilityPKG.Loginexel;
import Zoukpage.ForgottPSWpage;


public class ForgottPSWtest {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://zouk.co.in/account/login?return_url=%2Faccount#recover");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	
	@Test
	
	public void recoverpsw() throws InterruptedException
	{
		
		ForgottPSWpage p1 = new ForgottPSWpage(driver);
		
		String x1 = "C:\\Users\\devas\\OneDrive\\Desktop\\PROJECT LOGIN DETAILS.xlsx";
		
		String Sheet1 = "recover";
		
		int rowcount = Loginexel.getRowCount(x1, Sheet1);
		
		for(int i = 1;i<= rowcount;i++)
		{
			String email = Loginexel.getCellValue(x1, Sheet1, i, 0);
			System.out.println("Email id===" + email);
						
			
			p1.emailidfield(email);
			
			
			p1.recover();
			
			Thread.sleep(10000);
		}
				
	}
	
	@Test
	public void heading()
	{
		ForgottPSWpage p1 = new ForgottPSWpage(driver);
		p1.RecoverPSWHeading();
		p1.recovertitle();
		p1.recoverbuttonverify();
	}

}

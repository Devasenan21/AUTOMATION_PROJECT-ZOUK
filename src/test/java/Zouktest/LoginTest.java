package Zouktest;


import org.testng.annotations.Test;


import UtilityPKG.Loginexel;
import Zoukpage.LoginPage;

public class LoginTest extends Loginbase{
	
	
	
	@Test
	public void loginverify() throws InterruptedException
	{
		
		LoginPage p1 = new LoginPage(driver);
		
		String x1 = "C:\\Users\\devas\\OneDrive\\Desktop\\PROJECT LOGIN DETAILS.xlsx";
		
		String Sheet = "Login";
		
		int rowcount = Loginexel.getRowCount(x1, Sheet);
		
		for(int i = 1;i<= rowcount;i++)
		{
			String UserName = Loginexel.getCellValue(x1, Sheet, i, 0);
			System.out.println("username===" + UserName);
			String pwd = Loginexel.getCellValue(x1, Sheet, i, 1);
			System.out.println("password===" + pwd);
			
			
			p1.setvalues(UserName, pwd);
			
			
			p1.Login();
			
			Thread.sleep(20000);
		}
				
	}
	
	@Test
	public void Logintextverification()
	{
		LoginPage p1 = new LoginPage(driver);
		p1.loginheading();
		p1.logintitle();
		p1.LoginButtonverify();
	}

}

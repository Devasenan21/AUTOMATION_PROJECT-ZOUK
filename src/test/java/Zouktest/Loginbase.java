package Zouktest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Loginbase {  
	
	public static WebDriver driver;
	@BeforeClass
	
	
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://zouk.co.in/account/login?return_url=%2Faccount");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}


}

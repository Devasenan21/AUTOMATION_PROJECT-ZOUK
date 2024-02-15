package Zouktest;

import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Zoukbase {
	
	public static WebDriver driver;
	@BeforeMethod
	@BeforeClass
	
	
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://zouk.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}


}

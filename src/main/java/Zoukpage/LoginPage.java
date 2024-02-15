package Zoukpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	
	//@FindBy(xpath = "//*[@id=\"shopify-section-sections--21868534300968__header\"]/height-observer/x-header/nav[2]/a[1]")
	//WebElement account;		//Click Account button
	
	@FindBy(xpath = "//input[@name=\"customer[email]\"]")
	WebElement email;
	
	@FindBy(xpath = "//input[@name=\"customer[password]\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/button")
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id=\"login\"]/div[1]/h1")
	WebElement customerlogintext;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	//public void Profile() {
		
//		account.click();
	//}
	
	public void setvalues(String UserName , String pwd) {		//data driven
		
		email.sendKeys(UserName);
		password.sendKeys(pwd);
		
	}
	
	public void Login() {
		
		loginbutton.click();
	}
	
	

	public void loginheading() {						//get heading
	
		System.out.println("Login Heading Text===" + customerlogintext.getText());
	}
	
	public void logintitle() {							//get title
		String ActTitle = driver.getTitle();
		System.out.println("Title of login page==" + ActTitle);
		
		String exp = ActTitle;
		if(exp.equals(ActTitle))
		{
			System.out.println("Title is same");
		}
		else {
			System.out.println("Title is different");
		}
		
	}
	
	public void LoginButtonverify() {			//CHECK LOGIN BUTTON IS PRESENT
		
		if(loginbutton != null)
		{
			if(loginbutton.isDisplayed())
			{
				System.out.println("Login button is present and visible");
			}
			else
			{
				System.out.println("Login button is present but not visible");
			}
		}
		else
		{
			System.out.println("Login button is not present on the page");
		}
			
			
	}
}

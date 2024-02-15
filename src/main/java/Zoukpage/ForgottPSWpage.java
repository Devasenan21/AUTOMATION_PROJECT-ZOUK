package Zoukpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottPSWpage{
	
	WebDriver driver;
					
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/div[2]/div[2]")
	WebElement forgotpswbutton;
	
	@FindBy(xpath = "//*[@id=\"recover\"]/div/h1")
	WebElement recoverpasswordheading;
	
	@FindBy(xpath = "//*[@id=\"recover\"]/div/p")
	WebElement enteremailtext;
	
	@FindBy(xpath = "//*[@id=\"input-template--21868538888488__main--email\"]")
	WebElement enteremailid;
	
	@FindBy(xpath = "//*[@id=\"recover\"]/form/button")
	WebElement recoverbutton;
	
	public ForgottPSWpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Forgotpswbutton() {
		forgotpswbutton.click();
	}
	
	
	
	public void emailidfield(String email) {			//data driven
		enteremailid.sendKeys(email);
	}
	
	public void recover() {
		recoverbutton.click();
	}
	
	public void RecoverPSWHeading() {			//get heading
		String exp = "Recover password";
		String act = recoverpasswordheading.getText();
		
		if(exp.equals(act))
		{
			System.out.println("Heading ===" + act);
		}
		else
		{
			System.out.println("Heading is different");
		}
		
	}
	
	public void recovertitle() { 				//get title
		String ActTitle = driver.getTitle();
		System.out.println("Title ===" + ActTitle);
		
		String exp = ActTitle;
		if(exp.equals(ActTitle))
		{
			System.out.println("Title is same");
		}
		else {
			System.out.println("Title is different");
		}
	}
	
	public void recoverbuttonverify() {
		
		if(recoverbutton != null)
		{
			if(recoverbutton.isDisplayed())
			{
				System.out.println("Recover button is present and visible");
			}
			else
			{
				System.out.println("Recover button is present but not visible");
			}
		}
		else
		{
			System.out.println("Recover button is not present on the page");
		}
		
	}

}

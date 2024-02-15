package Zoukpage;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Putcartpage{
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"block-5781545e-6996-4366-8506-e2a6c28ffdfd\"]/div/div/button")
	WebElement shopbags;
	
	@FindBy(xpath = "//*[@id=\"block-template--19831582130472__813ef0e2-c8ab-4166-9422-4f0673a06054-1689186930ece6653d-0\"]/div/div")
	WebElement womensofficebags;
	
	@FindBy(xpath = "//*[@id=\"product_form_1950937841761\"]/button")
	WebElement product1;
	
	@FindBy(xpath = "//*[@id=\"product_form_6681250234465\"]/button")
	WebElement product2;
	
	@FindBy(xpath = "//*[@id=\"product_form_1411770679393\"]/button")
	WebElement product3;
	
	public Putcartpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Shopbags() {
		shopbags.click();
	}
	
	public void Womenoffbags() {
		womensofficebags.click();
	}
	
	public void product01() {
		product1.click();
	}
	
	public void product02() {
		product2.click();
	}
	
	public void product03() {
		product3.click();
	}
	
	
	
	
	
}
package Zoukpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchbarPage {
	
WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--21984009322792__header\"]/height-observer/x-header/nav[2]/div[1]/span")
	WebElement searchbar; //search box
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--21984009322792__header\"]/height-observer/x-header/nav[2]/div[2]/input")
	WebElement SearchbarLabel; //label
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--21984009322792__header\"]/height-observer/x-header/nav[2]/div[2]/input")
	WebElement SearchBarentering; //entervalues
	
	public SearchbarPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Visiblesearchbar() {	//TEST SEARCH BOX IS VISIBLE
		
		if(searchbar != null)
		{
			if(searchbar.isDisplayed())
			{
				System.out.println("Searchbar is present and visible");
			}
			else
			{
				System.out.println("Searchbar is present but not visible");
			}
		}
		else
		{
			System.out.println("Searchbar is not present in the page");
		}
	}
	
	
	
	public void SearchLabel() {			//TEST LABEL OF SEARCH BOX IS AS EXPECTED
		
		String explabel = "Search...";
		String actlabel = SearchbarLabel.getText();
		
		if(actlabel.equals(explabel))
		{
			System.out.println("Search label is as expected");
		}
		else
		{
			System.out.println("Search box label is not as expected");
		}
		
	}
	
	public void searchbarinputvalues() {		//TEST WITH ENTERING SEARCH DATA
		
		Actions action = new Actions(driver);
		
		searchbar.click();
		SearchBarentering.sendKeys("bags"); //ENTERING SEARCH DATA
		//searchbar xpath mattendi verum>>>>>>>>
		
		action.sendKeys(Keys.ENTER);  //PRESS ENTER USING ACTION CLASS
		action.build();
		action.perform();
		
		
	}

	
	

}

package Zouktest;

import org.testng.annotations.Test;

import Zoukpage.SearchbarPage;

public class SearchbarTest extends Zoukbase	{
	
	@Test
	public void Searchbarvisible()
	{
		SearchbarPage ob = new SearchbarPage(driver);
		
		ob.Visiblesearchbar();
		ob.SearchLabel();
		ob.searchbarinputvalues();
	}

}

package Zouktest;

import org.testng.annotations.Test;

import Zoukpage.Putcartpage;

public class Putcarttest extends Zoukbase{
	
	@Test
	public void Addtocart() throws InterruptedException
	{
		Putcartpage ob = new Putcartpage(driver);
		
		ob.Shopbags();
		ob.Womenoffbags();
		ob.product01();
		Thread.sleep(5000);
		ob.product02();
		Thread.sleep(5000);
		ob.product03();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}

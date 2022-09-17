package com.EcomDemo.TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.EcomDemo.PageObjects.ShopMobilePage;
import com.EcomDemo.PageObjects.SortMobilesPage;

public class TC_VerifyErrMsg_003 extends EcomBaseClass{
@Test
	 public void validate_errMsg()
	 {
			driver.get(url);
			log.info("TC_003 url got openend");
			ShopMobilePage shop=new ShopMobilePage(driver);
			
			shop.selectMobiles();
			
			shop.addToCartSony();
			log.info("Mobile got selected and added to cart");
			
			shop.enterQty();
			
			shop.updateQty();
			
			String reqErrMsg=shop.getErrMsg();
			
			String ErrMsg="* The maximum quantity allowed for purchase is 500.";
			
			try {
			assertEquals(reqErrMsg, ErrMsg);
			log.info("TC_003 got verified");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 
		 
		 
		 
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
}

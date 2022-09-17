package com.EcomDemo.TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.EcomDemo.PageObjects.ShopMobilePage;

public class TC_ShareWishList_005 extends EcomBaseClass {
	
	
	@Test
	public void shareWishList()
	{
	driver.get(url);
	log.info("TC_005 url got openend");
		
		ShopMobilePage shop=new ShopMobilePage(driver);
		
		shop.selectaccountBtn();
		
		shop.selectMyAccBtn();
		
		shop.selectCreateAccount();
		log.info("started to create new account");
		
		shop.setFirstName();
		
		shop.setLastName();
		
		shop.setemailAdd();
		
		shop.setPassword();
		
		shop.selectConformation();
		
		shop.selectRegister();
		log.info("New account got created");
		
		String Successmsg = shop.getRegCode();
		
		System.out.println(Successmsg);
		
		shop.selectTV();
		
		shop.selectAddWishList();
		
		shop.selectShareWishlist();
		
		shop.setemailAdd();
		
		shop.selectShareBtn();
		log.info("TC_005 got verified");
		
		driver.close();
		
	}
		
		public String randomString()
		{
			String generatedString= RandomStringUtils.randomAlphabetic(8);
			return generatedString;
			
		}
		
	

	
	
	
	
	
	
	
	
	
}

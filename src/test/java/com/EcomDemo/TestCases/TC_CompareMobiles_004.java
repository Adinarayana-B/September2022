package com.EcomDemo.TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.EcomDemo.PageObjects.ShopMobilePage;
import com.EcomDemo.PageObjects.SortMobilesPage;

public class TC_CompareMobiles_004 extends EcomBaseClass{
	
	
	@Test
	public void compareMobileFeatures()
	{
	driver.get(url);
	log.info("TC_004 url got Openend");
	ShopMobilePage shop=new ShopMobilePage(driver);
	
	shop.selectMobiles();
	
	shop.compareIphone();
	
	shop.compareSamsung();
	
	shop.compareMobiles();
	
	String parentHandle=driver.getWindowHandle();
	
	for(String handle: driver.getWindowHandles())
	{
		driver.switchTo().window(handle);
	}
	
	String iphoneTxt=shop.getIphoneText();
	String samsungTxt=shop.getSamsungText();
	
	assertEquals(true, iphoneTxt.equals("IPHONE"));
	assertEquals(true,samsungTxt.equals("SAMSUNG GALAXY"));
	log.info("TC_004 got verified");
	//System.out.println(iphoneTxt);
	//System.out.println(samsungTxt);
	
    shop.closeCompare();
    
	driver.switchTo().window(parentHandle);
	
	
	
	}
	
	
	

}

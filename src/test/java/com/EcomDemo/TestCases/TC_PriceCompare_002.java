package com.EcomDemo.TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EcomDemo.PageObjects.ShopMobilePage;
//import com.EcomDemo.PageObjects.SortMobilesPage;

public class TC_PriceCompare_002 extends EcomBaseClass {

@Test
public void priceCompare()
{
	driver.get(url);
	log.info("TC_002 got started");
	ShopMobilePage shop=new ShopMobilePage(driver);
	
	shop.selectMobiles();
	
	String ListPrice=shop.getSonyListPrice();
	
	shop.selectSonyMobile();
	
	String DetailsPrice=shop.getSonyDetailsPrice();
	
	if(ListPrice.equals(DetailsPrice))
	{
		Assert.assertTrue(true);
		log.info("TC_002 got passed");
		
	}
	else
	{
		Assert.assertTrue(false);
	
	}
	try {
	assertEquals(ListPrice,DetailsPrice);
	}
	catch(Exception e) {
		  e.printStackTrace();
	}
	}
	
}
	
	
	


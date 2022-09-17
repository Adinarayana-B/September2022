package com.EcomDemo.TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.EcomDemo.PageObjects.ShopMobilePage;

public class TC_PrintOrder_007 extends EcomBaseClass {
	

	
	@Test
	public void PrintOrder() throws InterruptedException
	{
		ShopMobilePage shop=new ShopMobilePage(driver);
	driver.get("url");
	log.info("TC_007 url got openend");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	shop.selectaccountBtn();
	shop.selectMyAccBtn();
	shop.setRegMailId(usermailId);
	shop.setRegpwd(password);
	shop.selectLogin();
	log.info("TC_007 portel openend with login details");
	Thread.sleep(5000);
	shop.selectMyOrder();
	shop.selectViewOrderBtn();
	String OrderStatus=shop.getOrderStatus();
	System.out.println(OrderStatus);
	shop.selectPrintOrder();
	log.info("TC_007 got verified");
	}
	
	

}

package com.EcomDemo.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.EcomDemo.PageObjects.ShopMobilePage;
import com.EcomDemo.PageObjects.SortMobilesPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_SortMobiles_001 extends EcomBaseClass{
     
	
	
	@Test
	public void SortMobiles() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get(url);
		log.info("URL got Openend");
	ShopMobilePage shop=new ShopMobilePage(driver);
		
	shop.selectMobiles();
	
	
	shop.sortByName();  
	log.info("Mobiles got sorted by NAME");
	log.fatal("Test Case_001 got passed");
	
	}
	
		
	
}

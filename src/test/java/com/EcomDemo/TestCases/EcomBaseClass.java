package com.EcomDemo.TestCases;

import org.apache.logging.log4j.LogManager;

import java.time.Duration;
//import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.log4testng.Logger;
import org.testng.annotations.Parameters;

import com.Ecommerce.Utilities.ReadConfig;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcomBaseClass {
	ReadConfig readconfig=new ReadConfig();
	public WebDriver driver;
	public String url=readconfig.getUrl();
    public String usermailId=readconfig.getUserMail();
    public String password=readconfig.getPassword();
    public static final Logger log=LogManager.getLogger(EcomBaseClass.class);
  
    ExtentReports report;
    ExtentTest test;
    
    @Parameters("browser")
	@BeforeClass
	public void LaunchBrowser(String br) 
	
	{
    	System.setProperty("log4j2.configurationFile","C:\\Users\\91970\\eclipse-workspace\\E-CommerceDemoProject\\log4j2.properties");
    	report=new ExtentReports("C:\Users\91970\eclipse-workspace\E-CommerceDemoProject\Report\ExtentReport.html",true);
		if(br.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		
		 driver=new FirefoxDriver();
		}
		else if(br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		 //Log4J2PropertiesConf log4J2PropertiesConf=new Log4J2PropertiesConf();
	        //log4J2PropertiesConf.performSomeTask();
		    
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		   //PropertyConfigurator.configure("log4j2.properties")
		//PropertyConfigurator.
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	
}

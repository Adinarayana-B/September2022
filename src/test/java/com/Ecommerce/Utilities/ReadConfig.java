package com.Ecommerce.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() 
	{
		File src =new File("./Configuration/Config.properties");
		
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
		
			e.printStackTrace();
		}
	
		
	}
	public String getUrl()
	{
		String BaseUrl=pro.getProperty("url");
	    return BaseUrl;
	}
	public String getUserMail()
	{
		String Umail=pro.getProperty("usermailId");
		return Umail;
	}
   public String getPassword()
   {
	String Upwd=pro.getProperty("password");
	return Upwd;
   }

}

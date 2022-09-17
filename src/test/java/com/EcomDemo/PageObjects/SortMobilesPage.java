package com.EcomDemo.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import com.EcomDemo.TestCases.EcomBaseClass;

public class SortMobilesPage{
	
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="MOBILE")
	WebElement Mobilesopt;
	
	@FindBy(xpath="//div[@class='breadcrumbs']/following::select")
	WebElement NameMob;
	
	@FindBy(xpath="//span[@id='product-price-1']/span")
	WebElement sonyListPrice;
	
	@FindBy(xpath="//img[@id='product-collection-image-1']")
	WebElement sonyImg;
	
	@FindBy(xpath="//span[@id='product-price-1']/span")
	WebElement sonyDetailsPrice;
	
	@FindBy(xpath="//a[@title='Xperia']/following::span[5]")
	WebElement btnSonyCart;
	
	@FindBy(xpath="//table[@id='shopping-cart-table']//input")
	WebElement qty;
	
	@FindBy(xpath="//span[text()='Update']")
	WebElement updateqty;
	
	@FindBy(xpath="//p[@class='item-msg error']")
	WebElement reqErrMsg;
	
	@FindBy(xpath="//div[@class='col-main']//div[3]//div[3]//li[2]/a")
	WebElement iphoneCmpBtn;
	
	@FindBy(xpath="//div[@class='col-main']//div[3]//li[2]//div[3]//li[2]/a")
	WebElement samsungCmpBtn;
	
	@FindBy(xpath="//ol[@id='compare-items']/following::span[2]")
	WebElement CmpBtn;
	
	@FindBy(xpath="//span[text()='Close Window']")
	WebElement closeCmpBtn; 
	
	@FindBy(xpath="//table[@id='product_comparison']//h2//a[@title='IPhone']")
	WebElement iphoneName;
	
	@FindBy(xpath="//table[@id='product_comparison']//h2//a[@title='Samsung Galaxy']")
	WebElement samsungName;
	
	
	
	
	
	
	
	
	public SortMobilesPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	

	public void selectMobiles()
	{
		//System.out.println("selecting mobiles link text found");
		//driver.findElement(By.xpath("//a[text()='Mobile']")).click(); 
		
		Mobilesopt.click();
		System.out.println("the element is"+Mobilesopt);
	}
	public void sortByName()
	{
		Select st=new Select(NameMob);
		st.selectByVisibleText("Name");
	}

	public String getSonyListPrice()
	{
		//String SLP=sonyListPrice.getText();
		//return SLP;
		return sonyListPrice.getText();
	}
	
	public void selectSonyMobile()
	{
		sonyImg.click();
	}
	
	public String getSonyDetailsPrice()
	{
		return sonyDetailsPrice.getText();
	}
	
	public void addToCartSony()
	{
		btnSonyCart.click();
	}
	
	public void enterQty()
	{
		qty.sendKeys("1000");
	}
	
	public void updateQty()
	{
	 updateqty.click();	
	}
	
	public String getErrMsg()
	{
		return reqErrMsg.getText();
	}
	
	public void compareIphone()
	{
		iphoneCmpBtn.click();
	}
	
	public void compareSamsung()
	{
		samsungCmpBtn.click();
	}
	
	public void compareMobiles()
	{
		CmpBtn.click();
	}
	
	public void closeCompare()
	{
		closeCmpBtn.click();
	}
	
	public String getIphoneText()
	{
		return iphoneName.getText();
	}
	
	public String getSamsungText()
	{
		return samsungName.getText();
	}
	
}


package com.EcomDemo.PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShopMobilePage {

	WebDriver ldriver;
	
	public ShopMobilePage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="login[username]")
	WebElement RegemailBtn;
	
	@FindBy(xpath="//ul[@class='form-list']//following::div[2]/input")
	WebElement RegPwdBtn;
	
	@FindBy(xpath="//button[@id='send2']")
	WebElement LoginBtn;
	
	//@FindBy(xpath="//div[@class='block-content']//li[4]//strong[text()='My Orders']")
	@FindBy(linkText="MY ORDERS")
	WebElement myOrderBtn;
	
	@FindBy(xpath="//tr[@class='first odd']//a[contains(text(),'View Order')]")
	WebElement viewordBtn;
	
	@FindBy(xpath="//div[@class='my-account']//h1")
	WebElement ordStatusBtn;
	
	@FindBy(xpath="//a[contains(text(),'Print Order')]")
	WebElement printOrdBtn;
	
	
	
	
	@FindBy(linkText="ACCOUNT")
	WebElement accountBtn;
	
	@FindBy(linkText="My Account")
	WebElement myAccountBtn;
	
	@FindBy(linkText="CREATE AN ACCOUNT")
	WebElement CreateAccBtn;
	
	@FindBy(id="firstname")
	WebElement firstNameBtn;
	
	@FindBy(id="lastname")
	WebElement lastNameBtn;
	
	@FindBy(id="email_address")
	WebElement emailAddBtn;
	
	@FindBy(id="password")
	WebElement pwdBtn;
	
	@FindBy(id="confirmation")
	WebElement confirmBtn;
	
	@FindBy(xpath="//button[@title='Register']/span/span")
	WebElement registerBtn;
	
	@FindBy(xpath="//span[normalize-space()='Thank you for registering with Main Website Store.']")
	WebElement checkRegBtn;
	
	@FindBy(linkText="TV")
	WebElement tvBtn;
	
	@FindBy(linkText="Add to Wishlist")
	WebElement addWishlistBtn;
	
	@FindBy(xpath="//button[@title='Share Wishlist']/span/span")
	WebElement wishListBtn;
	
	@FindBy(id="email_address")
	WebElement shareEmailAddBtn;
	
	@FindBy(xpath="//button[@title='Share Wishlist']")
	WebElement shareBtn;
	
	

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
	
	public void setRegMailId(String umail)
	{
		RegemailBtn.sendKeys(umail);	
	}
	
	public void setRegpwd(String upwd)
	{
		RegPwdBtn.sendKeys(upwd);
	}
	
	public void selectLogin()
	{
		LoginBtn.click();
	}
	
	public void selectMyOrder()
	{
		myOrderBtn.click();
	}
	
	public void selectViewOrderBtn()
	{
		viewordBtn.click();
	}
	public String getOrderStatus()
	{
		return ordStatusBtn.getText();
	}
	
	public void selectPrintOrder()
	{
		printOrdBtn.click();	
	}
	
	public void  selectaccountBtn()
	{
		accountBtn.click();
	}
	
	public void selectMyAccBtn()
	{
		myAccountBtn.click();
	}
	
	public void selectCreateAccount()
	{
		CreateAccBtn.click();
	}
	
	public void setFirstName()
	{
		firstNameBtn.sendKeys("prakash");
	}
	
	public void setLastName()
	{
		lastNameBtn.sendKeys("B");
	}
	
	public void setemailAdd()
	{
		emailAddBtn.sendKeys("prakashb@gmail.com");
	}
	
	public void setPassword()
	{
		pwdBtn.sendKeys("prakashb");
	}
	
	public void selectConformation()
	{
		confirmBtn.sendKeys("kirankiran");	
	}
	
	public void selectRegister()
	{
		registerBtn.click();
	}
	
	public String getRegCode()
	{
		return checkRegBtn.getText();
	}
	
	public void selectTV()
	{
		tvBtn.click();
	}
	
	public void selectAddWishList()
	{
		addWishlistBtn.click();
	}
	
	public void selectShareWishlist()
	{
		wishListBtn.click();
	}
	
	public void setshareMailId()
	{
		shareEmailAddBtn.sendKeys("ramakrishna@gmail.com");	
	}
	
	public void selectShareBtn()
	{
		shareBtn.click();
	}
	
	public String randomString()
	{
		String generatedString= RandomStringUtils.randomAlphabetic(8);
		return generatedString;
		
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




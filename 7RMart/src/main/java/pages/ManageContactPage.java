package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage 
{
	WebDriver driver;
	//@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement moreinfomanagecontact;
	@FindBy(xpath="//a[@role='button']")WebElement actionbutton;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//textarea[@name='address']")WebElement address;
	@FindBy(xpath="//textarea[@name='del_time']")WebElement deliverytime;
	@FindBy(xpath="//input[@name='del_limit']")WebElement deliverychargelimit;
	@FindBy(xpath="//button[@name='Update']")WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	
	public ManageContactPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public void moreInfoManageContact() 
	{
		moreinfomanagecontact.click();
	}*/
	public ManageContactPage actionButtonClickMoreInfo() 
	{
		actionbutton.click();
		return this;
	}
	public ManageContactPage updatePhoneManageContact(String phoneno)
	{
		phone.clear();
		phone.sendKeys(phoneno);
		return this;
		
	}
	public ManageContactPage updateEmailManageContact(String newemail)
	{
		email.clear();
		email.sendKeys(newemail);
		return this;
	}
	public ManageContactPage updateAddressManageContact(String newaddress)
	{
		address.clear();
		address.sendKeys(newaddress);
		return this;
	}
	public ManageContactPage updateDeliveryTimeManageContact(String time)
	{
		deliverytime.clear();
		deliverytime.sendKeys(time);
		return this;
	}
	public ManageContactPage updateDeliveryChargeLimitManageContact(String chargelimit)
	{
		deliverychargelimit.clear();
		deliverychargelimit.sendKeys(chargelimit);
		return this;
		
	}
	public ManageContactPage updateManageContact()
	{
		update.click();
		return this;
	}
	public boolean alertdisplay()
	{
		 return alert.isDisplayed();
		
	}
	
}

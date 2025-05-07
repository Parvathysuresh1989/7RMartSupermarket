package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage
{
	WebDriver driver;
	//@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")WebElement moreinfomanagefooter;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement actionbutton;
	@FindBy(xpath="//textarea[@name='address']")WebElement address;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//button[@name='Update']")WebElement submit;
	@FindBy(xpath="//button[@data-dismiss='alert']")WebElement alert;
	public ManageFooterTextPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public ManageFooterTextPage actionButtonCheck()
	{
		if(actionbutton.isDisplayed())
			System.out.println("action button displayed");
		else
			System.out.println("no button");
		return this;
		
	}
	/*public ManageFooterTextPage moreInfoClick()
	{
		moreinfomanagefooter.click();
		return this;
	}*/
	public ManageFooterTextPage actionButtonClick()
	{
		actionbutton.click();
		return this;
		
	}
	public ManageFooterTextPage updateAddress(String addresstoadd)
	{
		address.clear();
		address.sendKeys(addresstoadd);
		return this;
		
	}
	public ManageFooterTextPage updateEmail(String newemail)
	{
		email.clear();
		email.sendKeys(newemail);
		return this;
	}
	public ManageFooterTextPage updatephone(String newphone)
	{
		phone.clear();
		phone.sendKeys(newphone);
		return this;
	}
	public ManageFooterTextPage submit()
	{
		submit.click();
		return this;
	}
	
	public boolean alertdisplay()
	{
		 return alert.isDisplayed();
		
	}
}

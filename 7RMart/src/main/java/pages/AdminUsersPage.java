package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import utilities.PageUtility;

public class AdminUsersPage 
{
	
	
	WebDriver driver;
	//@FindBy(xpath="//a[@class='small-box-footer'][1]")WebElement moreinfoadminuser;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")WebElement savebutton;
	@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
	@FindBy(xpath="//button[@type='button']")WebElement closealert;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public void adminUsersMoreInfo()
	{
		moreinfoadminuser.click();
	}*/
	public AdminUsersPage clickNew()
	{
		newbutton.click();
		return this;
	}
	public AdminUsersPage enterUserName(String uname)
	{
		username.sendKeys(uname);
		return this;
	}
	public AdminUsersPage enterPassword(String pwd)
	{
		password.sendKeys(pwd);
		return this;
	}
	public AdminUsersPage selectUserType()
	{
		usertype.click();
		Select select=new Select(usertype);
		select.selectByIndex(1);
		//PageUtility pageutility=new PageUtility();
		//pageutility.selectByIndex(usertype, 1);//using pageUtility
		return this;
	}
	public AdminUsersPage clickSaveButton()
	{
		savebutton.click();
		return this;
	}
	public boolean isAlertDisplayed() 
	{
		return alert.isDisplayed();
	}
	public void closeAlert()
	{
		closealert.click();
	}
	
}


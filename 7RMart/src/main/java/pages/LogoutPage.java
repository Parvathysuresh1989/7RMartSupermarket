package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	WebDriver driver;
	@FindBy(xpath="//img[@alt='User Image'and @class='img-circle']")WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement signinpage;
	@FindBy(xpath="//a[@class='small-box-footer'][1]")WebElement moreinfoadminuser;
	@FindBy(xpath="((//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-category')])[3])")WebElement moreinfomanagecategory;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement moreinfomanagecontact;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")WebElement moreinfomanagefooter;
	@FindBy(xpath="(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-news')])[1]")WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']") WebElement moreinfosubcategory;

	public LogoutPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public AdminUsersPage adminUsersMoreInfo()
	{
		moreinfoadminuser.click();
		return new AdminUsersPage(driver);
	}
	public ManageCategoryPage manageCategoryMoreInfoClick() 
	{
		moreinfomanagecategory.click();
		return new ManageCategoryPage(driver);
	}
	public ManageContactPage moreInfoManageContact() 
	{
		moreinfomanagecontact.click();
		return new ManageContactPage(driver);
	}
	public ManageFooterTextPage moreInfoClick()
	{
		moreinfomanagefooter.click();
		return new ManageFooterTextPage(driver);
	}
	public ManageNewsPage manageNewsMoreinfoClick()
	{
		managenewsmoreinfo.click();
		return new ManageNewsPage(driver);
	}
	public SubCategoryPage moreInfoSubcategory() 
	{
		moreinfosubcategory.click();
		return new SubCategoryPage(driver);
	}
	public void clickAdmin()
	{
		admin.click();
	}
	public void clickLogout()
	{
		logout.click();
	}
	public boolean isSigninPageLoaded()
	{
		return signinpage.isDisplayed();
	}
}

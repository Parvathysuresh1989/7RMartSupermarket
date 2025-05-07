package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage 
{
	WebDriver driver;
	//@FindBy(xpath="((//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-category')])[3])")WebElement moreinfomanagecategory;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//input[@id='category']")WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement discount;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//input[@name=\"top_menu\"and @value='yes' ]")WebElement topmenu;
	@FindBy(xpath="//input[@name='show_home' and @value='yes']")WebElement leftmenu;
	@FindBy(xpath="//button[@name='create' and @type='submit']")WebElement save;
	//@FindBy(xpath="//div[@class='btn btn-danger']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	public ManageCategoryPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public ManageCategoryPage manageCategoryMoreInfoClick() 
	{
		moreinfomanagecategory.click();
		return this;
	}*/
	public ManageCategoryPage manageCategoryNewButtonClick()
	{
		newbutton.click();
		return this;
	}
	public ManageCategoryPage category(String categoryvalue)
	{
		category.sendKeys(categoryvalue);
		return this;
	}
	public ManageCategoryPage selectGroup()
	{
		discount.click();
		return this;
	}
	public ManageCategoryPage uploadImage()
	{
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		
		fileuploadutility.fileUploadUsingSendKeys(choosefile,Constants.TESTIMAGEFILE);
		return this;
	}
	/*public void showOnTopMenu()
	{
		topmenu.click();
	}
	public void showOnLeftMenu()
	{
		leftmenu.click();
	}*/
	public ManageCategoryPage saveButtonClick()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", save);
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();*/
		//WaitUtility waitutility=new WaitUtility();
		//waitutility.waitForElementToBeClickable(driver, save);
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();*/
		//PageUtility pageutility=new PageUtility();
		//pageutility.javaScriptClick(save,driver);*/
		return this;
	}
	public boolean alertdisplay()
	{
		return alert.isDisplayed();
	}
}

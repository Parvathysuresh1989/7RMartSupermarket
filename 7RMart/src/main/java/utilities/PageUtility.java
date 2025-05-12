package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import utilities.ExcelUtilities;
//import pages.LoginPage;
// help page class
public class PageUtility 
{
	WebDriver driver;
	
	
	
	
	public void selectByIndex(WebElement element,int index) 
	{
		Select select =new Select(element);
		select.selectByIndex(index);
		
	}
	public void selectByValue(WebElement element, String value)
	{
		Select select =new Select(element);
		select.selectByValue(value);
	}
	public void selectByVisibleText(WebElement element, String visibletext)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
	}
	public void dragAndDrop(WebElement element1,WebElement element2)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(element1, element2).build().perform();
		
	}
	public void moveToElement(WebElement element1)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element1).build().perform();
	}
	public void contextClick(WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).build().perform();
	}
	public void doubleClick(WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).build().perform();
	}
	public void acceptAlert() 
	{
		driver.switchTo().alert().accept();
	}
	public void dismissAlert()
	{
		driver.switchTo().alert().dismiss();
	}
	public boolean alertdisplay(WebElement alert)
	{
		 return alert.isDisplayed();
		
	}
	public void javaScriptClick(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
}


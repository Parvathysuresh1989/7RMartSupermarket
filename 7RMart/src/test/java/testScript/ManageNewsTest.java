package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;
//import utilities.PageUtility;

public class ManageNewsTest extends Base
{
	LogoutPage logoutpage;
	ManageNewsPage managenewspage;
	@Test(groups= {"regression"},description="Adding new news")
	public void manageNews() throws Exception
	{
		//String username="admin";
		//String password="admin";
		//String text="hai";
		String username=ExcelUtilities.readStringData(1, 0, "managenews");
		String password=ExcelUtilities.readStringData(1, 1,"managenews");
		String text=ExcelUtilities.readStringData(1, 2, "managenews");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username).enterPassword(password);
		//loginpage.enterPassword(password);
		logoutpage=loginpage.clickSignIn();
		
		//ManageNewsPage managenewspage=new ManageNewsPage(driver);
		
		managenewspage=logoutpage.manageNewsMoreinfoClick().clickNews().enterNews(text).saveButtonclick();
		/*managenewspage.clickNews();
		managenewspage.enterNews(text);
		managenewspage.saveButtonclick();*/
		
		boolean alertmessage=managenewspage.alertdisplay();
		Assert.assertTrue(alertmessage);
	}
}
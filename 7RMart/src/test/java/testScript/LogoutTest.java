package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtilities;

public class LogoutTest extends Base
{
	LogoutPage logoutpage;
	
	@Test(groups= {"regression"},description="logout from website")
	public void logOutMethod() throws Exception
	{
		String username=ExcelUtilities.readStringData(1, 0, "loginpage");
		String password=ExcelUtilities.readStringData(1, 1,"loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username).enterPassword(password);
		//loginpage.enterPassword(password);
		logoutpage=loginpage.clickSignIn();
		//LogoutPage logoutpage=new LogoutPage(driver);
		logoutpage.clickAdmin();
		logoutpage.clickLogout();
		boolean issigninpageloaded=logoutpage.isSigninPageLoaded();
		Assert.assertTrue(issigninpageloaded);
				
	}
}

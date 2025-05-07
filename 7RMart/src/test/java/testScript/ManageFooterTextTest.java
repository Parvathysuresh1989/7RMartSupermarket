package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilities;

public class ManageFooterTextTest extends Base
{
	LogoutPage logoutpage;
	ManageFooterTextPage managefootertextpage;
	@Test(groups= {"regression"},description="check if action button is present")
	public void checkifActionButtonIsPresent() throws Exception
	{
		String username=ExcelUtilities.readStringData(1, 0, "loginpage");
		String password=ExcelUtilities.readStringData(1, 1,"loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username).enterPassword(password);
		//loginpage.enterPassword(password);
		logoutpage=loginpage.clickSignIn();
		//ManageFooterTextPage managefootertextpage=new ManageFooterTextPage(driver);
		managefootertextpage=logoutpage.moreInfoClick().actionButtonCheck();
		//managefootertextpage.actionButtonCheck();
	}
	@Test(groups= {"regression"},description="update address,phone and email")
	public void manageFooter() throws Exception
	{
		String username=ExcelUtilities.readStringData(1, 0, "loginpage");
		String password=ExcelUtilities.readStringData(1, 1,"loginpage");
		String address=ExcelUtilities.readStringData(1, 0, "footertext");
		String email=ExcelUtilities.readStringData(1, 1,"footertext");
		String phoneno=ExcelUtilities.readIntegerData(1, 2,"footertext");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username).enterPassword(password);
		//loginpage.enterPassword(password);
		logoutpage=loginpage.clickSignIn();
		//ManageFooterTextPage managefootertextpage=new ManageFooterTextPage(driver);
		managefootertextpage=logoutpage.moreInfoClick().actionButtonClick().updateAddress(address).updateEmail(email).updatephone(phoneno).submit();
		/*managefootertextpage.actionButtonClick();
		managefootertextpage.updateAddress(address);
		managefootertextpage.updateEmail(email);
		managefootertextpage.updatephone(phoneno);
		managefootertextpage.submit();*/
		boolean alertmessage=managefootertextpage.alertdisplay();
		Assert.assertTrue(alertmessage);
		
	}
	
}

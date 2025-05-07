package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base
{
	LogoutPage logoutpage;
	ManageCategoryPage managecategorypage;
	@Test(groups= {"regression"},description="Mange category uploading image",retryAnalyzer=retry.Retry.class)
	public void manageCategory() throws Exception
	{
		FakerUtility fakerutility=new FakerUtility();
		String username=ExcelUtilities.readStringData(1, 0, "loginpage");
		String password=ExcelUtilities.readStringData(1, 1,"loginpage");
		//String category="foodfood";
		String category=fakerutility.creatARandomFirstName();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username).enterPassword(password);
		//loginpage.enterPassword(password);
		logoutpage=loginpage.clickSignIn();
		//ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
		managecategorypage=logoutpage.manageCategoryMoreInfoClick().manageCategoryNewButtonClick().category(category).selectGroup().uploadImage().saveButtonClick();
		/*managecategorypage.manageCategoryNewButtonClick();
		managecategorypage.category(category);
		managecategorypage.selectGroup();
		managecategorypage.uploadImage();
		//managecategorypage.showOnTopMenu();
		//managecategorypage.showOnLeftMenu();
		//managecategorypage.showOnLeftMenu();
		managecategorypage.saveButtonClick();*/
		boolean isalertdisplayed=managecategorypage.alertdisplay();
		Assert.assertTrue(isalertdisplayed);
	}
}

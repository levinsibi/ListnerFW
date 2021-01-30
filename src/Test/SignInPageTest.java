package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.DriverFactory;
import Base.ExtentManager;
import Base.ExtentTestManager;
import Base.LocalDriverManager;
import Base.TestBase;
import Pages.BasePage;
import Pages.SignInPage;

public class SignInPageTest extends ExtentManager {

	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;

	@BeforeClass
	public void setUp() {
		driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void verifySignInFunction() {
		System.out.println("Sign In functionality details...");
		basePage = new BasePage(driver);
		signInPage = basePage.clickSignInBtn();
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
		Assert.assertTrue(signInPage.verifySignInPageText(), "Page text not matching");
		Assert.assertTrue(signInPage.verifySignIn(), "Unable to sign in");
	}

	@Test
	public void SignInPageTestOne() {
		System.out.println("Hey im in example test One");
	}

	@Test
	public void SignInPageTestTwo() {
		System.out.println("Hey im in example test two");
	}

	@Test
	public void SignInPageTestThree() {
		System.out.println("Hey im in example test three");
	}
	@AfterClass
	public void tearDown() {
		extent.flush();
		ExtentManager.getInstance().flush();
		
		DriverFactory.getInstance().removeDriver();
	}
}
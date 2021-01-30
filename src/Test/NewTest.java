package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Base.LocalDriverManager;

public class NewTest {
  @Test
  public void f() {
	  
	  LocalDriverManager.getDriver().get("https://www.google.com/");
  }
}

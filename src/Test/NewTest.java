package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
	  WebDriver d=new ChromeDriver();
	  d.get("https://www.google.com/");
  }
}

package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

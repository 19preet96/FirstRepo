package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.google.com"); //.to navigate is same as .get
		
		driver.navigate().to("https://www.google.com");
		

	}

}

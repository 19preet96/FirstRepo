package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		
		driver.manage().window().maximize();
		
		

	}

}

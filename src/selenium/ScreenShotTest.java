package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("C:/Learning/Program/screenshot.png"));
		

	}

}

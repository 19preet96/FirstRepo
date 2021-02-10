package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\Learning\\testing\\prop.properties"); // get property file and save it to f
		Properties prop = new Properties();												   // makes reference for property class
		prop.load(f);																	   // loads that file f into prop reference
		
		//String browser = "Chrome"; //using file instead of hardCode
		
		String browser = prop.getProperty("browser");
		
		WebDriver driver;
		
		
		if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
			driver = new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Learning/Program/SeleniumJars/chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else {
			
			System.out.println("Incompatible browser. Switching to Firefox");
			System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		
			
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("jxh");
		driver.findElement(By.xpath("//div/input[@class='inputtext _55r1 _6luy' and @name='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//div/button[starts-with(@id,'u_0')]")).click();
		
		
		

	
		
		
	}

}

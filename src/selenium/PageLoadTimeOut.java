package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PageLoadTimeOut {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //waits for max 10 secs for page to load

		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("Harper");
		driver.findElement(By.name("reg_email__")).sendKeys("647123134"); ///april/20/2000
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(3);
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("20");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("2000");
		
		
		
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}

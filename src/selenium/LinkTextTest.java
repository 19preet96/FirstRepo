package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10); //using explicit wait
		
		driver.get("https://www.google.ca");

		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("About")).click();
		
		//wait.until(ExpectedConditions.titleContains("About")); //contains some part
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News")); //full title given
		wait.until(ExpectedConditions.urlToBe("https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header")); //wait until url matches
		
		//Thread.sleep(2000);
		
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		String expectedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(expectedTitle.equals(actualTitle) && expectedUrl.equals(actualUrl)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		

	}

}

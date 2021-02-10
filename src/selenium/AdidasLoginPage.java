package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		
		driver.findElement(By.id("login-email")).sendKeys("p@gmaail.com");
		driver.findElement(By.id("login-password")).sendKeys("password123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		String expErr = "Incorrect email/password – please check and retry";
		
		String actErr = driver.findElement(By.xpath("//div[@class='gl-vspace-bpall-small']/div")).getText();
		
		if(expErr.equals(actErr)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}

	}

}

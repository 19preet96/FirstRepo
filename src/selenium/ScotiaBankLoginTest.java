package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest extends Object {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("jackharper");
		driver.findElement(By.id("password-input")).sendKeys("password");
		driver.findElement(By.xpath("//span[@class='ButtonCore__block']")).click();
		
		Thread.sleep(2000);
		
		String expectedErr = "Please check your card number / username or password and try again.";
		
		//String actualErr = driver.findElement(By.xpath("//div[@id='globalError']/div/div[2]")).getText();
		String actualErr = driver.findElement(By.id("globalError")).getText();
		
		System.out.println(actualErr);
		
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		
		

	}

}

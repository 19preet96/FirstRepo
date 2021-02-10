package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookOwnTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
				
		
		String result = loginFB("Preet123@gmail.com", "Dhaliwal123");
		System.out.println(result);

	}
	
	//Creating a function for LogingIn
	
	public static String loginFB(String userName, String passWord) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys(userName);
		driver.findElement(By.xpath("//div/input[@class='inputtext _55r1 _6luy' and @name='pass']")).sendKeys(passWord);
		driver.findElement(By.xpath("//div/button[starts-with(@id,'u_0')]")).click();
		Thread.sleep(10000);
		
		String actualTitle = driver.getTitle();
		String expTitle = "Log into Facebook";
		
		
		if(actualTitle.equals(expTitle)) {
			return("Test Passed");
		}else {
			return("Test Failed");
		}
		
	}

}

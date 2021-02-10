package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Learning/Program/SeleniumJars/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		
		//works with xpath too
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("jxh");
		driver.findElement(By.xpath("//div/input[@class='inputtext _55r1 _6luy' and @name='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//div/button[starts-with(@id,'u_0')]")).click();
		

	}

}

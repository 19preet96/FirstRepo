package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWorkLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://secure4.store.apple.com/ca/shop/signIn/account?c=aHR0cHM6Ly93d3cuYXBwbGUuY29tL2NhL3Nob3B8MWFvc2Q5NDkyMDExMTc1ZDQ0YzgzMGNkYTAwOTBjNzFjMmRhNzgzNTczNGI&r=SDHCD9JUYKX777H9KT9JT7JJTAPAXHFKH&s=aHR0cHM6Ly9zZWN1cmU0LnN0b3JlLmFwcGxlLmNvbS9jYS9zaG9wL2FjY291bnQvc2V0dXAvc3RhcnRfZGVmYXVsdD9wbHRuPTc2M0YxMzIxfDFhb3NkZmYyYzg5ZjEyNWQ2YzY0NjFkY2Y1YzBmMjFkZGE5MmY4NDRhNmI4");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("aid-auth-widget-iFrame");
		
		WebElement inputF = driver.findElement(By.id("account_name_text_field"));
		
		inputF.sendKeys("p@icloud.com");
		Thread.sleep(1000);
		//driver.findElement(By.id("sign-in")).click();
		inputF.sendKeys(Keys.ENTER);
		

	}

}

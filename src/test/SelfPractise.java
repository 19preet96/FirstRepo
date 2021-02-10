package test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelfPractise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Learning/Program/SeleniumJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://cloud.amicusattorney.com/");
		
		WebElement email = driver.findElement(By.id("tbEmail"));
		
		email.sendKeys("jdee@ggqaj1.1law.pro");
		
		WebElement pass = driver.findElement(By.id("tbPwd"));
		
		pass.sendKeys("Password123$");
		
		WebElement remCheckBox = driver.findElement(By.id("cbRememberMe"));
		
		
		if(!(remCheckBox.isSelected())) {
			remCheckBox.click();
			
		}
		
		WebElement loggedCheckBox = driver.findElement(By.id("cbTimeToLive"));
		
		if(!(loggedCheckBox.isSelected())) {
			loggedCheckBox.click();
		}
		
		WebElement dropDown = driver.findElement(By.id("ddTimeToLive"));
		
		Select s = new Select(dropDown);
		
		s.selectByVisibleText("2 days");
		
		driver.findElement(By.id("btLogin")).click();
		
		//Thread.sleep(8000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("span")));
		
		List<WebElement> ifPop = driver.findElements(By.xpath("//span[contains(text(),'Continue To Login Anyway')]"));
		
		if(ifPop.size()>0) {
			ifPop.get(0).click();
			
		}
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("startingAmicusCloudProgress")));
		WebElement logout = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));

		logout.click();
		
		List <WebElement> ifLogOut = driver.findElements(By.id("lblOutput"));
		
		if(ifLogOut.size()>0) {
			System.out.println(ifLogOut.get(0).getText());
			System.out.println("Logout was succesfull");
			System.out.println("Test Passed.");
		}else {
			System.out.println("Logout was unsuccesfull.");
		}
		
		
		driver.close();

	}

}

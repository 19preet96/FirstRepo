package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipCartTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions builder = new Actions(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> ifPop = driver.findElements(By.xpath("//div[@class='_2QfC02']/button"));
		
		//Thread.sleep(5000); //for checking if pop-up does not come
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='_2QfC02']/button")))); //explicit wait
		
		if(ifPop.size()>0) {
			driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		}
		
		
		//Hovering On Mens Option
		WebElement Mens = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		builder.moveToElement(Mens).build().perform();  
		
		Thread.sleep(3000);
		
		//List of Elements Under Men Option
		List<WebElement> menOptions = driver.findElements(By.xpath("(//div/div[@class='_1fwVde'])[1]/a"));
		
	
		driver.findElement(By.xpath("//div/div[@class='_1fwVde']/a"));
		
		System.out.println(menOptions.size());
		
		
		for(int i=1;i<=9;i++)
		{
			System.out.println(menOptions.get(i).getText());
		}
		
		
		driver.close();
		
		
		
		
		

	}

}

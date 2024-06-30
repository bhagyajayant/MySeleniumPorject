package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForMultipleElements {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By topLinks= By.cssSelector("div#navbar-collapse a");
		
		int topLinksCount=waitForPresenceOfElementsLocated(topLinks,10).size();
		
		System.out.print(topLinksCount);
		
		
		//System.out.println(topLinkslist.size());
		
	}

	public static List<WebElement> waitForPresenceOfElementsLocated(By locator, int timeout) {
			
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
		}
	
	public static List<WebElement> waitForVisibilityOfElementsLocated(By locator, int timeout) {
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

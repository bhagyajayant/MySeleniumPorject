package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebElementConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create a webelement(FE),perform some action(click,sendkeys,getText,isDosplayed,etc..)
		// sendkey is to enter text in text field.
		//below are called locators.
	//1.
		
	//	driver.findElement(By.id("input-email")).sendKeys("bhagya@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
	//2.findElement return type is webelement
		/*
		 * WebElement emailid= driver.findElement(By.id("input-email")); WebElement
		 * password= driver.findElement(By.id("input-password"));
		 * 
		 * emailid.sendKeys("bhagya@gmail.com"); password.sendKeys("test@123");
		 */
		
	//3.By locator :
	/*
	 * By emailid=By.id("input-email"); By password=By.id("input-password");
	 * 
	 * WebElement emaild_ele=driver.findElement(emailid); WebElement
	 * pwd_ele=driver.findElement(password);
	 * emaild_ele.sendKeys("bhagya@gmail.com"); pwd_ele.sendKeys("test@123");
	 */
		
	}

}

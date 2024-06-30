package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConceptWithExceptions {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//when webelement is not found, "No such Element Found"(NSE) exception is thrown.
		/*
		 * try { driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
		 * } catch (NoSuchElementException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		driver.findElement(By.id("input-password")).sendKeys(null);// never pass null in quotes, and we should never pass null as it throws "illegal argument exception" exception.
																// we should always pass non null string to sendkeys

	}

}

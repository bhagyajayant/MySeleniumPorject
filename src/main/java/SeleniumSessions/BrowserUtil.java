package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	// in this class all browser related actions will be written here.
	
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("the browser name is :" +browserName);
		switch (browserName.trim().toLowerCase()) {
		
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			
			System.out.println("Please pass the right browser:" + browserName);
			
			throw new BrowserException("invalid browser" + browserName);
	
		
		}
		
		return driver;
	}
	
	public void launchURL(String url) {
		
		if(url==null) {
			throw new BrowserException("invalid url" + url);
		}
		if(url.isBlank()|| url.isEmpty()) {
			throw new BrowserException("Blank or Empty url" + url);
		}
		if(url.indexOf("http")!=0 || url.indexOf("http")>0) {
			throw new BrowserException("HTTp(s) is missing" + url);
		}
		
		driver.get(url.trim());
		
		
	}
	public String getPageTitle() {
		
		String title=driver.getTitle();
		if(title==null) {
			System.out.println("null title is displayed");
			return null;
		}
		return title;
		 
	}
	public String getPageCurrentUrl() {
		
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}
	
	
}

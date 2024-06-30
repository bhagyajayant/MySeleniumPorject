package SeleniumSessions;

import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1.valid and recommended - Local execution
		//WebDriver driver= new ChromeDriver();
		
		//2.Valid but not recommended bcoz through this interface i can access only 2 methods FindElement() & FindElements()
		//SearchContext driver= new ChromeDriver();
		
		//3.Valid and recommended
		
		//RemoteWebDriver driver = new ChromeDriver();
		
		//4.valid and recommended for remote execution(AWS,CLouds,VM,remote)with sele GRID
	//	WebDriver Driver= new RemoteWebDriver(remoteAdress,capabilities);
		
		//5.valid but not recommended
		
		//SearchContext driver=new RemoteWebDriver(remoteAdress,capabilities);
		
		//6.Valid but not recommended bcoz(only for 2 browsers: Edge and Chrome)
	//	ChromiumDriver driver=new ChromeDriver();
		//driver = new EdgeDriver();
	//	driver = new FirefoxDriver(); this cant be used as Firefox borwser is not parent or child of Chromium
		
		//7.Not Valid
		//RemoteWebDriver driver= new ChromiumDriver();
		
		
	}

}

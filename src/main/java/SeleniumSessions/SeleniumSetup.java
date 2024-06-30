package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {

	public static void main(String[] args) {
		
		// this is for sele version< 4.6.0
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rusti\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		// selenium- before 4.6.0, we need to use setproperty.
		
		//selenium manager:4.6.0 + (auto binary management.auto server management), it will automatically start server.
		//will check the current chrome browser version in your system.
		//will download the respective chromedriver.exe version from vendor dashboard
		//will start server(.exe), no need to setup any setproperty.
		//.cache foler: maintain all .exe files(browsers)
		
		
	}

}

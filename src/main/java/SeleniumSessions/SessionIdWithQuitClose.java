package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdWithQuitClose {

	public static void main(String[] args) {
		
		
		//open the browser
				WebDriver driver = new ChromeDriver();
		//open url
				driver.get("https:\\www.google.com"); 
		//getting page title.
				
				String title= driver.getTitle();
				System.out.println("page title is :"+ title);
				
				String url=driver.getCurrentUrl();
				System.out.println("current url is: "+ url);
				// closing the browser
				
				//driver.close();
				//driver.quit(); //session id will be Null
				driver.close(); // session id will be invalid
			System.out.println(driver.getTitle());//Session ID is null. Using WebDriver after calling quit()?
			
		
	}

}

package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//open url
		driver.get("https:\\www.amazon.com"); // this method is used to launch the url
		//getting page title.
		
		String title= driver.getTitle();
		System.out.println("page title is :"+ title);
		
		if(title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		String url=driver.getCurrentUrl();
		System.out.println("current url is: "+ url);
		
		if(url.contains("amazon.com")) {
			System.out.println("Url is correct");
		}
		else
		{
			System.out.println("URL is incorrect");
		}
		// closing the browser
		
		//driver.close();
		driver.quit();
	}
	

}
 
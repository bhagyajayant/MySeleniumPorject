package SeleniumSessions;

import java.util.Properties;

//import org.openqa.selenium.WebDriver;

public class OpenClartTesting {

	//In this main..object will be created and util functions are called.. and actual validation will be done here.
	
	
	public static void main(String[] args) {
		
	//		String browser = "chrome";
				
		ReadProperty propreader= new ReadProperty();
		
		Properties prop= propreader.initProp();
		
		BrowserUtil brUtil= new BrowserUtil();
			
		brUtil.launchBrowser(prop.getProperty("browser"));
		
		brUtil.launchURL(prop.getProperty("url"));
		
		String actualtitle=brUtil.getPageTitle();
		
		System.out.println("actual title is " + actualtitle);
		if(actualtitle.equals("Your Store")) {
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		
		String appurl = brUtil.getPageCurrentUrl();
		if(appurl.contains("opencart")) {
			System.out.println("URL is correct"+ appurl);
		}
		else
		{
			System.out.println("URL is incorrect"+ appurl);
		}
		brUtil.quitBrowser();
	}

}

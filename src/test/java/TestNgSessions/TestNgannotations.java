package TestNgSessions;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgannotations {

	@Test
	public void connectwithDB() {
		System.out.println("BS -- connect with DB");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}
	
	
	
	
}

package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resourses.base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	
	public void initilized() throws IOException {
		driver = initializeDriver();
	}
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username, String Password, String text) {
				
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		
		l.getLogin().click(); //driver.findElement(By.css)
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		//System.out.println(text);
		log.info(text);
		
		lp.getLogin().click();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
	
	@DataProvider
	
	public Object[][] getData(){
	//Row stands for how many different data types should be run    
	//Column stands for how many values per each test
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="nonrestricted@gmail.com";
		data[0][1]="123456";
		data[0][2]="Restricted user";
		//1st row
		data[1][0]="restricted@gmail.com";
		data[1][1]="123456";
		data[1][2]="Non Restricted user";
		
		return data;
	}
	
}

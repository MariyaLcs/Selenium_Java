package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resourses.base;
import pageObjects.LandingPage;

public class validateNavigationBar extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	
	public void initilized() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	
	public void validateAppNavigationBar() {
				
		LandingPage l=new LandingPage(driver);
		
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Navigation Bar is displayed");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
}
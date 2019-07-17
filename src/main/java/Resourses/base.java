package Resourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;

public class base {
	
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		//chrome
		//firefox
		//opera
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\mariy\\Desktop\\SWD_Project\\Project\\src\\main\\java\\Resourses\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mariy\\Desktop\\SeleniumWebDriver with Java\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mariy\\Desktop\\SeleniumWebDriver with Java\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}else if (browserName.equals("opera")) {
			System.setProperty("webdriver.opera.driver", "C:\\Users\\mariy\\Desktop\\SeleniumWebDriver with Java\\operadriver.exe");
			driver= new OperaDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(src, new File("C:\\Users\\Desktop\\SWD_Project\\Project\\"+result+"screenshot.png"));
		
	}
	
}

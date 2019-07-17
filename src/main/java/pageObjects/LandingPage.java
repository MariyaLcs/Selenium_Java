package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector("div.navbar.navbar-default.navbar-static-top:nth-child(3) div.container nav.navbar-collapse.collapse ul.nav.navbar-nav.navbar-right li:nth-child(8) > a:nth-child(1)");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar() {
		return driver.findElement(NavBar);
	}

	public WebElement getLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(signin);
	}
}

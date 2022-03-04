package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin= By.xpath("//span[normalize-space()='Login']");
	By title= By.cssSelector("div[class='text-center'] h2");
	By NavBar= By.cssSelector(".nav.navbar-nav.navbar-right");
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 LoginPage lp=new LoginPage(driver);
		 return lp;
		 
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement GetNavBar()
	{
		return driver.findElement(NavBar);
	}



}

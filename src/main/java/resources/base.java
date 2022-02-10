package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException  
	{
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\zilvi\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\data.properties");
		
		prop.load(fis);
	String browserName=	prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		//execute in chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zilvi\\OneDrive\\Desktop\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browserName.equals("firefox")) {
		//execute in firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\zilvi\\OneDrive\\Desktop\\Browser Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
	}
	else if (browserName.equals("gecko")) {
		//execute in internet explorer
		System.setProperty("webdriver.ie.driver", "C:\\Users\\zilvi\\OneDrive\\Desktop\\Browser Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
		
	}

}

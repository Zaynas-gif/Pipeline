package Academy;

import java.io.IOException;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

import resources.base;

public class HomePage extends base {

	

	@Test
	
	public void basePageNavigation() throws IOException 
	{
		driver =initializeDriver();
		driver.get("http://qaclickacademy.com");
		//one is inheritance
		//creating object to thet class and invoke methods of it
		LandingPage 1=new LandingPage()
	}
	
	
		
	
}

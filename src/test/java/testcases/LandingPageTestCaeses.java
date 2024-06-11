package testcases;

import org.testng.annotations.Test;

import pages.LandingPage;
import utilities.BaseDriver;

public class LandingPageTestCaeses extends BaseDriver{
	
	LandingPage landingPageObj = new LandingPage();
	
	@Test
	public void appRun() throws InterruptedException{
		
		Thread.sleep(10000);
		
	}

}

package testcases;

import org.testng.annotations.Test;

import pages.LandingPage;
import utilities.BaseDriver;

public class LandingPageTestCaeses extends BaseDriver{
	
	LandingPage landingPageObj = new LandingPage();
	
	@Test
	public void ButtonVerifyZero() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.ZERO_DIGIT_BUTTON, "0", driver);
		
	}
	
	@Test
	public void ButtonVerifyOne() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.ONE_DIGIT_BUTTON, "1", driver);
		
	}
	
	@Test
	public void ButtonVerifyTwo() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.TWO_DIGIT_BUTTON, "2", driver);
		
	}
	
	@Test
	public void ButtonVerifyThree() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.THREE_DIGIT_BUTTON, "3", driver);
		
	}
	
	@Test
	public void ButtonVerifyFour() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.FOUR_DIGIT_BUTTON, "4", driver);
		
	}
	
	@Test
	public void ButtonVerifyFive() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.FIVE_DIGIT_BUTTON, "5", driver);
		
	}
	
	@Test
	public void ButtonVerifySix() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.SIX_DIGIT_BUTTON, "6", driver);
		
	}
	
	@Test
	public void ButtonVerifySeven() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.SEVEN_DIGIT_BUTTON, "7", driver);
		
	}
	
	@Test
	public void ButtonVerifyEight() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.EIGHT_DIGIT_BUTTON, "8", driver);
		
	}
	
	@Test
	public void ButtonVerifyNine() throws InterruptedException{
		
		landingPageObj.numberVerifier(landingPageObj.NINE_DIGIT_BUTTON, "9", driver);
		
	}
	
	


}

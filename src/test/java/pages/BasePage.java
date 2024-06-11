package pages;

import static org.testng.Assert.assertEquals;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Allure;

public class BasePage {
	
	
	public AndroidElement findElement(By locator ,AndroidDriver<AndroidElement> driver) {
		return  driver.findElement(locator);
	}


	public void writeText(By locator , String text ,AndroidDriver<AndroidElement> driver) {
		findElement(locator , driver).sendKeys(text);
	}
	

	public String getText(By locator , AndroidDriver<AndroidElement> driver) {
		
		return driver.findElement(locator).getText();
		
	}

	public void hover(By locator, AndroidDriver<AndroidElement> driver) {
		Actions action =  new Actions(driver);
		action.moveToElement(findElement(locator , driver)).perform();
	}

	public void assertionHard(By locator, String expected , AndroidDriver<AndroidElement> driver) {
		assertEquals(getText(locator,driver), expected);
	}

	   public String removeCommas(String inputString) {
	        if (inputString == null) {
	            return null; 
	        }
        
	        return inputString.replaceAll(",", "");
	    }
	public void assertionSoft(By locator, String expected , AndroidDriver<AndroidElement> driver) {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(removeCommas(getText(locator , driver)), expected);
		softAssert.assertAll();
	}
	
	
	public void dropDownSelectByVisibleText(By locator, String text,AndroidDriver<AndroidElement> driver) {
		Select select = new Select(findElement(locator,driver));
		select.selectByVisibleText(text);
	}

	public void dropDownSelectByValue(By locator, String text , AndroidDriver<AndroidElement> driver) {
		Select select = new Select(findElement(locator,driver));
		select.selectByValue(text);
	}

	public void dropDownSelectByIndex(By locator, int index , AndroidDriver<AndroidElement> driver) {
		Select select = new Select(findElement(locator,driver));
		select.selectByIndex(index);

	}

	public void dropDownDeselectByVisibleText(By locator, String text,AndroidDriver<AndroidElement> driver) {
		Select select = new Select(findElement(locator,driver));
		select.deselectByVisibleText(text);
	}

	public void dropDownDeselectByValue(By locator, String text,AndroidDriver<AndroidElement> driver) {
		Select select = new Select(findElement(locator,driver));
		select.deselectByValue(text);
	}

	public void dropDownDeselectByIndex(By locator, int index,AndroidDriver<AndroidElement> driver) {
		Select select = new Select(findElement(locator,driver));
		select.deselectByIndex(index);

	}



	public void visibilityTest(By locator, AndroidDriver<AndroidElement> driver) {
		try {
			if(findElement(locator,driver).isDisplayed()) {

				Thread.sleep(3000);
			}
		} catch (Exception e) {
			System.out.println("The locator is not visible!!!!!!");
		}

	}


	public void tabOnEnterOnKeyboard(AndroidDriver<AndroidElement> driver) {
		Actions action =  new Actions(driver);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
	}

	public void keyboardSelectAll(By locator,AndroidDriver<AndroidElement> driver) {
		Actions action =  new Actions(driver);
		findElement(locator,driver).click();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

	}

	public void keyboardBackspace(AndroidDriver<AndroidElement> driver) {
		Actions action =  new Actions(driver);
		action.keyDown(Keys.BACK_SPACE);
		action.build().perform();
	}

	public void keyboardCopy(By locator,AndroidDriver<AndroidElement> driver) {
		Actions action =  new Actions(driver);
		keyboardSelectAll(locator,driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

	}

	public void keyboardPaste(By locator ,AndroidDriver<AndroidElement> driver) {
		Actions action =  new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
	}

	public void scrollingDownTillElementFound(By locator ,AndroidDriver<AndroidElement> driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", findElement(locator,driver));

	}

	public void scrollHorizontally(By locator,AndroidDriver<AndroidElement> driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", findElement(locator,driver));

	}

	public void scrollUp(AndroidDriver<AndroidElement> driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
	}

	public void scrollUpAndDown(AndroidDriver<AndroidElement> driver, int loopnumberForScrollDown,int loopnumberForScrollUp, boolean scrollDown, boolean scrollUp) {

		if (scrollDown = true) {
			for (int i = 0; i < loopnumberForScrollDown; i++) {
				int screenHeight = driver.manage().window().getSize().getHeight();
				int screenWidth = driver.manage().window().getSize().getWidth();
				int startY = (int) (screenHeight * 0.8); // Start from 80% of the screen height
				int endY = (int) (screenHeight * 0.2); // End at 20% of the screen height
				int centerX = screenWidth / 2;

				TouchAction touchAction = new TouchAction(driver);
				touchAction.press(PointOption.point(centerX, startY))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))) // Adjust wait time as needed
						.moveTo(PointOption.point(centerX, endY)).release().perform();
				takeScreenShotAllureAttach("Scroll down !!!!!!! ", driver);

			}

		}
		if (scrollUp = true) {
			
			
			for (int i = 0; i < loopnumberForScrollUp; i++) {
				   int screenHeight = driver.manage().window().getSize().getHeight();
			        int screenWidth = driver.manage().window().getSize().getWidth();
			        int startY = (int)  (screenHeight * 0.5);// Start from 80% of the screen height
			        int endY = (int)  (screenHeight * 0.8);  // End at 20% of the screen height (screenHeight * 0.2);
			        int centerX = screenWidth / 2;
			        TouchAction touchAction = new TouchAction(driver);
			        touchAction.press(PointOption.point(centerX, startY))
			                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
			                .moveTo(PointOption.point(centerX, endY))
			                .release()
			                .perform();
			        takeScreenShotAllureAttach("Scroll Up !!!!!!! ", driver);
	        }
	    }
	}

	public void takeScreenShotAllureAttach(String screenshotname ,AndroidDriver<AndroidElement> driver) {
		Allure.addAttachment(screenshotname, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));

	}

   
   public  void waitForVisibilityOfElement(AndroidDriver<AndroidElement> driver, By locator, int timeoutInSeconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public  void waitForElementToBeClickable(AndroidDriver<AndroidElement> driver, By locator, int timeoutInSeconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
   
	    
	  

}

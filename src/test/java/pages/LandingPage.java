package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LandingPage extends BasePage{
	
	
	public String MENU_CHOOSE_THEME_POP_UP_TITTLE_TEXT = "Choose theme";
	public String MENU_HISTORY_TITTLE_TEXT = "History";
	public String MENU_HISTORY_CURRENT_EXPESSION_TEXT = "Current Expression";
	public String MENU_HISTORY_TODAY_TEXT = "Today";
	
	
	public By ZERO_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_0");
	public By ONE_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_1");
	public By TWO_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_2");
	public By THREE_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_3");
	public By FOUR_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_4");
	public By FIVE_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_5");
	public By SIX_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_6");
	public By SEVEN_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_7");
	public By EIGHT_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_8");
	public By NINE_DIGIT_BUTTON = By.id("com.google.android.calculator:id/digit_9");
	
	
	public By DECIMAL_POINT_BUTTON = By.id("com.google.android.calculator:id/dec_point");
	public By DIVISION_OPERATOR_BUTTON = By.id("com.google.android.calculator:id/op_div");
	public By MULTIPLICATION_OPERATOR_BUTTON = By.id("com.google.android.calculator:id/op_mul");
	public By SUBTRACTION_OPERATOR_BUTTON = By.id("com.google.android.calculator:id/op_sub");
	public By ADDITION_OPERATOR_BUTTON = By.id("com.google.android.calculator:id/op_add");
	public By EQUAL_BUTTON = By.id("com.google.android.calculator:id/eq");
	public By REMOVE_BUTTON = By.id("com.google.android.calculator:id/del");
	
	
	public By CALCULATOR_MODE_CHANGE_BUTTON = By.id("com.google.android.calculator:id/mode");
	public By INVERSE_FUNCTION_BUTTON = By.id("com.google.android.calculator:id/toggle_inv");
	public By SWITCH_DEGREES_BUTTON = By.id("com.google.android.calculator:id/toggle_mode");
	public By SIN_BUTTON = By.id("com.google.android.calculator:id/fun_sin");
	public By COS_BUTTON = By.id("com.google.android.calculator:id/fun_cos");
	public By TAN_BUTTON = By.id("com.google.android.calculator:id/fun_tan");
	public By PERCENTAGE_BUTTON = By.id("com.google.android.calculator:id/op_pct");
	public By LOGARITHM_LN_BUTTON = By.id("//android.widget.Button[@content-desc=\"natural logarithm\"]");
	public By LOGARITHM_LOG_BUTTON = By.id("com.google.android.calculator:id/fun_log");
	public By SQUARE_ROOT_BUTTON = By.id("com.google.android.calculator:id/op_sqrt");
	public By POWER_BUTTON = By.id("com.google.android.calculator:id/op_pow");
	public By PI_BUTTON = By.id("com.google.android.calculator:id/const_pi");
	public By EULERS_NUMBER_E_BUTTON = By.id("com.google.android.calculator:id/const_e");
	public By LEFT_PARENTHESIS_BUTTON = By.id("com.google.android.calculator:id/lparen");
	public By RIGHT_PARENTHESIS_BUTTON = By.id("com.google.android.calculator:id/rparen");
	public By FACTORIAL_BUTTON = By.id("com.google.android.calculator:id/op_fact");
	public By DISPLAY_NUMBER_LOCATOR = By.id("com.google.android.calculator:id/formula");
	
	
	
	
	public By THREE_DOT_MENU_BUTTON = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
	public By MENU_HISTORY_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
	public By MENU_CHOOSE_THEME_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
	public By MENU_SEND_FEEDBACK_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
	public By MENU_HELP_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
	
	
	
	
	public By MENU_CHOOSE_THEME_POP_UP_OK_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
	public By MENU_CHOOSE_THEME_POP_UP_CANCEL = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]");
	public By MENU_CHOOSE_THEME_POP_UP_THEME_LIGHT_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
	public By MENU_CHOOSE_THEME_POP_UP_THEME_DARK_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	public By MENU_CHOOSE_THEME_POP_UP_THEME_SYSTEM_DEFAULT_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
	public By MENU_CHOOSE_THEME_POP_UP_TITTLE_TEXT_LOCATOR = By.id("com.google.android.calculator:id/alertTitle");
	
	
	public By MENU_HISTORY_CURRENT_EXPESSION_TEXT_LOCATOR = By.id("com.google.android.calculator:id/history_date");
	public By MENU_HISTORY_TITTLE_TEXT_LOCATOR = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	public By MENU_HISTORY_BACK_BUTTON = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	public By MENU_HISTORY_MORE_OPTION_BUTTON= By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
	public By MENU_HISTORY_MORE_OPTION_CLEAR_BUTTON = By.id("com.google.android.calculator:id/title");
	public By MENU_HISTORY_TODAY_TEXT_LOCATOR = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]");
		
	
	
	
	
	public void numberVerifier(By numberLocator, int numberValue ,AndroidDriver<AndroidElement> driver  ) throws InterruptedException {
		 Thread.sleep(500);
		 findElement(numberLocator, driver).click();
		 waitForVisibilityOfElement(driver, DISPLAY_NUMBER_LOCATOR, 2);
		 //assert.assertEquals(true, "Button not clicked or Button not working.");
		 
		 
		
	}
	
	
	
}

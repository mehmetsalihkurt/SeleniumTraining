import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoSuggestionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		WebElement elem = driver.findElement(By.id("fromPlaceName"));
		elem.sendKeys("BENG");
		elem.sendKeys(Keys.DOWN);
		elem.sendKeys(Keys.DOWN);
		System.out.println("without javascript " + elem.getText());//will not work because it is javascript 
		//Javascript DOM can extract hidden elements - https://www.w3schools.com/js/js_htmldom_document.asp
		//because seleniým cannot identify hidden elements -  (Ajax implementation)
		//invesitgate the properties if it have any hidden text
		
		//Javascript Executor 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);

		System.out.println("with javascript " + text);
	}

}

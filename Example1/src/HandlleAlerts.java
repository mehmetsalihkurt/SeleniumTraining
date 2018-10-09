import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlleAlerts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath("//*[@data-title='Round Trip Discount']")).click();
		Thread.sleep(5000);
		//chrome xpath $x("(//button[@class='btn buttonGlbl btn-close button-trigger'])[1]")
		driver.switchTo().activeElement().findElement(By.xpath("(//button[@class='btn buttonGlbl btn-close button-trigger'])[1]")).click();
		
		Thread.sleep(4000);
		driver.quit();
	}

}

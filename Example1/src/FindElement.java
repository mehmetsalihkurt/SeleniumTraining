import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("pass")).sendKeys("burak");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("msk");
		
		Select select_day = new Select(driver.findElement(By.id("day")));
		
		select_day.selectByIndex(2);
		
		Select select_month = new Select(driver.findElement(By.id("month")));
		//value in html code
		select_month.selectByValue("7");
		
		
		Thread.sleep(2000);
		
		//value in html code
		select_month.selectByVisibleText("Mar");
				
		
		Thread.sleep(1000);
	}

}

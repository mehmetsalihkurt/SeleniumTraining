import java.io.Console;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("msk");
//		
//		Select select_day = new Select(driver.findElement(By.id("day")));
//		
//		select_day.selectByIndex(2);
//		
//		Select select_month = new Select(driver.findElement(By.id("month")));
//		//value in html code
//		select_month.selectByValue("7");
//		
//		
//		Thread.sleep(2000);
//		
//		//value in html code
//		select_month.selectByVisibleText("Mar");
//				
//		
//		Thread.sleep(1000);
		
		driver.get("https://www.spicejet.com/");
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//because of there is two dropdownlist with one source we should inform selenium to use second one that it finds with name "DEL"
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();

		//validate whether checkbox is selected default
		System.out.println("ctl00_mainContent_chk_friendsandfamily " + driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println("ctl00_mainContent_chk_friendsandfamily " + driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
//		if(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected() == false)
//		{
//			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//		}
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}

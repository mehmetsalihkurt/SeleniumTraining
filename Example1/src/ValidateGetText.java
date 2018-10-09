import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateGetText {

	//download testng from eclipse market place
	//add org.testng.Assert
	//add testng libraries to the project
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		System.out.println(driver.findElement(By.xpath("//*[@id='fd-wrap']/div[2]/h2")).getText());
		boolean bool = driver.findElement(By.xpath("//*[@id='fd-wrap']/div[2]/h2")).getText().equals("Discover Hot Deals  ");
		Assert.assertTrue(bool);
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}

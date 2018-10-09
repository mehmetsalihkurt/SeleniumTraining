import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMultiplePages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		WebElement acc_list = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		WebElement search_bar = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(acc_list).contextClick().build().perform();
		Thread.sleep(2000);
		action.moveToElement(search_bar).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

	}

}

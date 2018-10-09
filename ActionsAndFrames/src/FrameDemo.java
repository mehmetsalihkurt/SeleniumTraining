import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		/*!!!!!!!!!!!not work  because draggable element is in a frame!!!!!!!!!!*/
		//driver.findElement(By.id("draggable")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'content\']/iframe")));
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		

		Actions action = new Actions(driver);
		
		
		action.dragAndDrop(drag, drop).build().perform();
		
		//switch to default to click elements in the webpage 
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='content']/div[1]/ul/li[2]/a")).click();
		
		
		
	}

}
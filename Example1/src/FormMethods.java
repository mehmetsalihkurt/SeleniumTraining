import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void log(String o)
	{
		System.out.println(o);
	}
	public static void log(Boolean o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		log("Before Clicking Multi city radio button");
		//check if it is visible
		log(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
		driver.findElement(By.xpath("//*[@for='switch__input_3']")).click();
		log("After Clicking Multi city radio button");
		log(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
		
		//check if it is exist
		int count = driver.findElements(By.xpath("//*[@id='hp-widget__return']")).size();
		if(count == 0)
		{
			log("item not exist");
		}
		else
		{
			log("item exist");
		}
		
		count = driver.findElements(By.xpath("//*[@id='hp-widget__return_xx']")).size();
		if(count == 0)
		{
			log("item not exist");
		}
		else
		{
			log("item exist");
		}
	}

}

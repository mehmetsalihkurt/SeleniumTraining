import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurtme\\AppData\\Local\\LocalData\\Java\\Selenium\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		List<WebElement> li = driver.findElements(By.xpath("//input[@name='group1']"));
		
		for(WebElement w: li)
		{
			String text = w.getAttribute("value");
			w.click();
			
		}
		
		for(int i = 0;i < count; i++)
		{
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(text);
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			if (text.equals("Cheese")) // not text == "Cheese"
			{
				System.out.println("cheeeeseeeee");
			}
			Thread.sleep(500);
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}

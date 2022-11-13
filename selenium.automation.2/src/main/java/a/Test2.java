package a;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		// tell java where is the chrome driver
		String propertyName = "webdriver.chrome.driver";
		String propertyValue = "C:/eldar/web drivers/chromedriver.exe";
		System.setProperty(propertyName, propertyValue);

		// open the chrome browser
		WebDriver driver = new ChromeDriver();
		TimeUnit.SECONDS.sleep(1);

//		// maximize the window
//		driver.manage().window().maximize();
//		TimeUnit.SECONDS.sleep(1);

		// navigate to a page
		driver.get("file:///C:/eldar/html/js/demo3.html");
		TimeUnit.SECONDS.sleep(1);
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		// find the first input element
		WebElement elementInput1 = driver.findElement(By.tagName("input"));
		elementInput1.sendKeys("123");
		TimeUnit.SECONDS.sleep(2);
		
		// delete the text in the input field
		elementInput1.clear();
		TimeUnit.SECONDS.sleep(2);
		
		// find all input element
		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println("number of input elements: " + list.size());
		list.get(0).sendKeys("500");
		list.get(1).sendKeys("75");
		TimeUnit.SECONDS.sleep(2);
		
		TimeUnit.SECONDS.sleep(2);
		// find element by id
		WebElement element = driver.findElement(By.id("b"));
		element.sendKeys("999");
		TimeUnit.SECONDS.sleep(2);
		
		// click a button
		driver.findElement(By.tagName("button")).click();
		TimeUnit.SECONDS.sleep(5);
		
		
		////////////////////////////////////////////////////////////////////////////////////////

		// close the window
		driver.quit();

	}

}

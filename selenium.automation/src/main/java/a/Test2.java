package a;

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
		
		// maximize the window
//		driver.manage().window().maximize();
//		TimeUnit.SECONDS.sleep(1);
		
		// navigate to google
		driver.get("file://C:/eldar/html/js/demo3.html");
		TimeUnit.SECONDS.sleep(2);
		
		// find the first h1 element and get its text content
		WebElement element = driver.findElement(By.tagName("h1"));
		String text = element.getText();
		System.out.println(text);
		TimeUnit.SECONDS.sleep(2);
		
		// get the first input
		element = driver.findElement(By.id("a"));
		element.sendKeys("105");
		// type 105 to the input
		TimeUnit.SECONDS.sleep(5);
				
		// close the window
		driver.quit();

	}

}

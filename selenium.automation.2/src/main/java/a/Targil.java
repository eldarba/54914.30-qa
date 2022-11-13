package a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Targil {

	public static void main(String[] args) throws InterruptedException {

		// tell java where is the chrome driver
		String propertyName = "webdriver.chrome.driver";
		String propertyValue = "C:/eldar/web drivers/chromedriver.exe";
		System.setProperty(propertyName, propertyValue);

		// open the chrome browser
		WebDriver driver = new ChromeDriver();

		// navigate to a page
		driver.get("file:///C:/eldar/html/js/targil.html");
		TimeUnit.SECONDS.sleep(1);

		////////////////////////////////////////////////////////////////////////////////////////
		WebElement button = driver.findElement(By.tagName("button"));
		for (int i = 0; i < 5; i++) {
			button.click();
			TimeUnit.SECONDS.sleep(1);
		}
		////////////////////////////////////////////////////////////////////////////////////////

		TimeUnit.SECONDS.sleep(4);
		// close the window
		driver.quit();
	}

}

package a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		// tell java where is the chrome driver
		String propertyName = "webdriver.chrome.driver";
		String propertyValue = "C:/eldar/web drivers/chromedriver.exe";
		System.setProperty(propertyName, propertyValue);

		// open the chrome browser
		WebDriver driver = new ChromeDriver();
		TimeUnit.SECONDS.sleep(1);

		// maximize the window
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(1);

		// navigate to google
		driver.get("file:///C:/eldar/html/js/demo3.html");
		TimeUnit.SECONDS.sleep(3);

		// close the window
		driver.quit();

	}

}

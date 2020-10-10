package orderphone;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWaits {
	
	public static boolean waitForPageLoadComplete(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(webDriver -> ((JavascriptExecutor)webDriver).executeScript("return document.readyState").equals("complete"));
	}

}

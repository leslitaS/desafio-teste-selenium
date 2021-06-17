package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceOptionObjs {

	public static WebElement opcaoSeguro(WebDriver driver) {
		   return driver.findElement(By.cssSelector("#selectultimate"));
	}

	public static WebElement botaoNext(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#nextsendquote"));
	}

}

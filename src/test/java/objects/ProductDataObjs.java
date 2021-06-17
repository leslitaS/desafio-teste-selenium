package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductDataObjs extends Configuracao{

	public static WebElement campoCalendario(WebDriver driver) {
		return driver.findElement(By.cssSelector("#startdate"));
	}

	public static WebElement valorSeguro(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#insurancesum option:nth-child(5)"));
	}

	public static WebElement produtosOpcionais(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#EuroProtection"));
	}

	public static WebElement classificacaoMerito(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#meritrating option:nth-child(5)"));
	}

	public static WebElement campoCortesia(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#courtesycar option:nth-child(2)"));
	}

	public static WebElement seguroDanos(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#damageinsurance option:nth-child(2)"));
	}

	public static WebElement botaoNext(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#nextselectpriceoption"));
	}

	
	
}

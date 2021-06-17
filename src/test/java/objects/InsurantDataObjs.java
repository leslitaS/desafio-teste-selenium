package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsurantDataObjs extends Configuracao {

	public static WebElement campoNome (WebDriver driver) {
	      return driver.findElement(By.cssSelector("#firstname"));
	}

	public static WebElement sobreNome(WebDriver driver) {
		  return driver.findElement(By.cssSelector("#lastname"));
	}

	public static WebElement dataNascimento(WebDriver driver) {
		return driver.findElement(By.cssSelector("#birthdate"));
	}

	public static WebElement campoGenero(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#gendermale"));
	}

	public static WebElement endereco(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#streetaddress"));
	}

	public static WebElement escolhoPais(WebDriver driver) {
		return driver.findElement(By.cssSelector("#country option:nth-child(30)")); 
	}

	public static WebElement campoCep(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#zipcode"));
	}

	public static WebElement ocupacao(WebDriver driver) {
		  return driver.findElement(By.cssSelector("#occupation option:nth-child(5)"));
	}

	public static WebElement hobbies(WebDriver driver) {
		return driver.findElement(By.cssSelector("#bungeejumping")); 
	}

	public static WebElement redeWebSite(WebDriver driver) {
		return driver.findElement(By.cssSelector("#website"));
	}

	public static WebElement botaoNext(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#nextenterproductdata"));
	}

}

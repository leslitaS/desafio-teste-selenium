package objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehicleObjs  extends Configuracao{
	
	public static WebElement dropdownMarca(WebDriver driver) {
        return driver.findElement(By.cssSelector("#make>option:nth-child(14)"));
        
    }
	public static WebElement dropdownModelo(WebDriver driver) {
		
		 return driver.findElement(By.cssSelector("#model>option:nth-child(2)"));
    }
	
    public static WebElement dataCalendario (WebDriver driver) {
        return driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover"));
    }
	public static WebElement numeroAssentos(WebDriver driver) {
		 return driver.findElement(By.cssSelector("#model>option:nth-child(3)"));
		
	}
	public static WebElement tipoDireccao(WebDriver driver) {
		return driver.findElement(By.cssSelector("input[id*='yes']"));
		
	}
	public static WebElement novoNumeroAssento(WebDriver driver) {
		 new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText("3");
		 return driver.findElement(By.id("numberofseats"));
		
		
	}
	public static WebElement tipoCombustivel(WebDriver driver) {
		
		 return driver.findElement(By.xpath("//*[@id=\"fuel\"]/option[2]"));
	}
	public static WebElement precoTabela(WebDriver driver) {
	
		return driver.findElement(By.cssSelector("#listprice"));
	}
	public static WebElement numeroMatricula(WebDriver driver) {
		
		 return driver.findElement(By.cssSelector("#licenseplatenumber"));
	}
	public static WebElement milhagemAnual(WebDriver driver) {
		
		 return driver.findElement(By.cssSelector("#annualmileage"));
	}
	public static WebElement botaoNext(WebDriver driver) {
		driver.findElement(By.xpath("//form[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span")).click();
		return driver.findElement(By.cssSelector("#nextenterinsurantdata"));
	}
	
}

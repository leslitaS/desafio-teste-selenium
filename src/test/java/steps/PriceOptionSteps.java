package steps;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import objects.Configuracao;
import objects.PriceOptionObjs;

public class PriceOptionSteps extends Configuracao {
	 WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "E:\\LESLIE\\QE Gama Academy\\web driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
			
	@Test

	@Quando("escolhe uma opcao")
	public void escolhe_uma_opcao() {
		WebElement element = PriceOptionObjs.opcaoSeguro(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		PriceOptionObjs.opcaoSeguro(driver).isEnabled();
	}
	
	@Entao("clico no botao Next para receber orçamento")
	public void clico_no_botao_next_para_receber_orçamento() throws InterruptedException {
		 Thread.sleep(2000);
		 PriceOptionObjs.botaoNext(driver).click();
	}
	@After
	public void dps() {
		
		driver.quit();
		
	}
}

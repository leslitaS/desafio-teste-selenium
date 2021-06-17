package steps;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import objects.Configuracao;
import objects.ProductDataObjs;

public class ProductDataSteps extends Configuracao {

	 WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "E:\\LESLIE\\QE Gama Academy\\web driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
			
	@Test
	@Dado("seleciono uma Data de início")
	public void seleciono_uma_data_de_início() {
		ProductDataObjs.campoCalendario(driver).sendKeys("08/08/2022");
	}
	
	@Dado("seleciono uma Soma do seguro")
	public void seleciono_uma_soma_do_seguro() {
		ProductDataObjs.valorSeguro(driver).click();
	}
	
	@Dado("seleciono uma Classificação de mérito")
	public void seleciono_uma_classificação_de_mérito() {
		ProductDataObjs.classificacaoMerito(driver).click();
	}
	
	@Dado("escoseleciono Seguro de Danos")
	public void escoseleciono_seguro_de_danos() {
		ProductDataObjs.seguroDanos(driver).click();
	}
	
	@Dado("escolho Produtos Opcionais")
	public void escolho_produtos_opcionais() {
		 WebElement element = ProductDataObjs.produtosOpcionais(driver);
         Actions actions = new Actions(driver);
         actions.moveToElement(element).click().perform();
	}
	
	@Dado("seleciono Carro de cortesia")
	public void seleciono_carro_de_cortesia() {
		ProductDataObjs.campoCortesia(driver).click();
	}
	
	@Entao("clico no botao next para ver o formulario Select Price Option")
	public void clico_no_botao_next_para_ver_o_formulario_select_price_option() {
		ProductDataObjs.botaoNext(driver).click();
	}
	@After
	public void dps() {
		
		driver.quit();
		
	}
}

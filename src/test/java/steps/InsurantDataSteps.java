package steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import objects.InsurantDataObjs;

public class InsurantDataSteps {
	 WebDriver driver;
	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "E:\\LESLIE\\QE Gama Academy\\web driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
	
	@Dado("que estou no site da tricentis no Formulario {string}")
	public void que_estou_no_site_da_tricentis_no_formulario(String string) {
		 driver.findElement(By.xpath("//form[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span")).click();
	}
	
	@Dado("que digito o Nome")
	public void que_digito_o_nome() {
		InsurantDataObjs.campoNome(driver).sendKeys("Leslie");
	}
	
	@Dado("digito o Sobrenome")
	public void digito_o_sobrenome() {
		InsurantDataObjs.sobreNome(driver).sendKeys("Cespedes");
	}
	
	@Dado("insiro a Data de nascimento")
	public void insiro_a_data_de_nascimento() {
		InsurantDataObjs.dataNascimento(driver).sendKeys("05/14/1986");
	}
	
	@Dado("escolho um Gênero")
	public void escolho_um_gênero()throws InterruptedException {
	    WebElement element = InsurantDataObjs.campoGenero(driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
	}
	
	@Dado("digito o Endereço")
	public void digito_o_endereço() {
		InsurantDataObjs.endereco(driver).sendKeys("Rua Coronel Vieira de Castro, 90");
	}
	
	@Dado("escolho um País")
	public void escolho_um_país() {
		InsurantDataObjs.escolhoPais(driver).click();
	}
	
	@Dado("digito o CEP")
	public void digito_o_cep() {
		InsurantDataObjs.campoCep(driver).sendKeys("02466110");
	}
	
	@Dado("digito a cidade")
	public void digito_a_cidade() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Dado("seleciono uma Ocupação")
	public void seleciono_uma_ocupação() {
		InsurantDataObjs.ocupacao(driver).click();
	}
	
	@Dado("escolho um Hobbie")
	public void escolho_um_hobbie() {
		WebElement element = InsurantDataObjs.hobbies(driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
	}
	
	@Dado("insiro o local na rede de internet")
	public void insiro_o_local_na_rede_de_internet() {
		InsurantDataObjs.redeWebSite(driver).sendKeys("https://github.com/leslitaS");
	}
	
	@Dado("faco upload da Foto")
	public void faco_upload_da_foto() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Entao("clico no botao next para Enter Product Data")
	public void clico_no_botao_next_para_enter_product_data() {
		InsurantDataObjs.botaoNext(driver).click();
	}


}

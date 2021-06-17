package steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

import objects.Configuracao;
import objects.VehicleObjs;

public class EnterVehicleSteps extends Configuracao{
	 WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "E:\\LESLIE\\QE Gama Academy\\web driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
		
	@Test

	
	@Dado("que estou no site da tricentis")
	public void que_estou_no_site_da_tricentis() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");   
	}

	@Dado("seleciono uma Marca")
	public void seleciono_uma_marca() {
		VehicleObjs.dropdownMarca(driver).click();
	}
	@Dado("seleciono um Modelo")
	public void seleciono_um_modelo() {
		VehicleObjs.dropdownModelo(driver).click();
	}
	@Dado("digito a capacidade do cilindro")
	public void digito_a_capacidade_do_cilindro() {
		 driver.findElement(By.id("cylindercapacity")).sendKeys("432");
	}
	@Dado("digito o Desempenho do motor [kW]")
	public void digito_o_desempenho_do_motor_k_w() {
		 driver.findElement(By.id("engineperformance")).sendKeys("234");
	}

	@Dado("insiro a Data de fabricação")
	public void insiro_a_data_de_fabricação() throws InterruptedException {
		driver.findElement(By.id("opendateofmanufacturecalender")).click();
		driver.findElement(By.id("dateofmanufacture")).sendKeys("06/16/2021");
		Thread.sleep(5000);
		VehicleObjs.dataCalendario(driver).click();
	}

	@Dado("seleciono o Numero de assentos")
	public void seleciono_o_numero_de_assentos() {
		VehicleObjs.numeroAssentos(driver).click();
	}

	@Dado("escolho o tipo de direção")
	public void escolho_o_tipo_de_direção() {
		VehicleObjs.tipoDireccao(driver).click();
		
	}

	@Dado("escolho novamente o numero de assento")
	public void escolho_novamente_o_numero_de_assento() {
		VehicleObjs.novoNumeroAssento(driver).click();
	}
	@Dado("seleciono o Tipo de combustível")
	public void seleciono_o_tipo_de_combustível() {
		VehicleObjs.tipoCombustivel(driver).click();
	}

	@Dado("digito o Preço de tabela [$]")
	public void digito_o_preço_de_tabela_$() {
		VehicleObjs.precoTabela(driver).sendKeys("25000");
	}

	@Dado("digito o Número da matrícula")
	public void digito_o_número_da_matrícula() {
		VehicleObjs.numeroMatricula(driver).sendKeys("EMJ123E");
	}

	@Dado("digito  a Milhagem anual [mi]")
	public void digito_a_milhagem_anual_mi() {
		VehicleObjs.milhagemAnual(driver).sendKeys("2323");
	}

	@Entao("clico no botao next para ir ao formulario Enter Insurant Data")
	public void clico_no_botao_next_para_ir_ao_formulario_enter_insurant_data() throws InterruptedException {
	Thread.sleep(5000);
		VehicleObjs.botaoNext(driver).click();
		
	}
	@After
	public void dps() {
		
		driver.quit();
		
	}
}

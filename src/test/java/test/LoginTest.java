package test;




import java.io.IOException;

import org.apache.xalan.xsltc.compiler.Template;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import pages.HomePage;
import pages.MovilSeguros;




public class LoginTest extends BaseTest {
	
	//CONSTRUCTOR
	
	public LoginTest() {
		super.setup();
		}	
	
	public void LTBuscarWeb() throws InterruptedException {
		HomePage homePage = new HomePage(driver, driverWait);
		homePage.BuscarWeb();
	}
	
	public void LTIngresarWeb() {
		HomePage homePage = new HomePage(driver, driverWait);
		homePage.CliquearWeb();
		homePage.ValidarSpan();
	}
	
	public void LTCompleteForm() {
		MovilSeguros movil = new MovilSeguros(driver, driverWait);
		movil.CompleteForm();
	}
	
	public void LTViewForm() {
		MovilSeguros movil = new MovilSeguros(driver, driverWait);
		movil.ViewSection();
	}
	
	public void LTButtonClick() throws InterruptedException {
		MovilSeguros movil = new MovilSeguros(driver, driverWait);
		movil.ButtonClick();
	}
	
	public void LTBuscarWebSeguros() throws InterruptedException {
		MovilSeguros movil = new MovilSeguros(driver, driverWait);
		movil.BuscarWebSeguro();
	}
	
	public void LTPlayVideo() {
		MovilSeguros movil = new MovilSeguros(driver, driverWait);
		movil.PlayVideo();
	}
	
}
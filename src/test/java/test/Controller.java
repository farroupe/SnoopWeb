package test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class Controller {
	
	//@Test
	public void CIngresarASnoopWeb() throws InterruptedException {
		LoginTest snoop = new LoginTest();
		snoop.LTBuscarWeb();
		snoop.LTIngresarWeb();
	}
	
	@Test
	public void CIngresarANosotros() throws InterruptedException {
		LoginTest snoop = new LoginTest();
		snoop.LTBuscarWeb();
		snoop.LTIngresarWeb();
		snoop.LTClickOnLaEmpresa();
		snoop.LTGoToEmpresa();
		snoop.LTGoToPartners();
		snoop.LTCheckPartners();
		snoop.LTGoToQuienesSomos();
	}
	
	
	//Este Test se debe ejecutar de 9 a 18hs.
	public void CLandingPage() throws InterruptedException {
		LoginTest snoop = new LoginTest();
		snoop.LTBuscarWebSeguros();
		snoop.LTIngresarWeb();
		snoop.LTCompleteForm();
		snoop.LTViewForm();
		snoop.LTButtonClick();
		snoop.LTPlayVideo();
	}
	

}

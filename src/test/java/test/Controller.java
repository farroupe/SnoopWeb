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
	
	@Test//Este Test se debe ejecutar de 9 a 18hs.
	public void CLandingPage() throws InterruptedException {
		
	/*	ZonedDateTime fecha = ZonedDateTime.now();
		System.out.println(fecha);
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
	*/			
			LoginTest snoop = new LoginTest();
			snoop.LTBuscarWebSeguros();
			snoop.LTIngresarWeb();
			snoop.LTCompleteForm();
			snoop.LTViewForm();
			snoop.LTButtonClick();
			snoop.LTPlayVideo();
		}
	

}

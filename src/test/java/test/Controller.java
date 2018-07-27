package test;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class Controller {
	
	
	
	public void CIngresarASnoopWeb() throws InterruptedException {
		LoginTest snoop = new LoginTest();
		snoop.LTBuscarWeb();
		snoop.LTIngresarWeb();
	}
	
	@Test
	public void CITestSnoopWeb() throws InterruptedException {
		LoginTest snoop = new LoginTest();
		snoop.LTBuscarWeb();
		snoop.LTIngresarWeb();
		snoop.LTCompleteForm();
		snoop.LTViewForm();
		snoop.LTButtonClick();
	}
	
	
	
}

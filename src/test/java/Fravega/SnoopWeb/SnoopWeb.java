package Fravega.SnoopWeb;

import org.junit.Test;

import test.Controller;

public class SnoopWeb {
	
	@Test
	public void MVNIngresarSnoop() throws InterruptedException {
		Controller snoop = new Controller();
		snoop.CIngresarASnoopWeb();
	}
	
	@Test
	public void MVNLandinPage() throws InterruptedException {
		Controller landpage = new Controller();
		landpage.CLandingPage();
	}

}

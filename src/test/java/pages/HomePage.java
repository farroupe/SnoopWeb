package pages;


import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import pageFactory.AbstractPageObject;

public class HomePage extends AbstractPageObject {

	public HomePage(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}

	public void BuscarWeb() throws InterruptedException {
		String fElemen = "aplicaciones app seguros";
		WebElement bar = driver.findElement(By.id("lst-ib"));
				bar.sendKeys(fElemen);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.name("btnK")).click();		
	}
	
	public void CliquearWeb() {
		driver.findElement(By.xpath("//*[@id=\"vn1s0p1c0\"]")).click(); //Primer resultado de la búsqueda de google.
	}
	
	public void ValidarSpan() {
		WebElement wSpan = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div/h3/span"));
				String span = wSpan.getText();
				System.out.println(span);
	}
	
	
	
}

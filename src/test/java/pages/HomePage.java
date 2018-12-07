package pages;


import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import pageFactory.AbstractPageObject;

public class HomePage extends AbstractPageObject {

	public HomePage(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}

	public void BuscarWeb() throws InterruptedException {
		String fElemen = "Snoop Consulting";
		WebElement bar = driver.findElement(By.name("q"));
				bar.sendKeys(fElemen);
				TimeUnit.SECONDS.sleep(2);
				//WebElement btn = driver.findElement(By.name("btnK")).click();
				bar.sendKeys(Keys.RETURN);
	}
	
	public void CliquearWeb() {
		//driver.findElement(By.xpath("//*[@id=\"vn1s0p1c0\"]")).click(); //Primer resultado de la búsqueda de google.
		WebElement resultado = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3"));
		System.out.println(resultado.getText());
		Assert.assertEquals("Snoop Consulting: Empresa desarrollo IT, mobile, software, social", resultado.getText());
		resultado.click();
	}
	
	
	public void ValidarSpan() {
		WebElement wSpan = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div/h3/span"));
				String span = wSpan.getText();
				Assert.assertEquals("VELOCIDAD PARA EL CAMBIO", wSpan.getText());
				System.out.println(span);
	}
	
	
	public void PlayVideo() {
		WebElement video = driver.findElement(By.xpath("//*[@id=\"player_uid_927054242_1\"]/div[4]/div[1]"));
			video.click();
			
	}
	
	
}

package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;

public class MovilSeguros extends AbstractPageObject {

	public MovilSeguros(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}
	
	String name="Bruno";
	String surname="Diaz";
	String company="Wayne";
	String position="chief";
	String mail="bruce.wayne@waynecompany.com";
	String msg="Hola, soy Bruno Díaz y me gustaría contactarme con ustedes para contratar su servicio.";
	
	
	public void CompleteForm() {
		WebElement nombre = driver.findElement(By.name("nombre"));
		WebElement apellido = driver.findElement(By.name("apellido"));
		WebElement empresa = driver.findElement(By.name("empresa"));
		WebElement cargo = driver.findElement(By.name("cargo"));
		WebElement email = driver.findElement(By.name("your-email"));
		WebElement message = driver.findElement(By.name("your-message"));
		
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"wpcf7-f80924-p80394-o1\"]/form/div[2]/div[10]/input"));
		
		nombre.sendKeys(name);
		apellido.sendKeys(surname);
		empresa.sendKeys(company);
		cargo.sendKeys(position);
		email.sendKeys(mail);
		message.sendKeys(msg);
		
		//btn.click();
		
	}
	
	public void ViewSection() {
		driver.findElement(By.xpath("//*[@id=\"appmovbotheader\"]/div[3]")).click();
	}
	
	
	public void ValidateSpan() {
		WebElement span = driver.findElement(By.xpath("//*[@id=\"fancy-title-13\"]/span/span/b"));
			String title = span.getText();
			System.out.println();
	}
	
	public void ButtonClick() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
	//	driver.findElement(By.xpath("//*[@id=\"player_uid_527886069_1\"]/div[4]/div[1]")).click();
	}
	
	
}

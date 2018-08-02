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
	
	String name="John";
	String surname="Fante";
	String company="Fante Company";
	String position="writer";
	String mail="johnfante@script-cinema.com";
	String msg="Hola, soy John Fante y me gustaría conocer acerca del servicio de contra.";
	
	
	
	public void BuscarWebSeguro() throws InterruptedException {
		String fElemen = "aplicaciones app seguros";
		WebElement bar = driver.findElement(By.id("lst-ib"));
				bar.sendKeys(fElemen);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.name("btnK")).click();		
	}
	
	
	
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
	
	
	public void PlayVideo() {
		WebElement video = driver.findElement(By.xpath("//*[@id=\"player_uid_927054242_1\"]/div[4]/div[1]"));
			video.click();
			
	}
	
	
	
}

package pages;

import java.util.concurrent.TimeUnit;

import javax.servlet.http.Part;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;



import pageFactory.AbstractPageObject;

public class Nosotros extends AbstractPageObject {

	public Nosotros(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);
	
	public void ClickOnNosotros() {
		WebElement laEmp = driver.findElement(By.id("menu-item-5871"));
			laEmp.click();		
	}
	
	
	public void ScrollToLaEmpresa() throws InterruptedException {
		WebElement laEmp = driver.findElement(By.id("fancy-title-3"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", laEmp);
			TimeUnit.SECONDS.sleep(3);	
	}
	
	public void ScrollToPartners() throws InterruptedException {
		WebElement nuePartners = driver.findElement(By.id("fancy-title-9"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nuePartners);
			TimeUnit.SECONDS.sleep(3);
	}

	
	public void CheckPartners() throws InterruptedException {
		WebElement partGoogle = driver.findElement(By.id("flipbox-12"));
		WebElement partIMB = driver.findElement(By.id("flipbox-14"));
		WebElement part365 = driver.findElement(By.id("flipbox-16"));
		WebElement partZenDesk = driver.findElement(By.id("flipbox-18"));
				
		builder.moveToElement(partGoogle).build().perform();
		TimeUnit.SECONDS.sleep(1);
		builder.moveToElement(partIMB).build().perform();
		TimeUnit.SECONDS.sleep(1);
		builder.moveToElement(part365).build().perform();
		TimeUnit.SECONDS.sleep(1);
		builder.moveToElement(partZenDesk).build().perform();
		TimeUnit.SECONDS.sleep(1);
	}
	
	
	public void ScrollToQuienesSomos() throws InterruptedException {
		WebElement qunSomos = driver.findElement(By.id("fancy-title-40"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", qunSomos);
			TimeUnit.SECONDS.sleep(3);
	}
	
	public void ScrollToFooter() throws InterruptedException {
		WebElement qunSomos = driver.findElement(By.id("fancy-title-45"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", qunSomos);
		TimeUnit.SECONDS.sleep(3);
	}
	
}

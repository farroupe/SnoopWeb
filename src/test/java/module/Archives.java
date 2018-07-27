package module;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;

import com.opencsv.CSVReader;

public class Archives {
	
	public void ReadCSV() throws IOException {
	String CSV_File = "C:\\Users\\31953658\\eclipse-workspace\\Etiquetas\\docs\\reglas3.csv";
	   
		CSVReader reader =  new CSVReader(new FileReader(CSV_File));
		String cell[] = null;
	
	while((cell=reader.readNext())!=null){
		
			for (int i=0; i < 1; i++) {
				String nRegla = cell[i];	
				String nTempl = cell[i+1];
				String tipEtiq = cell[i+2];
				String nSuc = cell[i+3];
				String fDesde = cell[i+4];
				String fHasta = cell[i+5];
				String prod = cell[i+6];
				String categoria = cell[i+7];
				
		//	driver.findElement(By.id("name")).sendKeys(nRegla);
	
			}
			
		}
	
	}
}

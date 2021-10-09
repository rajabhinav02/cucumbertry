package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configreader {

	private Properties pro;
	
	public Properties getprop() {
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\resources\\java\\config\\cofig.properties");
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pro;
	}
	
}

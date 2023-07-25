package smarttech.ny.basepage;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public ParentClass() {
		 try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/smarttech/ny/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
	
public void initialization() {
String browser = prop.getProperty("browserName");
	
if(browser.equalsIgnoreCase("chrome")) {
		
	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();

	}else if(browser.equalsIgnoreCase("Safari")) {
		WebDriverManager.safaridriver().setup();
	     driver = new SafariDriver();
	     
	}else if(browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	    
	}else {
		System.out.println("There is no browser for test");
	}
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.get(prop.getProperty("QA_ENV"));

}
}

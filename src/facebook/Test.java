package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	public static void main(String[] args) {
		
	//WebDriver driver =new ChromeDriver();
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Niaz\\Downloads\\chrome\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Niaz\\Documents\\firefox\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","C:\\\\Users\\\\Niaz\\\\Documents\\\\firefox\\\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();*/
	

	driver.get("https://www.facebook.com/");
	System.out.println("This is change");
	}

	
	}
	


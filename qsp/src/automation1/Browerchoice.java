package automation1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browerchoice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		Scanner c=new Scanner(System.in);
		
		System.out.println("enter the browser which you want");
		String chromeBC=c.next();
		
		if(chromeBC.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     driver=new ChromeDriver();
	     //Thread.sleep(2000);
	     driver.close();
		}
		else if(chromeBC.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			 Thread.sleep(2000);
			 driver.close();
		}
		else
		{
			System.out.println("enter valid input");
		}
		
	
	}

}

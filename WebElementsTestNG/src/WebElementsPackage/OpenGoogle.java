package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

					
				System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
					
				driver.manage().window().maximize();	
				driver.get("https://www.google.co.uk/");
 		
	}

}

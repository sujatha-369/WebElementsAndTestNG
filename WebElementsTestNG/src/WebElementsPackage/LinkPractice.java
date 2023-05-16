package DemoPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPractice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://www.leafground.com/link.xhtml");
	   
	    driver.findElement(By.linkText("How many links in this page?")).click();
	    
	   // driver.findElement(By.xpath(" //*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a")).click();
	    
	  //  driver.findElement(By.xpath(" //*[@id=\"j_idt87\"]/div/div[1]/div[2]/div/div/a")).click();
	    
	    
	    
	    
	 
		
	}
}

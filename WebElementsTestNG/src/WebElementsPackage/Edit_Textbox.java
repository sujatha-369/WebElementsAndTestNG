package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.leafground.com/input.xhtml");
		  
		  driver.manage().window().maximize();
		  //Type your name
		  WebElement userName =  driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		  userName.sendKeys("JohnMital");
		    
		 // Append Country to this City.	
		  WebElement appendName = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		  appendName.sendKeys("UK");
		  
		  //Retrieve the typed text.
		  
		  WebElement getTextBox =  driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));				  
		  String value = getTextBox.getAttribute("value");
		  System.out.println(value);
			
		  
		  // Clear the textBox
		  
		  WebElement clearTextBox =  driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));				  
		  clearTextBox.clear();
		  
		  // Verify if text box is disabled
		  WebElement  disableBox =  driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		  boolean enableDisable =  disableBox.isEnabled(); 	  
		  System.out.println(enableDisable);  
		 
	}

}
 
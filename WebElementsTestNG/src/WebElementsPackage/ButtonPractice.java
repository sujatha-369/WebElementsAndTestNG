package DemoPackage;

 
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPractice {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		 
		 
				 
		// Confirm if the button is disabled
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));
		boolean  confirmDisabled =  disabledBox.isEnabled();
		System.out.println("Confirm if the button is disabled"+confirmDisabled); */
		
			
		// Get position of the Button
		WebElement getPosButt = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]"));
		
		Point xypoint = getPosButt.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		
		System.out.println("X Value is " + xvalue + "  Y Value is " + yvalue);
		
		// Get Colour of the Button
		WebElement colorButt = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
				
		String backColor = colorButt.getCssValue("background-color");
		System.out.println("Button Colour is :"+backColor);
		
		
		// Get Size of the Button
		WebElement findSize = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]"));
		
		int buttHeight = findSize.getSize().getHeight();
		int buttWidth = findSize.getSize().getWidth();
		System.out.println("Height is "+buttHeight + "  Width is " + buttWidth);
		
	
		// Go to Home Page
		WebElement homeButt = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]"));
		homeButt.click();
		
		//Delay execution for 5 seconds to view the maximize operation
		//Thread.sleep(10000);
		
		//driver.quit();
		
		//*[@id="j_idt88:j_idt94"]

	}

}

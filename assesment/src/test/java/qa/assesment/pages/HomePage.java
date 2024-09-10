
package qa.assesment.pages; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage { 

	public static void main(String args[]) 
	{ 
		System.setProperty( 
			"webdriver.chrome.driver", 
			"driver\\chromedriver.exe"); 

		ChromeDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize(); 
		
		 driver.get(" http://127.0.0.1:52455");

	        WebElement greetingMessage = driver.findElement(By.xpath("//body/h1"));

	       
	        String expectedMessage = "Hello from the Backend!";
	      
	        System.out.println(greetingMessage.getText().equals(expectedMessage));
	        
	        driver.close();
	       
	    }

		
	} 


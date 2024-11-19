package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", 
    		   "C:\\Users\\svija\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://testsigma.com/");
    		   driver.manage().window().maximize();
    		 
    		  WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[3]/div/p"));
    				  Actions ac = new Actions(driver);
    		  ac.moveToElement(element).build().perform();
    		  WebElement reg = driver.findElement
    				  (By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[3]/div[2]/div/div[1]/div[1]/div[1]/a"));
    		  reg.click();
    		  
    		 
    				  
	}

}

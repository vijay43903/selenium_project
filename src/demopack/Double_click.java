package demopack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chromr.driver",
    		"C:\\Users\\svija\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    driver.manage().window().maximize();
    
    Actions ac = new Actions(driver);
     WebElement click  = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
     ac.doubleClick(click).perform();
     
    
     Alert alert1 = driver.switchTo().alert();
     String alertMessage= driver.switchTo().alert().getText();
     System.out.println(alertMessage);
     Thread.sleep(5000);
     alert1.accept();
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
		
		
		
	}

}

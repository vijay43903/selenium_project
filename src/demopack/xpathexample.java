package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver",
    		 "C:\\Users\\svija\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
      driver.get("https://www.youtube.com/");
      WebElement search = driver.findElement(By.name("search_query"));
      search.sendKeys("softwaretestinginterview");
      WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/span/div"));
      searchbar.click();
      
     // Actions ac = new Actions(driver);
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      WebElement video = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
      video.click();
      
     
      
      
    
	}

	
}

package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\svija\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/login/");
		  driver.manage().window().maximize();
		  
		//String facebook = driver.getTitle();
		 // System.out.println(facebook);
		  //get page source
		  
		//  String facebook = driver.getPageSource();
		//  System.out.println(facebook);
		  
		  //get current url
		  
		 // String facebook_url = driver.getCurrentUrl();
		 // System.out.println(facebook_url);
		  

	}

}

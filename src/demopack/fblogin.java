package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\svija\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//driver.navigate().to("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
//		WebElement username  = driver.findElement(By.name("email"));
//		username.sendKeys("Vijay");
//		
//		WebElement password  = driver.findElement(By.name("pass"));
//		password.sendKeys("11223344");
//		WebElement login = driver.findElement(By.name("login"));
//		login.click();
		
		
		//xpath with or
//		driver.findElement(By.xpath("//input[@type='text' or @name=\"email\"]")).sendKeys("vijay");
//		driver.findElement(By.xpath("//*[@type= 'password' or @id='pass']")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@name='login' or @id='loginbutton']")).click();
		
		//xpath with and
//		driver.findElement(By.xpath("//input[@type='text' and @name=\"email\"]")).sendKeys("vijay");
//		driver.findElement(By.xpath("//*[@type= 'password' and @id='pass']")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@name='login' and @type='submit']")).click();
		
		
}

}

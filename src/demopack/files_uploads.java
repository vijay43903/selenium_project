package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class files_uploads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\svija\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		WebElement fileinput = driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileinput.sendKeys("C:\\Users\\svija\\OneDrive\\Pictures\\Screenshots\\Screenshot (1).png");
	}

}

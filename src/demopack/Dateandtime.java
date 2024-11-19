package demopack;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromr.driver",
	    		"C:\\Users\\svija\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
	    
	   // Calendar calender_date_time = Calendar.getInstance();
	    //Date currentDatetime = calender_date_time.getTime();
	    	
	    //System.out.println(currentDatetime);
	    //driver.close();
	    
        
	   // Calendar calender_Date_Time = Calendar.getInstance();
	    //calender_Date_Time.add(Calendar.DAY_OF_YEAR, 10);
	    //Date futuredatetime = calender_Date_Time.getTime();
	    //System.out.println(futuredatetime);
	    //driver.close();
	    
	    
	    Calendar calender_Date_Time = Calendar.getInstance();
	    calender_Date_Time.add(Calendar.DAY_OF_YEAR, -10);
	    Date pastdatetime = calender_Date_Time.getTime();
	    System.out.println(pastdatetime);
	    driver.close();
	    
	    
	    
	    
	    
	    

	}

}

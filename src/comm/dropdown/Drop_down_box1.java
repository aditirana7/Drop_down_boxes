package comm.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop_down_box1 {
	WebDriver driver;
	@Test
public void Dropdown1() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/campaign/landing.php?");
	 driver.manage().window().maximize();
	 
	WebElement month_Dropdown=driver.findElement(By.id("month"));
	Select month_dd=new Select(month_Dropdown);
	/*month_dd.selectByIndex(9);
	Thread.sleep(5000);
	month_dd.selectByValue("12");
	Thread.sleep(5000);
	month_dd.selectByVisibleText("Oct");
	Thread.sleep(5000);*/
	
	System.out.println("new code using firstselectedmonth");
	WebElement option=month_dd.getFirstSelectedOption();
	String monthindex=option.getText();
	System.out.println(monthindex);
	
	month_dd.selectByIndex(1);
	WebElement option1=month_dd.getFirstSelectedOption();
	String monthindex1=option.getText();
	System.out.println(monthindex1);
	Thread.sleep(4000);
	driver.quit();
}
}

package Test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\JYO\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> radi = driver.findElements(By.xpath("//input[@name = 'sex' and @type = 'radio']"));
		for(int i =0;i<radi.size();i++)
		{
			WebElement local_radio= radi.get(i);
			String value = local_radio.getAttribute("value");
			System.out.println("values from radio buttons are ------"+value);
			
			
		}
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jan");
		
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByIndex(3);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1994");
		List<WebElement> years = year.getOptions();
		int num = years.size();
		System.out.println(num);
		Thread.sleep(3000);
		driver.quit();
	
		
	}

}

package democlass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassGoogle3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		          
	       ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
			driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
			WebElement rec_name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
			rec_name.sendKeys("harshi");
			WebElement email=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
			email.sendKeys("harshi@gmail.com");
			WebElement urname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
			urname.sendKeys("dhruv");
			WebElement uremail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
			uremail.sendKeys("dhruv@gmail.com");
			WebElement birthday=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
			birthday.click();
			
			

	}

}
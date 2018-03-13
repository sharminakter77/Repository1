package xpathPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xpath {
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		driver=new FirefoxDriver();
				
	}
	@Test
	public void xpathTest() {
		driver.get("file:///C:/Users/Sharmin%20Akter/Desktop/Web.html");
		//Creating xpath by starts-withXpath using id attribute
		driver.findElement(By.xpath("//*[starts-with(@id, 'F')]")).sendKeys("Sharmin");
		//Creating xpath by starts-withxpath using name attribute
		driver.findElement(By.xpath("//*[starts-with(@name,'l')]")).sendKeys("Akter");
	
		
	}
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
	

}

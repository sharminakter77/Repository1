package xpathPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Failedclass {
WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	//@Test
	public void SpecialclassTest() {
		driver.get("file:///C:/Users/Sharmin%20Akter/Downloads/special.html");
		driver.findElement(By.xpath("html/body/div/input[1]")).click();
		driver.findElement(By.xpath("html/body/div/input[2]")).sendKeys("Sharmin");
		driver.findElement(By.xpath("html/body/div/input[3]")).sendKeys("Akter");
		driver.findElement(By.xpath("html/body/div/input[4]")).sendKeys("324567");
		
		Select monthSelect=new Select(driver.findElement(By.xpath("html/body/div[2]/select[1]")));
				monthSelect.selectByVisibleText("Jun");
				
		Select daySelect =new Select(driver.findElement(By.xpath("html/body/div[2]/select[2]")));
		daySelect.selectByVisibleText("Friday");
		
	}
	@Test
	public void SpecialTest2() {
		driver.get("file:///C:/Users/Sharmin%20Akter/Downloads/special.html");
		//driver.findElement(By.xpath("//*[contains(@id,'checkbox')]")).click();
		//driver.findElement(By.xpath("//*[starts-with(@id,'{{id.c')]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//driver.findElement(By.xpath("//*[starts-with(@id,'{{id.FN')]")).sendKeys("Sharmin");
		driver.findElement(By.xpath("//input[2][@Placeholder='First Name']")).sendKeys("Sharmin");
		//driver.findElement(By.xpath("//*[contains(@id,'LN')]")).sendKeys("Akter");
		driver.findElement(By.xpath("//input[3][@Placeholder='Last Name']")).sendKeys("Akter");
		driver.findElement(By.xpath("//*[starts-with(@class,'{{name.Pword')]")).sendKeys("1234556");
		
		Select monthSelect=new Select(driver.findElement(By.xpath("//*[contains(@name,'Month')]")));
		monthSelect.selectByVisibleText("Jun");
		
        Select daySelect =new Select(driver.findElement(By.xpath("//*[starts-with(@name,'{{name.Dname')]")));
        daySelect.selectByVisibleText("Fri"); 
		
	}
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}


}

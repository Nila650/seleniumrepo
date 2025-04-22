package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Sample extends Base {
	
	public void sample()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement eg = driver.findElement(By.xpath("//input[@id='value-a']"));
		eg.sendKeys("32");
		WebElement eg1 = driver.findElement(By.xpath("//input[@id='value-b']"));
		eg1.sendKeys("10");
		WebElement eg3 = driver.findElement(By.xpath("//button[@id='button-two']"));
		eg3.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample sample = new Sample();
		sample.browserInitilization();
		sample.sample();
		
		
	}

}

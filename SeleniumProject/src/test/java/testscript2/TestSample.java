package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TestSample extends Base {

	public void testSamp()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement xpath = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		xpath.sendKeys("nila");
		WebElement xpath1 = driver.findElement(By.xpath("//button[@id='button-one']"));
		xpath1.click();
		//Select select = new Select(xpath1);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSample testsamp = new TestSample();
		testsamp.browserInitilization();
		testsamp.testSamp();
	}

}

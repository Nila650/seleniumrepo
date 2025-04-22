package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Radio extends Base {

	
	public void radio()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		male.click();
		//WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		//female.click();
		/*WebElement value = driver.findElement(By.xpath("//button[@id='button-one']"));
		value.click();
		WebElement gender = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		gender.click();
		WebElement age = driver.findElement(By.xpath("//label[@for='inlineRadio22']"));
		age.click();
		WebElement result = driver.findElement(By.xpath("//button[@id='button-two']"));
		result.click();*/
	}
	public void select()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		if(female.isSelected())
		{
			System.out.println("female is already selected");
		}
		else {
			female.click();
		}
	}
		

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radio radio = new Radio();
		radio.browserInitilization();
	//	radio.radio();
		radio.select();
	}

}

package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBox extends Base {

	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	/*	WebElement check = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		check.click();
		WebElement check1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		check1.click();
		WebElement check2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		check2.click();
		WebElement check3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		check3.click();
		WebElement check4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		check4.click();*/
		WebElement check5 = driver.findElement(By.xpath("//input[@id='button-two']"));
		check5.click();
	}
	public void select()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement check = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		if(check.isSelected())
		{
			System.out.println("checkbox is already selected");
		}
		else
		{
			check.click();
		}

	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBox checkbox = new CheckBox();
		checkbox.browserInitilization();
		//checkbox.checkBox();
		//checkbox.driverQuit();
		checkbox.select();
	}

}

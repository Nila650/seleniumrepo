package testscript2;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class DropDown extends Base {

	
	public void dropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement drop = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(drop);
		//select.selectByVisibleText("Yellow");
		select.selectByIndex(1);
		//select.selectByValue("Red");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DropDown dropdown = new DropDown();
		dropdown.browserInitilization();
		dropdown.dropDown();
		
		
	}

}

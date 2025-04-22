package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethod extends Base {

	public void parent()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	public void child()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element1 = driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}
	public void followingSibling()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element2 = driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
	}
	public void following()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element3 = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='example my-3']"));
	}
	public void preceding()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element4 = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessMethod accessmethod = new AccessMethod();
		accessmethod.browserInitilization();
		accessmethod.parent();
		accessmethod.followingSibling();
	}

}

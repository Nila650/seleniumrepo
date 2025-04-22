package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base {

	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		simple.click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	}
	public void confirmationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement conf = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		conf.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	public void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("nila");
		driver.switchTo().alert().accept();
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.browserInitilization();
		//alerthandling.simpleAlert();
		//alerthandling.confirmationAlert();
		alerthandling.promptAlert();
	}

}

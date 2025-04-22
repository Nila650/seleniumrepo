package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts  {

	public void alert()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");	
		/*WebElement simple = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simple.click();
		driver.switchTo().alert().accept();*/
		/*WebElement conf = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		conf.click();
		driver.switchTo().alert().accept();*/
		WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("nila");
		driver.switchTo().alert().accept();
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alerts alert = new Alerts();
		alert.alert();
	}

}

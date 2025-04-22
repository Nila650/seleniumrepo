package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox {
	
	
	public void checkBox()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");	
		WebElement check = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		check.click();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox checkbox = new CheckBox();
		checkbox.checkBox();
	}

}

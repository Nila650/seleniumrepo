package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBox {

	public void textBox()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("nila");
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("nila.nivas@gmail");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("nilanivas thenhipalam p o panambra 673636");
		WebElement permanent = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanent.sendKeys("nilanivas thenhipalam p o panambra 673636");
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextBox textbox = new TextBox();
		textbox.textBox();
	}

}

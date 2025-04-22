package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Radio {

	public void radio()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");	
		WebElement button = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		button.click();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radio radio = new Radio();
		radio.radio();
	}

}

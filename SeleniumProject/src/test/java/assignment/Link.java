package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Link {

	public void link()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");	
		//WebElement link= driver.findElement(By.linkText("No Content"));
		//link.click();
		WebElement partial= driver.findElement(By.partialLinkText("Bad Reque"));
		partial.click();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link = new Link();
		link.link();
	}

}

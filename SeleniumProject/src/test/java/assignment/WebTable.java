package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable {

	public void web()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		WebElement web = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		web.click();
		WebElement first = driver.findElement(By.xpath("//input[@id='firstName']"));
		first.sendKeys("Navamika");
		WebElement last = driver.findElement(By.xpath("//input[@id='lastName']"));
		last.sendKeys("Sreenath");
		WebElement mail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		mail.sendKeys("aami@gmail.com");
		WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
		age.sendKeys("21");
		WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
		salary.sendKeys("30000");
		WebElement dep = driver.findElement(By.xpath("//input[@id='department']"));
		dep.sendKeys("design");
		WebElement sub = driver.findElement(By.xpath("//button[@id='submit']"));
		sub.click();
		WebElement delete = driver.findElement(By.xpath("//span[@id='delete-record-1']"));
		delete.click();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebTable webtable = new WebTable();
		webtable.web();
	}

}

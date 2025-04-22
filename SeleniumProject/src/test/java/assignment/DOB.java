package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DOB {

	public void dob()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement hob = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		if(hob.isSelected())
		{
			System.out.println("yes");
		}
		else {
			hob.click();
		}
		/*Select select2 = new Select(city);
		select2.selectByIndex(1);*/
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOB dob = new DOB();
		dob.dob();
	}

}

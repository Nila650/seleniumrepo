package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public void first()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
		name.sendKeys("Nila");
		WebElement last = driver.findElement(By.xpath("//input[@id='lastName']"));
		last.sendKeys("A");
		WebElement mail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		mail.sendKeys("nila.nivas@gmail.com");
		WebElement female = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		female.click();
		WebElement mob = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mob.sendKeys("8547105220");
		
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		WebElement month = driver.findElement(By.xpath("//option[@value='6']"));
		month.click();
		WebElement year = driver.findElement(By.xpath("//option[@value='1996']"));
		year.click();
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, July 4th, 1996']"));
		date.click();
		WebElement add = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		add.sendKeys("nilanivas thenhipalam");
		
	}
	
	public void dob()
	{
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		WebElement month = driver.findElement(By.xpath("//option[@value='6']"));
		month.click();
		WebElement year = driver.findElement(By.xpath("//option[@value='1996']"));
		year.click();
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, July 4th, 1996']"));
		date.click();*/
	}
	
	
	
	public void practice()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		/*WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select select = new Select(month);
		select.selectByVisibleText("September");
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select select1 = new Select(year);
		select1.selectByVisibleText("2011");*/
		/*WebElement hob = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		hob.click();*/
		/*WebElement sub = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		sub.sendKeys("english");
		WebElement check = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		check.click();
		WebElement add = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		add.sendKeys("nilanivas thenhipalam");
		WebElement city = driver.findElement(By.xpath("//div[@id='state']"));
		Select select2 = new Select(city);
		select2.selectByIndex(1);*/
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice practice = new Practice();
		practice.first();
		//practice.dob();
	//	practice.practice();
	}

}

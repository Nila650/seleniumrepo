package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
// WebElement elementname=driver.findElement(By.Locator("locator value"));
	public void id()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement id = driver.findElement(By.id("button-one"));
		WebElement id1 = driver.findElement(By.id("message-one"));
		WebElement id2 = driver.findElement(By.id("value-a"));
		WebElement id3 = driver.findElement(By.id("message-two"));
		WebElement id4 = driver.findElement(By.id("button-two"));
		
		/*id.sendKeys("hello");
		WebElement button = driver.findElement(By.id("jhh"));
		button.click();*/
	}
	public void name()
	{
		WebElement name = driver.findElement(By.name("viewport"));
		WebElement name1 = driver.findElement(By.name("description"));
		WebElement name2 = driver.findElement(By.name("keywords"));
		WebElement name3 = driver.findElement(By.name("author"));
		//WebElement name4 = driver.findElement(By.name(""));
	}
	
	public void className()
	{
		WebElement classOne = driver.findElement(By.className("clearfix"));
		WebElement classTwo = driver.findElement(By.className("container page"));
		WebElement classThree = driver.findElement(By.className("mb-sec"));
		WebElement classFour = driver.findElement(By.className("header-top"));
		WebElement classFive = driver.findElement(By.className("list-group list-group-flush"));
		
	}
	
	public void tagName()
	{
		WebElement tag = driver.findElement(By.tagName("img"));
		//for link "a"
	}
	public void linkText()
	{
		WebElement text = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement textOne = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement textTwo = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement textThree = driver.findElement(By.linkText("Select Input"));
		WebElement textFour = driver.findElement(By.linkText("Jquery Select2"));




	}
	public void partialLinkText()
	{
		WebElement partial = driver.findElement(By.partialLinkText("Simple Form D"));
		WebElement partialOne = driver.findElement(By.partialLinkText("Checkbox De"));
		WebElement PartialTwo = driver.findElement(By.partialLinkText("Radio Butto"));
		WebElement PartialThree = driver.findElement(By.partialLinkText("Select Inp"));
		WebElement PartialFour = driver.findElement(By.partialLinkText("Jquery Sele"));
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators =new Locators();
		locators.id();
		locators.name();
		locators.className();
		locators.linkText();
		locators.partialLinkText();
		
	}

}

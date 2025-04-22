package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {
//Absolute XPath	/html/body/div[1]/input	Starts from the root node (not recommended as it may break easily)
// Relative XPath	//input[@id='username']	Starts from anywhere in the DOM (preferred)
//1.xpath  //tag[@attribute='value']	
public void relativeXpath()
{
	//xpath syntax -  //tag[@attribute='value']
	WebElement xpath = driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement xpath1 = driver.findElement(By.xpath("//button[@id='button-two']"));
	WebElement xpath2 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	
	
}
  public void contains()
  {
	  // syntax - contains   //tag[contains(@attribute,'value')]
	  WebElement contains = driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
	  WebElement contains1 = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	  WebElement contains2 = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
	  
  }
	public void startSwith()
	{
		//startsWith()  //tag[starts-with(@attribute,'value')]
		WebElement starts1 = driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		WebElement starts2 = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement starts3 = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		
	}
	
	public void textOff()
	{
		//text()     //tag[text()='text']
		WebElement text1 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement text2 = driver.findElement(By.xpath("//button[text()='Show Message']"));
			
	}
	//tag[@attribute='value' or @attribute='value']
	//tag[@attribute='value' and @attribute='value']
	public void or()
	{
		//tag[@attribute='value' or @attribute='value']
		WebElement or = driver.findElement(By.xpath("//input[@id='single-input-field' or @class='form-control']"));
		WebElement or1 = driver.findElement(By.xpath("//button[@id='button-one' or @class='btn btn-primary']"));
		WebElement or2 = driver.findElement(By.xpath("//input[@id='value-a' or @class='form-control' ]"));
		WebElement or3 = driver.findElement(By.xpath("//button[@id='button-one' or  @type='button']"));
		WebElement or4 = driver.findElement(By.xpath("//button[@id='button-two' or  @class='btn btn-primary']"));
	}
	
	public void and()
	{
		//tag[@attribute='value' and @attribute='value']
		WebElement and = driver.findElement(By.xpath("//button[@id='button-one' and @class='btn btn-primary']"));
		WebElement and1 = driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
		WebElement and2 = driver.findElement(By.xpath("//input[@id='single-input-field' and @type='text']"));
		WebElement and3 = driver.findElement(By.xpath("//input[@id='value-a' and @type='text']"));
		WebElement and4 = driver.findElement(By.xpath("//button[@id='button-two' and @class='btn btn-primary']"));

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

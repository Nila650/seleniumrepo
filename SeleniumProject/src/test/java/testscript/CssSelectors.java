package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//to locate web element
//1.Tag and ID(tag#id)
		//2.Tag and class(tag.class)
		//3.Tag and Attribute(tag[attribute='value']
		//4.Tag,class,and Attribute(tag.classname[attribute='value']
public class CssSelectors extends Base {

public void tagAndId()
{
	WebElement element1 = driver.findElement(By.cssSelector("button#button-one"));
	WebElement element2 = driver.findElement(By.cssSelector("button#button-two"));
	WebElement element3 = driver.findElement(By.cssSelector("input#value-a"));
	}


public void tagAndClass()
{
	WebElement class1 = driver.findElement(By.cssSelector("div.header-top"));
	WebElement class2 = driver.findElement(By.cssSelector("div.mb-sec"));
	WebElement class3 = driver.findElement(By.cssSelector("section.clearfix"));
}
		
public void tagAndAttribute()
{
	WebElement tag = driver.findElement(By.cssSelector("button[id='button-one']"));
	WebElement tag1 = driver.findElement(By.cssSelector("input[id='value-a']"));
	WebElement tag2 = driver.findElement(By.cssSelector("input[id='value-b']"));
	
	
}
	
public void tagClassAndAttribute()
{
	WebElement Att1 = driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
	WebElement Att2 = driver.findElement(By.cssSelector("input.form-control[id=single-input-field']"));
	WebElement Att3 = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
	
}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

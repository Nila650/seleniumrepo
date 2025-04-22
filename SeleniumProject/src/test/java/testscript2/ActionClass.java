package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class ActionClass extends Base {

	public void actionClass()
	{
		
		//used to perform advanced user interactions
		//mouseover- moveToElement
		//drag and drop- dragAndDrop
		//rightclick-contextClick
		//doubleclick- doublClick
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement drag = driver.findElement(By.xpath("//span[@draggable='true']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions act = new Actions(driver);//pass webelement obj
		act.dragAndDrop(drag, drop).build().perform();//drag and drop,build-to perform multiple action in single step,perform-to act immediate
		//act.moveToElement(drag).build().perform();//mouse over
		//act.doubleClick(drag).build().perform();//double click
		//act.contextClick(drag).build().perform();//rightclick
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionClass actionclass = new ActionClass();
		actionclass.browserInitilization();
		actionclass.actionClass();
	}

}

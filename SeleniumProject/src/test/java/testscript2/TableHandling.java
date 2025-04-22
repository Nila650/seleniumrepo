package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base {
	
	public void printTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tab = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tab.getText());
	}
	
	public void printRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(row1.getText());
	}
	public void cellPrint()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[4]"));
		System.out.println(cell1.getText());
	}
	
	public void columnPrint()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement x:column1)
		{
			System.out.println(x.getText());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling = new TableHandling();
		tablehandling.browserInitilization();
		//tablehandling.printTable();
		//tablehandling.printRow();
		//tablehandling.cellPrint();
		tablehandling.columnPrint();
	}

}

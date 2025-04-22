package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Frame extends Base {

	public void framesHandling() {
		
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		frame.browserInitilization();
		frame.framesHandling();
				
	}

}

package testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
	public WebDriver driver;
	public void browserInitilization()
	{
		 driver = new ChromeDriver();//browser initilization
		driver.get("https://selenium.qabible.in/");//launch url
		driver.manage().window().maximize();//maximize window
		//driver.close();//to close current window
		
		
		
	}
	
	public void driverQuit()
	{
		driver.quit();//to close all window
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.browserInitilization();
		base.driverQuit();
		
		
	}

}

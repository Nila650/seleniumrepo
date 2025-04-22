package testscript;

public class NavigationCommands extends Base  {
	//navigationCommands in selenium used to navigate between webpages
	//moving forward,going back,refresh the page,opening a URL
	//get-navigate to specific url
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");//navigate to specific url
		driver.navigate().back();//go back to previous page
		driver.navigate().forward();//go forward to next page
		driver.navigate().refresh();//to refresh current page
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigationCommands navigationCommands = new NavigationCommands();
		navigationCommands.browserInitilization();
		navigationCommands.navigationCommands();
		//navigationCommands.driverQuit();
	}

}

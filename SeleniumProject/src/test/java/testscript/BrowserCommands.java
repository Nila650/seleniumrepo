package testscript;

public class BrowserCommands extends Base  {

	public void browserCommands()
	{
		//browserCommands in selenium used to provide a way to interact with a browser and perform varrious actions
		String title = driver.getTitle();//to get title of current page
		System.out.println(title);
		String url = driver.getCurrentUrl();//to get current url
		System.out.println(url);
		String pagesource = driver.getPageSource();//getPageSource is a selenium web driver method that returns the  httml source code of current page
		System.out.println(pagesource);
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands =new BrowserCommands();
		browsercommands.browserInitilization();//need to invoke first
		browsercommands.browserCommands();	//second current class methods
	   // browsercommands.driverQuit();// last base class method-quit
	    
	}
}

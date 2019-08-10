package Seleniumbase;

public interface Browser {
	/**
	 * This is a functionality the open the given browser and load the given url
	 * as well as maximize the window and set the basic selenium implicitly wait
	 * @author Lakshmikanth
	 * @param browserName
	 * @param URL
	 * @throws Exception
	 */
	public void startApp(String BrowserName,String Url);
	public void CloseApp();
	public void locateElement(String loctatortype, String value);
	
}

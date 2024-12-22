package Multipletabs;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multiple {
	@Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		@SuppressWarnings("unused")
		String tab1 = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("linkedin.com/in/vignesh-raja-587551229");
		@SuppressWarnings("unused")
		String tab2 = driver.getWindowHandle();
		
		//driver.close();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://equiniti-india.com/");
		@SuppressWarnings("unused")
		String tab4 = driver.getWindowHandle();
		
		
	//	driver.close();
	//	driver.quit();
		
		driver.switchTo().window(tab2);
		Thread.sleep(10);
//		
//		
//		@SuppressWarnings("unused")
//		Set<String> tabs = driver.getWindowHandles();
//		java.util.Iterator<String> iterator = tabs.iterator();
//		
//		while (iterator.hasNext()){
//			
//			driver.switchTo().window(iterator.next());
//			Thread.sleep(10);
//		}
		
//		driver.quit();
		
		
		
		
		
		
}
}
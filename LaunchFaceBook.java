package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFaceBook {
	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://facebook.com"); 
		driver.manage().window().maximize();
		String PageTitle = driver.getTitle();
		System.out.println("FACEBOOK TITLE:" +PageTitle);
		
		}
}

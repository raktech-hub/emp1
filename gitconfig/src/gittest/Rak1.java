package gittest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Rak1 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.gmail.com");
		
		
		
	}

}

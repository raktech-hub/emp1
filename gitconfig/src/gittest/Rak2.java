package gittest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Rak2 {

	public static void main(String[] args) throws Exception
	
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.gmail.com");
		String t=driver.getTitle();
		System.out.println(t);
		String u=driver.getWindowHandle();
		System.out.println(u);
		String v=driver.getCurrentUrl();
		System.out.println(v);
		if(v.contains("https"))
		  {
			System.out.println( "site is safe" );
		  }
		else
		{
			System.out.println("site is not safe");
			}
		// do log in 
		driver.findElement(By.name("identifier")).sendKeys("ranjithj_india@yahoo.co.in");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("R@njith@1632");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		// compose mail 
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		//fill fields in compose mail
		WebElement e=driver.findElement(By.name("to"));
		e.sendKeys("ranjithkumarjonnala24@gmail.com");
		File src=e.getScreenshotAs(OutputType.FILE);
		File dest=new File("d:\\raktesting\\elss.png");
		FileHandler.copy(src, dest);
		driver.findElement(By.name("subjectbox")).sendKeys("sample mail ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("hi \n this is sample test mail");
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		String res=driver.findElement(By.className("bAq")).getText();
		System.out.println(res);
		Thread.sleep(5000);
		//logout
		driver.findElement(By.xpath("//*[starts-with(@aria-label,'Google Account')]/child::span")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//close site
		driver.close();
		

	}

}

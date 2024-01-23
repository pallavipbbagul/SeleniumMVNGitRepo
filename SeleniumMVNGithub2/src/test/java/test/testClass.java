package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class testClass {
	
	public static WebDriver driver;
	@Test(priority=0)
	public void method1()
	{
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1)
	public void method2()
	{
		
		driver.get("https://mvnrepository.com/");
	}

}

package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements IAutoConst {
	public WebDriver driver;
	static{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser){		 
		  if(browser.equalsIgnoreCase("firefox")){
			  driver = new FirefoxDriver();
		  }else if((browser.equalsIgnoreCase("chrome"))){
			  driver=new ChromeDriver();
		  }
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://10.4.8.123:8080/CVWeb/login");			
			driver.manage().window().maximize();
			
				  }
     
	// Assert.assertEquals("Contentverse", driver.getTitle());
	
  @AfterMethod
 public void CloseApplication(){
	driver.close();
}

}

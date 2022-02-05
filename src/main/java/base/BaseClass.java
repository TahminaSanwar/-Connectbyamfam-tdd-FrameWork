package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.CommonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ProductPages;

public class BaseClass {
	public static WebDriver driver;
	public CommonMethods cm;
	public ProductPages productPages;
	

@BeforeMethod
public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.connectbyamfam.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	initElements();
			
	
	
}


@AfterMethod
public void tearUp() {
	driver.quit();
	
}
private void initElements() {
	cm=new CommonMethods();
	productPages=new ProductPages(driver);
	
	
}
}

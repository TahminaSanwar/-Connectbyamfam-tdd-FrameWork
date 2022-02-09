package base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.CommonMethods;
import common.CommonWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ProductPages;
import pages.UpdateCreditCard;
import utilities.Configurable;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static CommonMethods cm;
	public static CommonWaits waits;
	public Configurable configurable;
	public static JavascriptExecutor js;
	public ProductPages productPages;
	public UpdateCreditCard updateCreditCard;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		initElements();
		driver.get(configurable.getUrl());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(configurable.getPageLoadWait()));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configurable.getElementImplicitWait()));
		wait = new WebDriverWait(driver, Duration.ofSeconds(configurable.getExplicitWait()));
	}

	@AfterMethod
	public void tearUp() {
		//driver.quit();
	}


	private void initElements() {
		cm = new CommonMethods();
		waits = new CommonWaits();
		configurable = Configurable.getInstance();
		productPages = new ProductPages(driver);
		updateCreditCard=new UpdateCreditCard(driver);
		js = (JavascriptExecutor) driver;

	}
}

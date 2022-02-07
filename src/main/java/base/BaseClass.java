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

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static CommonMethods cm;
	public static CommonWaits waits;
	public static JavascriptExecutor js;
	public ProductPages productPages;
	public UpdateCreditCard updateCreditCard;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.connectbyamfam.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		initElements();

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();

	}

	private void initElements() {
		cm = new CommonMethods();
		waits = new CommonWaits();
		productPages = new ProductPages(driver);
		updateCreditCard=new UpdateCreditCard(driver);

	}
}

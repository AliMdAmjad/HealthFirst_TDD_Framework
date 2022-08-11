package basePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commonPack.CommonActn;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectPack.HomePage;

public class BaseClass {
	public static WebDriver driver;

	public CommonActn cActn;
	public HomePage hPage;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://healthfirst.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		initClass();

	}

	public void initClass() {
		cActn = new CommonActn();
		hPage = new HomePage(driver);

	}

	@AfterMethod
	public void tearUp() {
		//driver.quit();
	}

}

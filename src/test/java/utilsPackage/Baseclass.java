package utilsPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import OrangeHrmPages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	public WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}
	
	public void loginOrange() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUname("admin@yourstore.com");
		lp.enterPassword("admin");
		lp.clickLoginbutton();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}

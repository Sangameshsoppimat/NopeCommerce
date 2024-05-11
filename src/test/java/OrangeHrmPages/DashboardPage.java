package OrangeHrmPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{
	public WebDriver driver;	
	public DashboardPage(WebDriver sdriver)
	{
		this.driver=sdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/logout']")
	 WebElement Logout;
	
	public void clickOnLogout()
	{
		Logout.click();
	}

}

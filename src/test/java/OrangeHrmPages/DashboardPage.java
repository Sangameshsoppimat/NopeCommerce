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
	
	@FindBy(xpath="//p[normalize-space()='Sales']")
	WebElement Salesdropdown;
	
	@FindBy(xpath="//p[normalize-space()='Configuration']")
	WebElement congidropdown;
	
	public void clickOnLogout()
	{
		Logout.click();
	}
	
	public void clickOnSalesdropdown()
	{
		Salesdropdown.click();
	}
	 
	public void clickOncongiguration()
	{
		congidropdown.click();
	}

}

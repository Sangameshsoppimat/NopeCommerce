package OrangeHrmPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;	
	public LoginPage(WebDriver sdriver)
	{
		this.driver=sdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	 WebElement email;
	
	@FindBy(name="password")
	 WebElement pass;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	 WebElement logbutton;
	
	public void enterUname(String uname)
	{
		email.sendKeys(uname);
	}
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}
	public void clickLoginbutton()
	{
		logbutton.click();
	}
	
	
}

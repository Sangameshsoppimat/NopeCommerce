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
	
	@FindBy(id="Email")
	 WebElement email;
	
	@FindBy(id="Password")
	 WebElement pass;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	 WebElement logbutton;
	
	public void enterUname(String uname)
	{
		email.clear();
		email.sendKeys(uname);
	}
	public void enterPassword(String password)
	{
		pass.clear();
		pass.sendKeys(password);
	}
	public void clickLoginbutton()
	{
		logbutton.click();
	}
	
	
}

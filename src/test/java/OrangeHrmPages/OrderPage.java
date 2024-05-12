package OrangeHrmPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage 
{
	WebDriver driver;
	public OrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//p[normalize-space()='Orders']")
	private WebElement orders;
	
	
	
	public void clickOnOrders()
	{
		orders.click();
	}
	

}

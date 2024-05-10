package OrangeHrmPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage 
{
	WebDriver driver;
	public CatalogPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='nav-link active'])[1]")
	WebElement catlogdropdown;
	
	@FindBy(xpath="//a[@href='/Admin/Product/List']")
	WebElement products;
	
	public void clickOncatlogdropdown()
	{
		catlogdropdown.click();
	}
	public void clickOnproducts()
	{
		products.click();
	}

}

package OrangeHrmPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewProductPage 
{
	WebDriver driver;
	public AddNewProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='Name']")
	private WebElement prodctName;
	
	@FindBy(xpath="//span[@aria-expanded='true']")
	private WebElement clickonCatagory;
	
	@FindBy(xpath="//span[@class='select2-dropdown select2-blue select2-dropdown--above']//ul//li")
	private WebElement selectlistofCatagory;
	
	
}

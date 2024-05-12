package OrangeHrmPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContriesPage 
{
	WebDriver driver;
	public ContriesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//p[normalize-space()='Countries']")
	private WebElement contries;
	
	@FindBy(xpath="//div[@class='row']/div[@class='col-md-12']")
	public List<WebElement> table;
	
//	@FindBy(xpath="//div[@class='dataTables_scroll']//table//tr//td")
//	public List<WebElement> coldata;
	
	
	public void clickOncontries()
	{
		contries.click();
	}
	
	
}

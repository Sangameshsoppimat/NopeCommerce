package OrangeHrmPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
	WebDriver driver;
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="SearchProductName")
	private WebElement prodctName;
	
	@FindBy(id="SearchCategoryId")
	private WebElement searchcatgory;
	
	@FindBy(xpath="//select[@name='SearchCategoryId']/option")
	private List<WebElement> listofProducts;
	
	@FindBy(id="SearchManufacturerId")
	private WebElement manuFacture;
	
	@FindBy(xpath="//select[@id='SearchManufacturerId']/option")
	private List<WebElement> manuFacturelist;
	
	@FindBy(id="SearchVendorId")
	private WebElement vendor;
	
	@FindBy(xpath="//select[@id='SearchVendorId']/option")
	private List<WebElement> vendorslist;
	
	@FindBy(id="search-products")
	private WebElement search;
	
	@FindBy(xpath="//tbody/tr/td[3]")
	private WebElement productName;
	
	@FindBy(xpath="//a[@href='/Admin/Product/Create']")
	WebElement addProduct;
	
	public void searchprodctName(String product)
	{
		prodctName.sendKeys(product);
	
	}
	
	public void searchcatgorydrpdown()
	{
		searchcatgory.click();
	}
	
	public void selectlistofproducts()
	{
		listofProducts.stream().filter(option->option.getText().equalsIgnoreCase("Computers >> Desktops")).forEach(option->option.click());
	}
	public void clickmanuFacture()
	{
		manuFacture.click();
	}
	public void selectmanuFacture()
	{
		manuFacturelist.stream().filter(option->option.getText().equalsIgnoreCase("Apple")).forEach(option->option.click());
	}
	public void clickvendor()
	{
		vendor.click();
	}
	public void selectvendor()
	{
		vendorslist.stream().filter(option->option.getText().equalsIgnoreCase("Vendor2")).forEach(opt->opt.click());
	}
	public void clciksearch()
	{
		search.click();
	}
	public String getproductName()
	{
		return productName.getText();
	}
	public void clickOnaddProduct()
	{
		addProduct.click();
	}
}

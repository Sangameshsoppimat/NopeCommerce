package orangeHrm.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeHrmPages.CatalogPage;
import OrangeHrmPages.LoginPage;
import OrangeHrmPages.ProductsPage;
import utilsPackage.Baseclass;

public class Products extends Baseclass
{
	
	@Test
	public void productPage() throws InterruptedException
	{
		loginOrange();
		CatalogPage cp=new CatalogPage(driver);
		Thread.sleep(5000);
		cp.clickOncatlogdropdown();
		cp.clickOnproducts();
		ProductsPage pd=new ProductsPage(driver);
		pd.searchprodctName("Build your own computer");
		pd.searchcatgorydrpdown();
		pd.selectlistofproducts();
		pd.clickmanuFacture();
		pd.selectmanuFacture();
		pd.clickvendor();
		pd.selectvendor();
		pd.clciksearch();
		productNameAssertion();
		
		
	}

	private void loginOrange() {
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUname("admin@yourstore.com");
		lp.enterPassword("admin");
		lp.clickLoginbutton();
		
	}
	
	private void productNameAssertion()
	{
		ProductsPage pd=new ProductsPage(driver);
		
		String actual = pd.getproductName();
		String expected = "Build your own computer";
		Assert.assertEquals(actual, expected);
	}

}

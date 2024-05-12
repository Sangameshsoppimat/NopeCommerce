package orangeHrm.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import OrangeHrmPages.DashboardPage;
import OrangeHrmPages.OrderPage;
import utilsPackage.Baseclass;

public class Orders extends Baseclass
{
	@Test
	public void searchOrders() throws InterruptedException
	{
		loginOrange();
		DashboardPage dp=new DashboardPage(driver);
		dp.clickOnSalesdropdown();
		
		OrderPage op=new OrderPage(driver);
		op.clickOnOrders();
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='row search-row']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//tbody//tr//td")).getText());
		
	}

}

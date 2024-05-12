package orangeHrm.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OrangeHrmPages.ContriesPage;
import OrangeHrmPages.DashboardPage;
import utilsPackage.Baseclass;

public class Contries extends Baseclass
{
	@Test
	public void searchcontries() throws InterruptedException
	{
		loginOrange();
		DashboardPage dp=new DashboardPage(driver);
		dp.clickOncongiguration();
		
		ContriesPage cp=new ContriesPage(driver);
		cp.clickOncontries();
		
		Thread.sleep(3000);
		
		String xpath = "//div[@class='dataTables_scroll']//tbody/tr[2]/td[count(//div[@class='dataTables_scroll']//thead/tr//th[text()='Name']//preceding-sibling::th)+1]";
	
		List<WebElement> r = driver.findElements(By.xpath(xpath));
		
		for(WebElement rs:r)
		{
			String cont = rs.getText();
			if(cont.equalsIgnoreCase("Afghanistan"))
			{
				WebElement edit = driver.findElement(By.xpath("//div[@class='dataTables_scroll']//tbody//tr[2]//td[12]"));
				edit.click();
			}
		}
	}
	
	
	

}

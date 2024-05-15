package orangeHrm.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import OrangeHrmPages.ContriesPage;
import OrangeHrmPages.DashboardPage;
import utilsPackage.Baseclass;

public class Edit extends Baseclass
{
	 @Test
	    public void clickOnEdit() throws InterruptedException {
	        loginOrange();
	        DashboardPage dp = new DashboardPage(driver);
	        dp.clickOncongiguration();

	        ContriesPage cp = new ContriesPage(driver);
	        cp.clickOncontries();

	        Thread.sleep(3000);
	        clickOnEditbutton("Australia");

	      //  List<WebElement> rows = driver.findElements(By.xpath("//div[@class='dataTables_scroll']//tbody//tr"));

//	        for (WebElement row : rows) {
//	            // Locate the country cell in the row
//	            WebElement countryCell = row.findElement(By.xpath(".//td[2]"));
//	            String countryName = countryCell.getText().trim();
//
//	            // Check if the country name matches "Afghanistan"
//	            if (countryName.equals("Afghanistan")) {
//	                // Find the Edit button for this row
//	              driver.findElement(By.xpath("//td[text()='Afghanistan']//following-sibling::td//a")).click();
//	                break; // Exit the loop after clicking the Edit button for the first matching row
//	            }
//	        }
	    }

	 public void clickOnEditbutton(String countryname)
	 {
		 
		 driver.findElement(By.xpath("//td[text()='"+countryname+"']//following-sibling::td//a")).click();
	 }
}

package orangeHrm.com;

import java.io.IOException;

import org.testng.annotations.Test;

import OrangeHrmPages.DashboardPage;
import OrangeHrmPages.LoginPage;
import utilsPackage.Baseclass;

public class Login extends Baseclass
{
	
	@Test
	public void loginOrange() throws IOException
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUname("admin@yourstore.com");
		lp.enterPassword("admin");
		lp.clickLoginbutton();
		DashboardPage dp=new DashboardPage(driver);
		dp.clickOnLogout();
	}
	
	
	
	

}

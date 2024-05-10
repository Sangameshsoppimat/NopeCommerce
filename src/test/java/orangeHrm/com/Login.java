package orangeHrm.com;

import java.io.IOException;

import org.testng.annotations.Test;

import OrangeHrmPages.LoginPage;
import utilsPackage.Baseclass;

public class Login extends Baseclass
{
	
	@Test
	public void loginOrange() throws IOException
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUname("Admin");
		lp.enterPassword("admin123");
		lp.clickLoginbutton();
	}
	
	

}

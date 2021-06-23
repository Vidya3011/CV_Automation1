package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pom.LoginPage;

public class ValidLogin extends BaseTest{
	 @Test(priority=1)
	public void testValidLogin() throws InterruptedException {
		 int rc=Lib.getRowCount(xlpath, "ValidLogin");
		 for(int i=1;i<=rc;i++) {
		String un=Lib.getCellValue(xlpath, "ValidLogin", i ,0);		
		Reporter.log("Username:" +un,true);
		String pw=Lib.getCellValue(xlpath, "ValidLogin", i, 1);
		Reporter.log("Password:" +pw,true);
		String roomname=Lib.getCellValue(xlpath, "ValidLogin", i, 2);
		Reporter.log("Room:" +roomname,true);
		LoginPage login=new LoginPage(driver);
		login.SetUserName(un);
		login.SetPassword(pw);
		login.SetSelectRooms(roomname);
		login.CheckRememberMe(un,pw);
		login.ClickLoginButton(un, pw, roomname);
		
	}
}
}


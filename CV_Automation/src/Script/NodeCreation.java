package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pom.CreateNode;

public class NodeCreation extends BaseTest {
	//@Test(dependsOnMethods = { "ValidLogin" })
	@Test(priority=3)
	public void testCreateNode() throws InterruptedException {
		 int rc=Lib.getRowCount(xlpath, "CreateNode");
		 for(int i=1;i<=rc;i++) {
		
		String CabinetName=Lib.getCellValue(xlpath,"CreateNode",i,0);
		 Reporter.log("Cabinet:" +CabinetName,true);
		 
		 String DrawerName=Lib.getCellValue(xlpath,"CreateNode",i,1);
		Reporter.log("Drawer:" +DrawerName,true);
		
		 String FolderName=Lib.getCellValue(xlpath,"CreateNode",i,2);
		 Reporter.log("Folder:" +FolderName,true);
		 
		 CreateNode node=new CreateNode(driver);
	      node.CreateDrawerFolder(CabinetName,DrawerName,FolderName);
	   
	   
	}
	}
	}

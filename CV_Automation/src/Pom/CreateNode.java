package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNode {
	@FindBy(id="createNodeAnchorForCabinet")
    private WebElement CreateCabinet;
	
	@FindBy(id="newNodeName13")
    private WebElement CreateCabinetText;
	
	@FindBy(id="createNewNodeOk13")
    private WebElement CreateCabinetOK;
	
	@FindBy(id="createNodeAnchor")
    private WebElement CreateDrawerFolder;
	
	@FindBy(id="newNodeName")
    private WebElement CreateDrawerFolderText;
	
	@FindBy(id="createNewNodeOk")
    private WebElement CreateDrawerFolderOK;

	@FindBy(id="navigationMenuBtn")
    private WebElement RoomName;
	
	@FindBy(xpath=(".//*[@id='createDocuemntNavigator']/ul/li"))
    private WebElement cabinetId;
	

	@FindBy(id="createDocuemntNavigator")
    private WebElement NavTree;
	
	
	public void CreateDrawerFolder(String CabinetName,String DrawerName,String FolderName) throws InterruptedException
	 {
		  WebElement Cabinet = driver.findElement(By.xpath(".//*[@id='viewDocumentnavigator']/ul/li/a"));
		  
		  System.out.println("Cabinet::"+Cabinet.getText());
		  //Cabinet.click();
		  action.click(Cabinet).build().perform();
		  Thread.sleep(2000);
		  action.moveToElement(RoomName).build().perform();
		  Thread.sleep(3000);
		  try{
		  if(CreateCabinet.isEnabled()){
			  action.moveToElement(CreateCabinet).build().perform();
			  CreateCabinet.click();				  
			  CreateCabinetText.sendKeys(CabinetName);
			  CreateCabinetOK.click(); 
		  }
		  }
		  catch(Exception e){
			  System.out.println("Create cabinet permission denied");
		  }
		  
		  action.moveToElement(RoomName).build().perform();
	
		 // action.click(CreateDrawerFolder).build().perform();
		  
		  CreateDrawerFolder.click();
		
		  CreateDrawerFolderText.sendKeys(DrawerName);
		 
		  CreateDrawerFolderOK.click();
		  Thread.sleep(2000);
		  action.moveToElement(RoomName).build().perform();
		 // action.click(CreateDrawerFolder).build().perform();
		  Thread.sleep(2000);
		  CreateDrawerFolder.click();		
		  CreateDrawerFolderText.sendKeys(FolderName);
		  CreateDrawerFolderOK.click();
		 }
}

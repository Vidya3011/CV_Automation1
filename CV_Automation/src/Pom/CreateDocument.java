package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateDocument {
	@FindBy(xpath=("//*[@id='createDocumentSubmit']"))
    private WebElement CreateButton;
	
	@FindBy(xpath=("//*[@id='modelHome']"))
    private WebElement NavigateButton;
	
	@FindBy(xpath=("//*[@id='viewCreatedDocument']"))
    private WebElement ViewButton;
	
	@FindBy(xpath=("//*[@id='modelNewDocument']"))
	private WebElement NewButton;


	@FindBy(id="commentMessage")
    private WebElement DestinationFolder;
	
	@FindBy(id="CommentsMessageModelOk")
    private WebElement DestDialogOK;
	
	@FindBy(id="cvDocumentClose")
    private WebElement CloseVeiwerIcon;
	
	@FindBy(id="createDocumentClear")
    private WebElement ClearButton; 
	@FindBy(id="createDocuemtnLocation")
    private WebElement BrowseFolderNavigator;
	
	
	@FindBy(id="navigatorTreeOk")
    private WebElement navigatorTreeOkButton;
	
	
	@FindBy(id="navigatorTreeCancle")
    private WebElement navigatorTreeCancelButton;
	
	@FindBy(id="retainBtn")
    private WebElement RetainCheck;
	
	@FindBy(id="cvDocumentClose")
    private WebElement CloseVeiwer;
	
	@FindBy(xpath=("//div[@id='messageBox27']"))
    private WebElement SaveDialog;
	
	@FindBy(id="messageButtonOK27")
    private WebElement SaveDialogYes;
	
	@FindBy(id="messageButtonNo27")
    private WebElement SaveDialogNo;
	
	@FindBy(id="messageButtonCancel27")
    private WebElement SaveDialogCancel;
	
	@FindBy(id="addWordFile")
    private WebElement NewWordDocument;

	@FindBy(id="addExcelFile")
    private WebElement NewExcelDocument;
	
	@FindBy(id="addPPTFile")
    private WebElement NewPPTDocument;

}

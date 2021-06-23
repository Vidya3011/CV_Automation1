package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ViewerToolbar {

	@FindBy(id="messageButtonOK26")
    private WebElement DownloadButton;
	
	@FindBy(id="messageButtonOK26")
    private WebElement CancelButton;
	

	@FindBy(xpath=(".//*[@class='ThumbnailHolder']/div[1]/input"))
    private WebElement Thumbnail;
	
	@FindBy(id="messageButtonOK")
    private WebElement OkBtn;
	
	@FindBy(id="copyDoc")
    private WebElement Copy;
	
	@FindBy(id="pastDoc")
    private WebElement Paste;
	
	
	@FindBy(id="rotateClockwise")
    private WebElement RotateClock;
	
	@FindBy(id="rotateCounterClockwise")
    private WebElement RotateAntiClock;
	
	@FindBy(id="downloadPagesDropDown")
    private WebElement DownloadDropdwn;
	
	@FindBy(id="pageDownload_shortcut")
    private WebElement DownloadOption;
	
	@FindBy(id="pageOffline_shortcut")
    private WebElement OfflineOpt;
	
	@FindBy(xpath=(".//*[@class='editproperties']"))
    private WebElement PropertiesUpdateButton;
	
	@FindBy(xpath=(".//*[@class='saveproperties']"))
    private WebElement PropertiesSaveButton;
	
	@FindBy(id="saveAddedPages")
    private WebElement SaveBtn;
	
	@FindBy(id="messageButtonOK42")
    private WebElement SaveOkBtn;
	
	@FindBy(id="fileControl_delete")
    private WebElement DeleteBtn;
	
	@FindBy(id="deleteMessageOk19")
    private WebElement DeleteYesBtn;
	
	@FindBy(id="navigatorTreeCancle19")
    private WebElement DeleteNoBtn;
	
	@FindBy(id="messageButtonOKDEl")
    private WebElement FileDeleteOk;
	
	@FindBy(id="comment")
    private WebElement Comments;
	
	@FindBy(xpath=(".//*[contains(@class,'commentNew')]"))
    private WebElement CommentsNew;
	
	@FindBy(xpath=(".//*[contains(@class,'name form-control')]"))
    private WebElement CommentsNewText;
	

	@FindBy(xpath=(".//*[contains(@type,'check')])"))
    private WebElement CommentsPrivate;
	
	@FindBy(xpath=(".//*[@class='jconfirm-buttons']/button"))
    private WebElement CommentSaveDelete;
	
	@FindBy(id="CommentsMessageModelOk")
    private WebElement CommentsSaveDeleteOK;
	
	@FindBy(xpath=("//*[@class=' commentClass']"))
    private WebElement CommentsOpen;
	
	
	public void Comments() throws InterruptedException{
		Comments.click();
		Thread.sleep(2000);
		CommentsNew.click();
		Thread.sleep(2000);
		CommentsNewText.sendKeys("Comments are added");
		Reporter.log("Comments are added",true);
		/*CommentsPrivate.click();
		if(CommentsPrivate.isSelected()){
			  Reporter.log("Private checkbox is selected",true);
		   
		  }else{
			  Reporter.log("Private checkbox is not selected",true);
			  
		  }*/
		
		CommentSaveDelete.click();
		Thread.sleep(2000);
		CommentsSaveDeleteOK.click();				
		Thread.sleep(2000);
		CommentsNew.click();
		Thread.sleep(2000);
		CommentsNewText.sendKeys("Comments are added second time");
		CommentSaveDelete.click();
		Thread.sleep(2000);
		CommentsSaveDeleteOK.click();				
		Thread.sleep(2000);
		CommentsOpen.click();
		CommentsNewText.sendKeys("Comments are added and deleted at the same time");
		Thread.sleep(2000);
		CommentSaveDelete.click();
		Thread.sleep(2000);
		CommentsSaveDeleteOK.click();	
		Reporter.log("Comments are deleted",true);
	}

}

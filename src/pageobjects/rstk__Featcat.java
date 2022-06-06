package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Featcat"                                
               , summary=""
               , page="Featcat"
               , namespacePrefix="rstk"
               , object="rstk__featcat__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Featcat {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Feature Category']/parent::th/following-sibling::td//input")
	public WebElement featureCategory;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Category Description']/parent::th/following-sibling::td//input")
	public WebElement categoryDescription;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Default Selection Sequence']/parent::th/following-sibling::td//input")
	public WebElement defaultSelectionSequence;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[2]")
	public WebElement delete;
	@ButtonType()
	@FindBy(xpath = "//td/div//td/input")
	public WebElement addDeleteFeatures;
	@ButtonType()
	@FindBy(xpath = "//span[2]/input[@id='features_add']")
	public WebElement add;
	@PageRow()
	public static class Table {

		@TextType()
		@FindByLabel(label = "Feature ID")
		public WebElement featureID;
		@TextType()
		@FindByLabel(label = "Feature Description")
		public WebElement featureDescription;
		@BooleanType()
		@FindBy(xpath = "//tr[1]//input[3]")
		public WebElement select;
		@TextType()
		@FindByLabel(label = "Feature ID")
		public WebElement featureID1;
		@TextType()
		@FindBy(name = "pg:fm:j_id185:j_id186:j_id190:j_id191:j_id200:j_id202:j_id203:gridpbs:gridTable:0:j_id258:0:j_id272")
		public WebElement featureID2;
		@TextType()
		@FindBy(name = "pg:fm:j_id185:j_id186:j_id190:j_id191:j_id200:j_id202:j_id203:gridpbs:gridTable:0:j_id258:1:j_id272")
		public WebElement featureDescription1;
	}
	@FindBy(id = "pg:fm:j_id185:j_id186:j_id190:j_id191:j_id200:j_id202:j_id203:gridpbs:gridTable:tb")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	@ButtonType()
	@FindBy(xpath = "//span[4]//input[@id='features_savebtn']")
	public WebElement save1;
	@ButtonType()
	@FindBy(xpath = "//input[@name='popupOkButton']")
	public WebElement ok;
	@ButtonType()
	@FindBy(xpath = "//span[2]/input[@id='features_removeSelected']")
	public WebElement removeSelected;
	@ButtonType()
	@FindBy(xpath = "//span[2]//input[@id='features_savebtn']")
	public WebElement save2;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Features']")
	public WebElement tab_Features_lbl;
	@ButtonType()
	@FindBy(xpath = "//input[@name='popupCancelButton']")
	public WebElement cancel;
	@ButtonType()
	@FindBy(xpath = "//span[2]//input[@id='features_savebtn']")
	public WebElement save_Popup;
	
}

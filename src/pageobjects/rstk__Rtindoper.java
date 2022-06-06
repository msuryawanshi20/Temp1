package pageobjects;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Rtindoper"                                
               , summary=""
               , page="Rtindoper"
               , namespacePrefix="rstk"
               , object="rstk__rtindoper__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Rtindoper {

	public WebDriver driver;

	public rstk__Rtindoper(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Independent Operation ID']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement independentOperationID;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/ancestor::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description1;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inventory Site']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement inventorySite;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Process ID']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement processID;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Work Center']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement workCenter;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Outside Operation']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement outsideOperation;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Price per Hour']/parent::span/parent::th/following-sibling::td//input")
	public WebElement pricePerHour;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Alt 1 Labor Price per Hour']/parent::span/parent::th/following-sibling::td//input")
	public WebElement alt1LaborPricePerHour;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Alt 2 Labor Price per Hour']/parent::span/parent::th/following-sibling::td//input")
	public WebElement alt2LaborPricePerHour;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Employee Assigned To']/parent::span/parent::th/following-sibling::td//select")
	public WebElement employeeAssignedTo;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inspection Order Template']/ancestor::th/following-sibling::td//select")
	public WebElement inspectionOrderTemplate;

	@TextType()
	@FindBy(xpath = "//*[contains(@id,'tab_Setup_lbl')]")
	public WebElement tab_Setup_lbl;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Time Type']/parent::span/parent::th/following-sibling::td//select")
	public WebElement setupTimeType;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Labor Grade']/parent::span/parent::th/following-sibling::td//select")
	public WebElement setupLaborGrade;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Hours']/parent::span/parent::th/following-sibling::td//input")
	public WebElement setupHours;

	@TextType()
	@FindBy(xpath = "//*[contains(@id,'tab_Run_lbl')]")
	public WebElement tab_Run_lbl;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Run Time Type']/parent::span/parent::th/following-sibling::td//select")
	public WebElement runTimeType;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Run Labor Grade']/parent::span/parent::th/following-sibling::td//select")
	public WebElement runLaborGrade;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Run Hours']/parent::span/parent::th/following-sibling::td//input")
	public WebElement runHours;

	@TextType()
	@FindBy(xpath = "//*[contains(@id,'tab_Machine_lbl')]")
	public WebElement tab_Machine_lbl;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Time Type']/parent::span/parent::th/following-sibling::td//select")
	public WebElement machineTimeType;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Number']/parent::span/parent::th/following-sibling::td//select")
	public WebElement machineNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Hours']/parent::span/parent::th/following-sibling::td//input")
	public WebElement machineHours;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Price per Hour']/parent::span/parent::th/following-sibling::td//input")
	public WebElement machinePricePerHour;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;
	
	
	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;
	

	@ButtonType()
	@FindByLabel(label = "Materials")
	public WebElement materials;

	@ButtonType()
	@FindByLabel(label = "Tasks")
	public WebElement tasks;


	
	
	

	@PageRow()
	public static class MaterialTable {

		@TextType()
		@FindBy(xpath = ".//td[2]//span//input")
		public WebElement itemNumber;

		@TextType()
		@FindBy(xpath = ".//td[3]/input")
		public WebElement quantityPer;

		@BooleanType()
		@FindBy(xpath = ".//td[4]/input")
		public WebElement fixedQty;
	}

	@FindBy(xpath = "//div[normalize-space()='Item Number']//parent::th/parent::tr/parent::thead/following-sibling::tbody//tr")
	@PageTable(firstRowContainsHeaders = false, row = MaterialTable.class)
	public List<MaterialTable> materialTable;

	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement list;

	@ButtonType()
	@FindBy(xpath= "//div[@id='mtlpopup']//input[@value='Add']")
	public WebElement add;

	@ButtonType()
	@FindBy(xpath = "//div[@id='mtlpopup']//input[@name='popupOkButton']")
	public WebElement ok;

	@PageRow()
	public static class TaskTable {

		@TextType()
		@FindBy(xpath = ".//td[2]/input")
		public WebElement taskID;

		@TextType()
		@FindBy(xpath = ".//td[3]/input")
		public WebElement description;

		@BooleanType()
		@FindBy(xpath = ".//td[4]//select")
		public WebElement assignTo;
	}

	@FindBy(xpath = "//div[normalize-space()='Task ID']//parent::th/parent::tr/parent::thead/following-sibling::tbody//tr")
	@PageTable(firstRowContainsHeaders = false, row = TaskTable.class)
	public List<TaskTable> taskTable;
	
	
	
	@ButtonType()
	@FindBy(xpath= "//div[@id='taskpopup']//input[@value='Add']")
	public WebElement addTaskPopup;

	@ButtonType()
	@FindBy(xpath = "//div[@id='taskpopup']//input[@name='popupOkButton']")
	public WebElement okTaskPopup;

}

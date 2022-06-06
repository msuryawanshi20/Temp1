package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Rtroutoper"                                
               , summary=""
               , page="Rtroutoper"
               , namespacePrefix="rstk"
               , object="rstk__rtroutoper__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Rtroutoper {

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Site']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement site;
	
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Operation Number']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement operationNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Process Number']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement process;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Work Center']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement workCenter;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Concurrent Seq']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement concurrentSeq;

	
	@BooleanType
	@FindBy(xpath = "//label[normalize-space(.)='Outside Operation']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement outsideOperation;
	
	
	@BooleanType
	@FindBy(xpath = "//label[normalize-space(.)='Labor Only Operation']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement laborOnlyOperation;



	@ButtonType
	@FindBy(xpath = "//*[contains(@id,'tab_Laborstds_lbl')]")
	public WebElement labor_Stds_tab;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Time Type']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement setupType;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Grade']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement setupLaborGrade;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Hours, Standard']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement setupStandardHours;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Run Time Type']/parent::span/parent::th/following-sibling::td//select")
	public WebElement runType;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Run Grade']/parent::span/parent::th/following-sibling::td//select")
	public WebElement runLaborGrade;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Run Hours, Standard']/parent::span/parent::th/following-sibling::td//input")
	public WebElement runStandardHours;

	@ButtonType
	@FindBy(xpath = "//*[contains(@id,'tab_Machinestds_lbl')]")
	public WebElement machine_Stds_tab;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Type']/parent::span/parent::th/following-sibling::td//select")
	public WebElement machineType;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Number']/parent::span/parent::th/following-sibling::td//select")
	public WebElement machineNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Hrs, Std']/parent::span/parent::th/following-sibling::td//input")
	public WebElement standardMachineHours;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@ButtonType
	@FindBy(xpath = "//*[contains(@id,'tab_Options_lbl')]|//*[contains(@id,'tab_Qty_Reporting_Options_lbl')]")
	public WebElement options_Tab;

	@BooleanType
	@FindBy(xpath = "//*[contains(@name,'allowaccind')]")
	public WebElement allowAcceptFlag;

	@ButtonType()
	@FindBy(xpath = "//*[contains(@id,'tab_Move_Lead_Times_lbl')]|//*[contains(@id,'tab_Subcontract_lbl')]")
	public WebElement subConMoveLeadTimeTab;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Subcontract Lead Time']/parent::span/parent::th/following-sibling::td//input")
	public WebElement subcontractLeadTime;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Std Option']/parent::span/parent::th/following-sibling::td//select")
	public WebElement setupStdOption;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Hours, Simulated']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement setupHoursSimulated;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Run Hours, Simulated']/parent::span/parent::th/following-sibling::td//input")
	public WebElement runHoursSimulated;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Run Std Option']/parent::span/parent::th/following-sibling::td//select")
	public WebElement RunStdOption;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Std Option']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement machineStdOption;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Hrs, Sim']/parent::span/parent::th/following-sibling::td//input")
	public WebElement machineHrsSim;

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;
	
	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;
	
}

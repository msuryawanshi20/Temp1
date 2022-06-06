package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage(title = "Rstk__ Rtwctr", summary = "", page = "Rtwctr", namespacePrefix = "rstk", object = "rstk__rtwctr__c", connection = "QARSF_Admin")
public class rstk__Rtwctr {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Work Center Number']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement workCenterNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Mfg Department']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement mfgDepartment;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Responsible Planner']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement responsiblePlanner;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Issue Location ID']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement issueLocationID;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Total Capacity Labor Hrs/Day']/parent::span/parent::th/following-sibling::td//input")
	public WebElement totalCapacityLaborHrsDay;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Length of Production Day - Labor Hrs']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lengthOfProductionDayLaborHrs;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Total Capacity Machine Hrs/Day']/parent::span/parent::th/following-sibling::td//input")
	public WebElement totalCapacityMachineHrsDay;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Sequence Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement sequenceNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Scheduling Factor']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement schedulingFactor;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Work Center Concurrent Sequence Option']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement workCenterConcurrentSequenceOption;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Queue Days']/parent::span/parent::th/following-sibling::td//input")
	public WebElement queueDays;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Work Center Number']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement workCenterNumber1;

}

package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.VisualforceBy;

@SalesforcePage(title = "Rstk__ Manufacturing",
				summary = "", 
				page = "Manufacturing", 
				namespacePrefix = "rstk", 
				object = "rstk__menu__c", 
				connection = "QARSF_Admin")
public class rstk__Manufacturing {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Site to Site Transfer']")
	public WebElement siteToSiteTransfer;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Location to Location Transfer']")
	public WebElement locationToLocationTransfer;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Site Master']")
	public WebElement siteMaster;

	@LinkType()
	@FindBy(linkText = "Inventory by Item/Site/Project")
	public WebElement inventoryByItemSiteProject;

	@LinkType()
	@FindBy(linkText = "Inventory by Item/Project")
	public WebElement inventoryByItemProject;

	@LinkType()
	@FindBy(linkText = "Inventory by Serial Number")
	public WebElement inventoryBySerialNumber;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Disassembly Order']")
	public WebElement disassemblyOrder;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='WO Issue']")
	public WebElement wOIssue;

	@LinkType()
	@FindBy(xpath = "//div/li/a[normalize-space(.)='Work Orders']")
	public WebElement workOrders;

	@LinkType()
	@FindBy(linkText = "Sales Order Header")
	public WebElement salesOrderEntry;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location Add']")
	public WebElement inventoryLocationAdd;

	@LinkType()
	@FindBy(linkText = "Rootstock Site Map")
	public WebElement rootstockSiteMap;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Order Header']")
	public WebElement purchaseOrderEntry;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Order Receipts']")
	public WebElement purchaseOrderReceipts;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PO Receipt Transactions']")
	public WebElement pOReceiptTransactions;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Cost Transactions']")
	public WebElement inventoryCostTransactions;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Engineering Item Master']")
	public WebElement engineeringItemMaster;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PO Issue']")
	public WebElement pOIssue;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Order Authorization']")
	public WebElement purchaseOrderAuthorization;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PO-AP Match']")
	public WebElement pOAPMatch;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Requisition']")
	public WebElement purchaseRequisition;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='PO Receipt Reversals']")
	public WebElement pOReceiptReversals;

	@FindBy(xpath = "//a[normalize-space(.)='PO Issue Reversal']")
	public WebElement pOIssueReversal;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Division to Division Transfer']")
	public WebElement divisionToDivisionTransfer;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='POLOADER']")
	public WebElement pOLOADER;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Requisitions']")
	public WebElement inventoryRequisitions;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Requisition Workbench']")
	public WebElement inventoryRequisitionWorkbench;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Item Master']")
	public WebElement purchaseItemMaster;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Vendor Class']")
	public WebElement vendorClass;

	@LinkType()
	@FindBy(linkText = "Project to Project Transfer")
	public WebElement projectToProjectTransfer;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location Adjust']")
	public WebElement inventoryLocationAdjust;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Unit Cost Adjust']")
	public WebElement inventoryUnitCostAdjust;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Order Agreement']")
	public WebElement purchaseOrderAgreement;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inspection Order']")
	public WebElement inspectionOrder;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Cost Transaction Query']")
	public WebElement costTransactionQuery;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Time and Qty Booking']")
	public WebElement timeAndQtyBooking;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='WO Receipt']")
	public WebElement wOReceipt;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='WO Receipt Reversal']")
	public WebElement wOReceiptReversal;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Time and Qty Booking Reversal']")
	public WebElement timeAndQtyBookingReversal;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='WO Issue Reversal']")
	public WebElement wOIssueReversal;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Routing Master']")
	public WebElement routingMaster;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Manufacturing Department']")
	public WebElement manufacturingDepartment;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Manufacturing Work Center']")
	public WebElement manufacturingWorkCenter;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Manufacturing Processes']")
	public WebElement manufacturingProcesses;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Manufacturing Labor Grade']")
	public WebElement manufacturingLaborGrade;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Manufacturing Machine Master']")
	public WebElement manufacturingMachineMaster;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Labor Pay Type']")
	public WebElement laborPayType;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Work Center Group']")
	public WebElement workCenterGroup;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Independent Operations']")
	public WebElement independentOperations;

	@LinkType()
	@FindBy(xpath = "//a[contains(normalize-space(.),'General Journal Entries')]")
	public WebElement generalJournalEntries;

	@FindBy(xpath = "//a[normalize-space(.)='MRP Launch']")
	public WebElement MRPLaunch;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Post by Transaction']")
	public WebElement postByTransaction;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Post by Session']")
	public WebElement postBySession;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Change Payment Method']")
	public WebElement changePaymentMethod;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Void AP Payments']")
	public WebElement voidAPPayments;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='GL Transaction Inquiry']")
	public WebElement gLTransactionInquiry;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Postings Summary Report']")
	public WebElement postingsSummaryReport;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Generate Recurring Billing']")
	public WebElement generateRecurringBilling;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Company Master']")
	public WebElement companyMaster;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Division Master']")
	public WebElement divisionMaster;


	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Authorizers']")
	public WebElement authorizers;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Organizational Departments']")
	public WebElement organizationalDepartments;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='UOM Conversion Factors']")
	public WebElement UOMConversionFactors;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Unit of Measure Master']")
	public WebElement UnitOfMeasureMaster;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location Numbers']")
	public WebElement inventoryLocationNumbers;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[5]/div[1]/div/div[2]/div/li[19]//a[1]")
	public WebElement currencyMaster;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Order Number Assign']")
	public WebElement OrderNumberAssign;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location IDs']")
	public WebElement InventoryLocationIDs;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Division Address']")
	public WebElement divisionAddress;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Scrap Reason Codes']")
	public WebElement scrapReasonCodes;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Terms Code']")
	public WebElement termsCode;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[5]/div[1]/div/div[2]/div/li[15]//a[1]")
	public WebElement inventoryCommodityCode;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='VAT Class']")
	public WebElement VATClass;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Feature Category']")
	public WebElement featureCategory;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='State/ Province Code']")
	public WebElement stateProvinceCode;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[5]/div[1]/div/div[2]/div/li[24]//a[1]")
	public WebElement systemDefaults;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Cost Accounting User Control Record']")
	public WebElement costAccountingUserControlRecord;

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[5]/div[1]/div/div[2]/div/li[5]//a[1]")
	public WebElement manufacturingUsers;
}

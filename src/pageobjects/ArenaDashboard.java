package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ArenaDashboard"                                
     , summary=""
     , relativeUrl=""
     , connection="Arena"
     )             
public class ArenaDashboard {

	@LinkType()
	@FindBy(linkText = "Dashboard")
	public WebElement dashboard;
	@LinkType()
	@FindBy(linkText = "Items")
	public WebElement items;
	@LinkType()
	@FindBy(xpath = "//li[@id='items-Create']/a")
	public WebElement create;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='form_category_id']")
	public WebElement Category;
	@LinkType()
	@FindBy(xpath = "//a[@id='wizardButton']")
	public WebElement ItemNumberAddButton;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='wizard-select-dropdown-1']")
	public WebElement NumberFormat;
	@TextType()
	@FindBy(xpath = "//input[@id='wizard-field-input-3']")
	public WebElement ItemNumber;
	@TextType()
	@FindBy(xpath = "//input[@name='form_version']")
	public WebElement Revision;
	@TextType()
	@FindBy(xpath = "//input[@name='form_item_name']")
	public WebElement ItemName;
	@TextType()
	@FindBy(xpath = "//textarea[@id='formDescription']")
	public WebElement Description;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='form_uom']")
	public WebElement Unit_of_Measure;
	@TextType()
	@FindBy(xpath = "//td[contains(text(),'ComodityCode')]/following::td//input")
	public WebElement ComodityCode;
	@TextType()
	@FindBy(xpath = "//td[contains(text(),'Socomm')]/following::td//input")
	public WebElement Socomm;
	@ButtonType()
	@FindBy(xpath = "//input[@id='itemsdetailaddBtn']")
	public WebElement Create_Item;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Create']")
	public WebElement Create;
	@TextType()
	@FindBy(xpath = "//div[@id='infr-Mes']//h3//span")
	public WebElement ItemCreatedMessage;
	@LinkType()
	@FindBy(xpath = "//li[@id='vw_bom']/a")
	public WebElement BillOfMaterials;
	@LinkType()
	@FindBy(xpath = "//a[@id='bom_command_add_btn']")
	public WebElement BOM_PlusButton;
	@ButtonType()
	@FindBy(xpath = "//input[@id='btn-CreateNewItem-action']")
	public WebElement createBOM;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Add to BOM']")
	public WebElement addToBOM;
	@LinkType()
	@FindBy(xpath = "//li[@id='vw_sourcing']/a")
	public WebElement sourcing;
	@LinkType()
	@FindBy(xpath = "//a[@title='Create New Relationship']")
	public WebElement AddSourcing_button;
	@ButtonType()
	@FindBy(xpath = "//input[@name='select_vendor_p']")
	public WebElement specifyVendorItem;
	@TextType()
	@FindBy(xpath = "//input[@name='supplier_name']")
	public WebElement Supplier_Name;
	@ButtonType()
	@FindBy(xpath = "//input[@id='btn-FindSupplier-action']")
	public WebElement findSupplier;
	@BooleanType()
	@FindBy(xpath = "//tr[1]/td[1]/input[@name='top_checkbox']")
	public WebElement SupplierName_select;
	@ButtonType()
	@FindBy(xpath = "//input[@id='itemsdetailitemBtn']")
	public WebElement selectSupplier;
	@ButtonType()
	@FindBy(xpath = "//input[@id='btn-ExistingSupplierItem-action']")
	public WebElement selectExistingSupplierItem;
	@BooleanType()
	@FindBy(xpath = "//tr[2]/td[2]/input[@name='btm_checkbox']")
	public WebElement SupplierItem;
	@ButtonType()
	@FindBy(xpath = "//input[@id='itemsdetailBtn']")
	public WebElement saveRelationship;
	@LinkType()
	@FindBy(xpath = "//a[@id='btn_Release_to_Design_items_detail_sourcing']")
	public WebElement releaseToDesign;
	@ButtonType()
	@FindBy(xpath = "//input[@id='btn-DataEntryForm-action']")
	public WebElement enterInformation;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='option_item_revision']")
	public WebElement revision;
	@TextType()
	@FindBy(xpath = "//span[@id='badge-title']")
	public WebElement Phase;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Specify Manufacturer Item']")
	public WebElement specifyManufacturerItem;
			
}

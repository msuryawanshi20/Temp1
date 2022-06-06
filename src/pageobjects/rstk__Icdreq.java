package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Icdreq"                                
               , summary=""
               , page="Icdreq"
               , namespacePrefix="rstk"
               , object="rstk__icdreq__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Icdreq {
	public WebDriver driver;

	public rstk__Icdreq(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//input[@id='icdreq_item__c_autocomplete']")
	public WebElement DerivedComponentItem;

	@TextType()
	@FindBy(id = "li-0")
	public WebElement DerivedComponentItemLookup;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Expected Qty']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement expectedQty;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Actual Yield Qty']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement actualYieldQty;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Cost Allocation Pct']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement costAllocationPct;
	
	
	
	
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Disassy Good Loc ID']/parent::span/parent::th/following-sibling::td//select")
	public WebElement disassyGoodLocID;
	
	
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Disassy Good Loc No']/parent::span/parent::th/following-sibling::td//input")
	public WebElement disassyGoodLocNo;
	
	
	

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Responsible User']/parent::span/parent::th/following-sibling::td//select")
	public WebElement responsibleUser;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Lot Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lotNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Lot Exp Date']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lotExpDate;





	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Serial Numbers']/parent::span/parent::th/following-sibling::td//textarea")
	public WebElement serialNumbers;

	public void setSerial(String serial) {
		driver.findElement(By.xpath(
				"//label[normalize-space(.)='Serial Numbers']/parent::span/parent::th/following-sibling::td//textarea"))
				.sendKeys(serial + "\n");
	}

}

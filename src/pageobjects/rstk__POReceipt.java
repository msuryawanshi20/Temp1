package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ PO Receipt"                                
               , summary=""
               , page="POReceipt"
               , namespacePrefix="rstk"
               , object="rstk__porcpt_ui__c"
               , connection="QARSFAdmin"
     )             
public class rstk__POReceipt {

	public WebDriver driver;

	public rstk__POReceipt(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@ChoiceListType()
	@FindBy(name = "pg:fm:pb:pbs_Main:j_id119:porcv_pohdr__c:j_id121:j_id127")
	public WebElement OrderNumber;
	@TextType()
	@FindBy(id = "pg:fm:pb:pbs_Main:j_id137:porcv_packslipno__c")
	public WebElement packingSlipNumber;
	@ButtonType()
	@FindByLabel(label = "Perform Receipt")
	public WebElement performReceipt;
//	@PageTable(row = Porcvlines.class)
//	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_porcvlines']")
//	public List<Porcvlines> porcvlines;
	
	@FindBy(xpath = "//table[@class='list']/tbody[contains(@id,'porcvlines')]/tr")
	@PageTable(firstRowContainsHeaders = false, row = Porcvlines.class)
	public List<Porcvlines> porcvlines;
	@PageRow(byColumn = true)
	public static class Porcvlines {

		@TextType()
		@FindBy(xpath = "//td[6]/input")
		public WebElement receiptQty;
		
		@ChoiceListType()
		@FindBy(xpath = "//select/option")
		public WebElement locationID;
		
		@TextType()
		@FindBy(xpath = "//td[8]/input")
		public WebElement locationNumber;
		
		@TextType
		@FindBy(xpath = ".//td[3]/span/a")
		public WebElement Item;
//		@LinkType()
//		@FindBy(xpath = "//a[normalize-space(.)='edit Serial Nos ... ...']")
//		public WebElement serialNumbers;
		@LinkType
		@FindBy(xpath = ".//td[15]//a[contains(text(),'edit Serial Nos ... ...')]")
		public WebElement serialNumbers;
		
		@TextType()
//		@FindBy(xpath = ".//td[15]//div[contains(@id,'srlnums')]//td[contains(text(),'Start #')]/parent::tr/td[2]/input")
		@FindBy(xpath = ".//td[15]//a[contains(text(),'edit Serial Nos ... ...')]/parent::span/parent::td//div[contains(@id,'srlnums')]//th[contains(text(),'Serial Numbers')]/parent::tr/following-sibling::tr//table/tbody/tr[1]/td[2]/input")
		public WebElement start_srlno__c;
		
		@ButtonType()
//		@FindBy(xpath = ".//td[15]//div[contains(@id,'srlnums')]//input[contains(@onclick,'start_srlno__c')]")
		@FindBy(xpath = ".//td[15]//a[contains(text(),'edit Serial Nos ... ...')]/parent::span/parent::td//div[contains(@id,'srlnums')]//input[contains(@onclick,'start_srlno__c')]")
		public WebElement generate;
		
		@LinkType()
		@FindBy(xpath = ".//td[15]//div[contains(@id,'srlnums')]//a")
		public WebElement close;
		
//		@TextType()
//		@VisualforceBy(componentXPath = "apex:inputText[@id='rcvln_lotno__c']")
//		public WebElement lotNumbers;
		@TextType
		@FindBy(xpath = ".//td[11]//input")
		public WebElement lotNumbers;
		
		@TextType
		@FindBy(xpath = ".//td[13]//input")
		public WebElement lotExpirationDate;
//		@TextType()
//		@VisualforceBy(componentXPath = "apex:inputField[@id='lot_expirationdate__c']")
//		public WebElement lotExpirationDate;
	}
	
		public void Click(String Item) throws InterruptedException {

		Thread.sleep(2000);

		WebElement srlno = driver.findElement(
				By.xpath("//a[contains(text(),'" + Item + "')]//ancestor::tr/td[15]//a[contains(text(),'edit Serial Nos ... ...')]"));

		srlno.click();


	}
}

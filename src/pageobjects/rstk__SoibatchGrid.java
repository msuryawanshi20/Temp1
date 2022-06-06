package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Soibatch Grid"                                
               , summary=""
               , page="SoibatchGrid"
               , namespacePrefix="rstk"
               , object="rstk__soibatch__c"
               , connection="QARSF_Admin"
     )             
public class rstk__SoibatchGrid {

	@TextType()
	@VisualforceBy(componentXPath = "c:standardHeader//h2[contains(@class, \"pageDescription\")]")
	public WebElement InvSelectionPageTitle;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Add Selected Invoices to Batch'][1]")
	public WebElement addSelectedInvoicesToBatch;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Remove Selected Invoices From Batch'][1]")
	public WebElement RemoveSelectedInvoicesToBatch;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'soinvTable')]//a")
	public WebElement InvSelected;
	@TextType()
	@FindBy(xpath = "//div[contains(text(),'No invoices found.')]")
	public WebElement InvRemovedMsg;
	
	/*@PageTable(row = AddToBatchSoinvs.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='addToBatchSoinvTable']")
	public List<AddToBatchSoinvs> addToBatchSoinvs;
	@PageRow(byColumn = true)
	public static class AddToBatchSoinvs {

		@BooleanType()
		@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='addToBatchSoinvTable']//apex:inputCheckbox[@id='selected']")
		public WebElement InvoiceNumberselected;
	}*/
	
	
	public WebDriver driver;

	public rstk__SoibatchGrid(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void Check(String InvoiceNum) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(
				By.xpath("//a[text()='" + InvoiceNum + "']/preceding::td[1]//input[@type='checkbox']"));
 
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }


	}
	
}

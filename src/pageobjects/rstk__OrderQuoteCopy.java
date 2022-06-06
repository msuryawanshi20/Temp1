package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Order Quote Copy"                                
               , summary=""
               , page="OrderQuoteCopy"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="Devqaff"
     )             
public class rstk__OrderQuoteCopy {

	@PageTable(row = Solines.class)
	@FindBy(xpath = "//table[@class='list']//tbody//tr")
	//@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='soLineDetails']")
	public List<Solines> solines;


	@PageRow(byColumn = true)
	public static class Solines {

		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@id='rowSelected']")
		public WebElement sel;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@id='createnew']")
	public WebElement createNewSalesOrder;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement orderNumber_copy;
	
}

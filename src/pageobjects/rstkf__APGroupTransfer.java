package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__ AP Group Transfer"                                
               , summary=""
               , page="APGroupTransfer"
               , namespacePrefix="rstkf"
               , object="rstkf__apinvh__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__APGroupTransfer {

	@ButtonType()
	@FindBy(xpath = "//td/span/input")
	public WebElement search;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Doc No.']/parent::th/following-sibling::td//input")
	public WebElement docNo;
	@PageTable(row = Vouchers.class)
//	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_vouchers']")
	@FindBy(xpath = "//table[contains(@id,'pbt_vouchers')]")
	public List<Vouchers> vouchers;
	@PageRow(byColumn = true)
	public static class Vouchers {

		@BooleanType()
		@FindBy(xpath = "/td//input[1]")
		public WebElement select;
	}
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'selectAll')]")
	public WebElement selectAll;
	@ButtonType()
	@FindBy(xpath = "//span//td[2]/span/input[2]")
	public WebElement postpayables;
	
}

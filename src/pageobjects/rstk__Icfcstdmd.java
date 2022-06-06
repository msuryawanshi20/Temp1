package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Icfcstdmd"                                
               , summary=""
               , page="Icfcstdmd"
               , namespacePrefix="rstk"
               , object="rstk__icfcstdmd__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Icfcstdmd {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Forecast Order']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement ForecastOrder;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'icfcstdmd_item')]")
	public WebElement ItemName;
	
	@TextType()
	@FindBy(id = "li-0")
	public WebElement ItemName_Select;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'icfcstdmd_strtdte')]/following::a[1]")
	public WebElement StartDate;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'icfcstdmd_enddte')]/following::a[1]")
	public WebElement EndDate;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'icfcstdmd_qtyreq')]")
	public WebElement Quantity;
	
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'icfcstdmd_ordno')]//span//span")
	public WebElement ForecastOrder_created;
	
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'icfcstdmd_dmdsts_pl')]")
	public WebElement StatusPicklist;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save' and @type='submit']")
	public WebElement Save;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Delete' and @type='submit']")
	public WebElement Delete;
	
}

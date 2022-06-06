package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Syumcf"                                
               , summary=""
               , page="Syumcf"
               , namespacePrefix="rstk"
               , object="rstk__syumcf__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Syumcf {

	@ChoiceListType()
	@FindBy(xpath = "//span/div/div/select")
	public WebElement Conversion_Type;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='From UOM']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement From_UOM;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='To UOM']/parent::span/parent::th/following-sibling::td//select")
	public WebElement To_UOM;
	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement unitOfMeasureConversionFactor;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	
}

package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sycmp"                                
               , summary=""
               , page="Sycmp"
               , namespacePrefix="rstk"
               , object="rstk__sycmp__c"
               , connection="qarsf_admin"
     )             
public class rstk__Sycmp {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Company Number']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement companyNumber;
	@BooleanType()
	@FindBy(xpath = "//div/div/div/table/tbody/tr/td/span/span/input")
	public WebElement centralizedEngineeringIndicator;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td//input")
	public WebElement description;
	@ButtonType()
	@FindBy(xpath = "//form/div[1]/div/div/div/div[1]//input[1]")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//h4[normalize-space(.)='Error:']")
	public WebElement Error;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Number Of Accounting Dimensions']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Acc_Dims;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Dimension1 Source']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Dim1;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Dimension2 Source']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Dim2;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Dimension3 Source']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Dim3;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Dimension4 Source']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Dim4;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='FIFO Cost Method Active']/parent::span/parent::th/following-sibling::td//input")
	public WebElement fIFOCostMethodActive;
	@ButtonType()
	@FindBy(xpath = "//div[3]//td[2]/span/input[1]")
	public WebElement save1;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Rootstock Site Map']")
	public WebElement rootstockSiteMap;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Dimensions']")
	public WebElement tab_Dimensions_lbl;
	@BooleanType()
	@FindBy(xpath = "//td/div//div/input")
	public WebElement suppressDimensionDetails;
	
}

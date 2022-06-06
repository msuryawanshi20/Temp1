package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__sysite"                                
               , summary=""
               , page="Sysite"
               , namespacePrefix="rstk"
               , object="rstk__sysite__c"
               , connection="Devqaff"
     )             
public class rstk__sysite {

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;

	@TextType()
	@FindBy(xpath = "//h4[normalize-space(.)='Errors']")
	public WebElement Error_Message;

	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[1]")
	public WebElement Error_1;

	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[2]")
	public WebElement Error_2;

	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[3]")
	public WebElement Error_3;

	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[4]")
	public WebElement Error_4;

	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[5]")
	public WebElement Error_5;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Site Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement siteNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td//input")
	public WebElement description;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Location Number Required Ind']/parent::span/parent::th/following-sibling::td//input")
	public WebElement locationNumberRequiredInd;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Related Site']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Related_Site;

	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement Dim;


	@ButtonType()
	@FindBy(xpath = "//td[2]/span/input[1]")
	public WebElement Edit;


	@TextType()
	@FindBy(xpath = "//input[@id='sysite_dimval__c_autocomplete']")
	public WebElement Acc_Dim_Value;
	
	
	
}

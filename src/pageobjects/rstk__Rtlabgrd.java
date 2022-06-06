package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Rtlabgrd"                                
               , summary=""
               , page="Rtlabgrd"
               , namespacePrefix="rstk"
               , object="rstk__rtlabgrd__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Rtlabgrd {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Labor Grade Number']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement laborGradeNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Hourly Rate Option']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement hourlyRateOption;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Sales Price per Hour']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement salesPricePerHour;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Hourly Rate, Sim']/parent::span/parent::th/following-sibling::td//input")
	public WebElement hourlyRateSim;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Hourly Rate, Std']/parent::span/parent::th/following-sibling::td//input")
	public WebElement hourlyRateStd;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Name']/parent::th/following-sibling::td[1]//span")
	public WebElement name;
}

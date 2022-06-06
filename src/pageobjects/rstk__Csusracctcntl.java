package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Csusracctcntl"                                
               , summary=""
               , page="Csusracctcntl"
               , namespacePrefix="rstk"
               , object="rstk__csusracctcntl__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Csusracctcntl {

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='User ID']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement User_ID;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Transaction ID']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Transaction_ID;
	@ButtonType()
	@FindBy(xpath = "//div[3]//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)=concat('Today',\"'\",'s Date')]/parent::span/parent::th/following-sibling::td//input")
	public WebElement todaySDateNew;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Backdate']/parent::span/parent::th/following-sibling::td//input")
	public WebElement backdateNew;
	
}

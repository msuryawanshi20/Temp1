package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="JournalEntryHeader"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class JournalEntryHeader {

	@ButtonType()
	@FindBy(xpath = "//input[@name='new']")
	public WebElement New;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'gljh_jeno')]")
	public WebElement jEReferenceNumber;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Originating Template']/parent::th/following-sibling::td//select")
	public WebElement gljh_gljetemplth__c;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@id='saveEntry']")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'gljh_number')]//span")
	public WebElement journalNumber;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'date_view')]//span")
	public WebElement journalDate;
	@LinkType()
	@FindBy(xpath = "//span[contains(@id,'glyear')]//a")
	public WebElement year;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'period')]")
	public WebElement period;
	@TextType()
	@FindBy(xpath = "//span[@class='helpButton']/following::td//span[contains(@id,'gjno_view')]")
	public WebElement jEReferenceNumber1;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'gljhStatus_of')]")
	public WebElement status;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@id='details']")
	public WebElement jEDetailMaintenance;
	@TextType()
	@FindBy(xpath = "//div/h3[normalize-space(.)='Journal Entry Details']")
	public WebElement JournalEntryDetails_Title;
	@ButtonType()
	@FindBy(xpath = "//input[@name='popupCancelButton']")
	public WebElement cancel;
	@ButtonType()
	@FindBy(xpath = "//input[@id='deleteEntry']")
	public WebElement deleteEntry;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@id='testEntry']")
	public WebElement testEntry;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@id='postEntry']")
	public WebElement postEntry;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'totalDebits')]")
	public WebElement totalDebits;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'totalCredits')]")
	public WebElement totalCredits;
			
}

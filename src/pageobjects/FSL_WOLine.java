package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="FSL_WOLine"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class FSL_WOLine {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[3]//a[normalize-space(.)='New']")
	public WebElement New;
	@TextType()
	@FindBy(xpath = "//span[@class='test-id__field-label' and text()='Work Order Line Item Number']/following::div//span//span[1]")
	public WebElement LineItemNumber;
	@LinkType()
	@FindBy(xpath = "//span[@class='test-id__field-label' and text()='Work Order']/following::div//span//a")
	public WebElement WorkOrder;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Related']")
	public WebElement related;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Field Service']")
	public WebElement fieldService;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[3]//div[3]/div/div/table/tbody/tr/td[4]/div/a[normalize-space(.)='Show Actions']")
	public WebElement showActions;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Arrival Window Start']")
	public WebElement editArrivalWindowStart;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[2]/div/div/div[1]/div[1]/div/div/fieldset/div/div[1]/input")
	public WebElement date;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[2]/div/div/div[1]/div[1]/div/div/fieldset//a[normalize-space(.)='Date Picker']")
	public WebElement arrivalWindowStart;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Today']")
	public WebElement today;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[2]/div/div/div[2]/div[1]//a[normalize-space(.)='Date Picker']")
	public WebElement arrivalWindowEnd;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//article//button[normalize-space(.)='Save']")
	public WebElement save;
	@LinkType()
	@FindBy(xpath = "//h1[text()='Assigned Resources']/following::div[@title='New']")
	public WebElement NewResource;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Scheduled Start']")
	public WebElement editScheduledStart;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[1]/div[2]/div/div/fieldset//a[normalize-space(.)='Date Picker']")
	public WebElement scheduledStart;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[2]/div/div/div[2]/div[2]//a[normalize-space(.)='Date Picker']")
	public WebElement scheduledEnd;
	@LinkType()
	@FindBy(xpath = "//span[@class='test-id__field-label' and text()='Parent Record']/following::div//span//a")
	public WebElement parentRecordId;
	@LinkType()
	@FindBy(xpath = "//span[@title='Assigned Resources']")
	public WebElement AssignedResources_link;
	@LinkType()
	@FindBy(xpath = "//li[@class='slds-breadcrumb__item slds-line-height--reset']//a[@title='Service Appointments']/following::li//a")
	public WebElement ServiceAppointments_link;
	
	
	
	
			
}

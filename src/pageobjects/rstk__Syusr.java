package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Syusr"                                
               , summary=""
               , page="Syusr"
               , namespacePrefix="rstk"
               , object="rstk__syusr__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Syusr {

	@TextType()
	@FindBy(xpath = "//div/div/div/div/div/div//td/div/input")
	public WebElement clockNumber;
	@TextType()
	@FindBy(xpath = "//input[@id='syusr_employee__c_autocomplete']")
	public WebElement Employee;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Default Company']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Default_Company;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Default Division']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Default_Division;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)=concat('User',\"'\",'s Organizational Department')]/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement User_s_Organizational_Department;
	@ChoiceListType()
	@FindBy(xpath = "//span[normalize-space(.)='--None--Account-MGH5 (1)Account-X048 (2)BC Vendor INR (1097)NPTestAuto (1146)SB Vend CAD (1128)SB-24808 (1103)']/select")
	public WebElement User_s_Vendor_Number;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement edit;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Telephone']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement telephone;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/input")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement Employee_Name;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='User’s Vendor Number']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement User_s_Vendor_Number1;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Multi-Company']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement multiCompany;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Email']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement email;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Labor Ohd']/parent::span/parent::th/following-sibling::td//input")
	public WebElement laborOhd;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Fringe Ohd']/parent::span/parent::th/following-sibling::td//input")
	public WebElement fringeOhd;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Labor Grade']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Labor_Grade;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Shift']/parent::span/parent::th/following-sibling::td//input")
	public WebElement shift;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='WO Labor Booking Allowed']/parent::span/parent::th/following-sibling::td//input")
	public WebElement wOLaborBookingAllowed;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='WO Quantity Booking Allowed']/parent::span/parent::th/following-sibling::td//input")
	public WebElement wOQuantityBookingAllowed;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Labor Supervisor']/parent::span/parent::th/following-sibling::td//input")
	public WebElement laborSupervisor;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	
}

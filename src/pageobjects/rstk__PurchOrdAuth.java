package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Purch Ord Auth"                                
               , summary=""
               , page="PurchOrdAuth"
               , namespacePrefix="rstk"
               , object="rstk__pohdr__c"
               , connection="QARSFAdmin"
     )             
public class rstk__PurchOrdAuth {

	public WebDriver driver;

	public rstk__PurchOrdAuth(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Display POs with Due Dates From']/parent::th/following-sibling::td[1]//input[@onchange='fromDate(this.value);']")
	public WebElement displayPOsWithDueDatesFrom;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Select']")
	public WebElement select;
	
	@PageTable(row = PoAuthLines.class)
	@VisualforceBy(componentXPath = "apex:pageblocktable[@id='pbt_poLines']")
	public List<PoAuthLines> poAuthLines;
	
//	@PageTable(row = PoAuthLines.class)
//	@FindBy(xpath = "//table[@class='list'][@id='pg:frm:pb_polines:pbs_polines:pbt_poLines']")
//	public List<PoAuthLines> poAuthLines;
	@PageRow(byColumn = true)
	public static class PoAuthLines {

		@BooleanType()
		@FindBy(xpath = "//table[@class='list']//td[1]/input[1]")
		public WebElement auth;
		
		@FindBy(xpath = "//table[@class='list']//td[3]/span")
		public WebElement OrdNum;

		@LinkType()
		@FindBy(xpath = "//tr/td[2]//a[@class='apdetail']")
		public WebElement authDetail;

		@PageTable(row = Table.class)
		@VisualforceBy(componentXPath = "apex:pageblocktable[@id='pbt_apdtldiv']")
		public List<Table> table;

		@LinkType()
		@FindBy(xpath = "//div[@id='apdtldiv1']/a[normalize-space(.)='close']")
		public WebElement close;

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='qtyComp']")
		public WebElement txnQty;

//		@PageTable(row = Table.class)
//		@VisualforceBy(componentXPath = "apex:pageblocktable[@id='pbt_apdtldiv']")
//		public List<Table> table;

	}
	@ButtonType()
	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement submit;
	@TextType()
	@FindBy(xpath = "//div[@class='messageText']")
	public WebElement Authorizedmessgae;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Transaction Date']/parent::th/following-sibling::td//input")
	public WebElement transactionDate;
	
	
		public void Check(String OrdNum) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(
				By.xpath("//table[@class='list']//td[3]/span[contains(text(),'" + OrdNum + "')]/parent::td/parent::tr//td[1]/input[@type='checkbox']"));
 
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }


	}
	
	public void set(String OrdNum,String Item,String Qty) throws InterruptedException {

		Thread.sleep(2000);

		WebElement qty = driver.findElement(
				By.xpath("//table[@class='list']//td[3]/span[contains(text(),'" + OrdNum + "')]/following::td/span/a[contains(text(),'" + Item + "')]/following::td/input"));
					
			qty.sendKeys(Keys.CONTROL+ "A");
			qty.sendKeys(Qty);
		
		


	}
	

		@BooleanType()
		@FindBy(xpath = "//label[normalize-space(.)='Reversal Option']/parent::th/following-sibling::td[1]//input")
		public WebElement reversalOption;

		@PageRow(byColumn = true)
		public static class Table {

			@BooleanType()
			@FindBy(xpath = "//input[1]")
			public WebElement reversal;
		}

//		@PageTable(row = Table.class)
//		@FindBy(xpath = "//table[contains(@id,'pbt_apdtldiv')]/tbody//tr")
//		public List<Table> table;
		
}

package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__paysession"                                
               , summary=""
               , page="paysession"
               , namespacePrefix="rstkf"
               , object="rstkf__paysession__c"
               , connection="QARSFAdmin"
     )             
public class rstkf__paysession {

	public WebDriver driver;
	
		public rstkf__paysession(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

//	@TextType()
//	@FindBy(xpath = "//label[normalize-space(.)='Payment Date']/parent::th/following-sibling::td//input")
//	public WebElement paymentDate;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Payment Date']/preceding::th[1]/following-sibling::td[2]//input")
	public WebElement paymentDate;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save Session']")
	public WebElement saveSession;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Select for Payment by Invoice']")
	public WebElement selectForPaymentByInvoice;
	@ChoiceListType()
	@FindBy(xpath = "//td/select[contains(@id,'filteredVendors__c')]")
	public WebElement filteredVendors__c;
	
	@PageRow()
	public static class Table {

//		@BooleanType()
//		@FindBy(name = "pg:fm3:j_id369:pbt_invoices:20:selected")
//		public WebElement select;
		
		@BooleanType()
		@FindBy(xpath = ".//td[1]/input[@type='checkbox']")
		public WebElement select;
		
		@FindBy(xpath = ".//td[2]/span")
		public WebElement Invoice;
	}
	
		@PageRow()
		public static class PaymentByInvoiceTable {

		@BooleanType()
		@FindBy(xpath = ".//td[1]/input[@type='checkbox']")
		public WebElement select;
		
		@FindBy(xpath = ".//td[2]/span")
		public WebElement Invoice;
	}
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@FindBy(xpath = "//label[contains(text(),'Select All')]/following::div/table[@id='pg:fm3:j_id369:pbt_invoices']//tr")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@FindBy(xpath = "//div[@class='blockUI blockMsg blockPage']//*[@id='pg:fm3:j_id369']/div[2]//span//*[contains(@id,'pbt_invoices')]//tr")
	@PageTable(firstRowContainsHeaders = false, row = PaymentByInvoiceTable.class)
	public List<PaymentByInvoiceTable> paymentByInvoice;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Process Invoice Selections']")
	public WebElement processInvoiceSelections;
	@ButtonType()
	@FindBy(xpath = "//div[@id='popPaymentByInvoice']/form//td[2]/input[@value='Close']")
	public WebElement close;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Review and Process Payments']")
	public WebElement reviewAndProcessPayments;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Set Starting Check Number']")
	public WebElement setStartingCheckNumber;
	@ButtonType()
	@FindBy(xpath = "//div[@id='setStartingCheckNumber']//td[2]/input[2]")
	public WebElement save;
	@BooleanType()
	@FindBy(xpath = "//div[@id='popPaymentReviewAndProcessingInner']/span/input")
	public WebElement op_popPaymentReviewAndProcessing;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Post Payments']")
	public WebElement postPayments;
//	@TextType()
//	@FindBy(xpath = "//th[contains(text(),'Session Status')]/parent::tr//preceding-sibling::td/span")
//	public WebElement sessionStatus;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Starting Check Number')]/parent::th/parent::tr/td[@class='dataCol '][1]/span")
	public WebElement sessionStatus;
	public void chkbox(String Inv) throws InterruptedException
		{
			
			//String Inv1=Inv;
			//driver.findElement(By.xpath("//input[@value='Select for Payment by Invoice']")).click();
			Thread.sleep(15000);
				
				int count=0;
				
				while(true){
					
					count++;
					List<WebElement> namesInvoices=driver.findElements(By.xpath("//a[contains(text(),'"+Inv+"')]/ancestor::tr[1]//input"));
					if(namesInvoices.size()==0){
						Boolean buttonvisible=driver.findElement(By.xpath("(//a[text()='Next'])[last()]")).isDisplayed();
						if(buttonvisible){
							driver.findElement(By.xpath("(//a[text()='Next'])[last()]")).click();
							Thread.sleep(10000);
						}
						else{
							System.out.println("Text not found");
							break;
							}
					}
					else
					{
						driver.findElement(By.xpath("//a[contains(text(),'"+Inv+"')]/ancestor::tr[1]//input")).click();
						break;
					}
					}
	
	}

	@ButtonType()
	@FindBy(xpath = "//span[contains(@id,'op_btns_paymRevAndProcessing')]/input[@value='Close']")
	public WebElement reviewclose;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Bank Account']/parent::th/following-sibling::td//select")
	public WebElement paysession_glbankacct__c;
	
	public void selectbankacc(String Bankname) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(By.xpath("//select/option[@value='"+Bankname+"']"));
//				By.xpath("//select/option[contains(text(),'" + Item + "')]"));
//List <WebElement> option = driver.findElements(By.xpath("//label[normalize-space(.)='Bank Account']/parent::th/following-sibling::td//select/option[@value='"+Bankname+"']"));

				
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }

	}
	}
	


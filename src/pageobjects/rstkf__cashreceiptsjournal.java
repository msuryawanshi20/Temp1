package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__cashreceiptsjournal"                                
               , summary=""
               , page="cashreceiptsjournal"
               , namespacePrefix="rstkf"
               , object="rstkf__customextf__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__cashreceiptsjournal {

	@ButtonType()
	@FindByLabel(label = "Query")
	public WebElement query;
	
	@LinkType()
	@FindBy(xpath = "//input[contains(@id,'frombatchdate__c')]/following::span//a")
	public WebElement fromSessionDate;
	
	@LinkType()
	@FindBy(xpath = "//input[contains(@id,'throughbatchdate__c')]/following::span//a[1]")
	public WebElement throughSessionDate;
	
	@ButtonType()
	@FindByLabel(label = "Execute")
	public WebElement execute;
	
	@TextType()
	@FindBy(xpath = "//a[@class='savereturl']")
	public WebElement Session;
	
	@BooleanType()
	@FindBy(xpath = "//label[contains(text(),'Query Individual Sessions')]/following::td//input[@type='checkbox'][1]")
	public WebElement QueryIndividualSessions;
	
	
	public WebDriver driver;

	public rstkf__cashreceiptsjournal(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void Check(String SessionNum) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(
				By.xpath("//a[text()='" + SessionNum + "']/preceding::td[1]//input[@type='checkbox']"));
 
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }


	}
	
}


package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__newpovend"                                
               , summary=""
               , page="newpovend"
               , namespacePrefix="rstkf"
               , object="rstk__povend__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__newpovend {
public WebDriver driver;
	
		public rstkf__newpovend(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@TextType()
	@FindBy(xpath = "//tr[5]//input[1]")
	public WebElement select;
	
	public void chkbox(String Inv) throws InterruptedException
		{
			
			//String Inv1=Inv;
			//driver.findElement(By.xpath("//input[@value='Select for Payment by Invoice']")).click();
			Thread.sleep(15000);
				
				int count=0;
				
				while(true){
					
					count++;
					List<WebElement> namesInvoices=driver.findElements(By.xpath("//a[text()='"+Inv+"']/ancestor::tr[1]//input"));
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
						driver.findElement(By.xpath("//a[text()='"+Inv+"']/ancestor::tr[1]//input")).click();
						break;
					}
					}
	
	}
	
}

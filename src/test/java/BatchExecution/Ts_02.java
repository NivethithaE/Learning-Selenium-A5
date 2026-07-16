package BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

public class Ts_02 extends BaseConfig {
@Test
public void CreateContact() {
	WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
	contact.click();
	Reporter.log(" Created Contact !!",true);

}
}

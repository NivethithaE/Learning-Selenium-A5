package BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

public class Ts_01 extends BaseConfig {
@Test
public void CreateOrg() {
	WebElement org = driver.findElement(By.xpath("//a[contains(text(),'Orga')]"));
	org.click();
	Reporter.log("Org created !!",true);
}
}

package BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

public class Ts_03 {
	public class Ts_02 extends BaseConfig {
		@Test
		public void CreateProduct() {
			WebElement Prd = driver.findElement(By.xpath("//a[contains(text(),'Produc')]"));
			Prd.click();
			Reporter.log("Created Product !!",true);
		}
}
}
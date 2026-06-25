package LearningWebElement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//cascade  testing checking alignment and dom values (low priority testing but mandatory)
public class LearningFetchingValues {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	//change name to text_value
	WebElement title = driver.findElement(By.xpath("//div[contains(text(),'Swag')]"));
	//Title
	String text = title.getText();
	System.out.println("Title "+ text);
	//tag name
	String tag_name = title.getTagName();
	System.out.println("Tag = "+tag_name);
	//Attribute
	String attribute = title.getAttribute("class");
	System.out.println("Attribute "+ attribute);
	//Css - property
	String css = title.getCssValue("font-family");
	System.out.println("Css "+ css);
	//size
	Dimension actual_size = title.getSize();
	int height = actual_size.getHeight();
	int width = actual_size.getWidth();
	System.out.println("Dimensions " + actual_size + height + width);
	//location
	Point location = title.getLocation();
	int x = location.getX();
	int y = location.getY();
	System.out.println("Location  " + location + x +y );
	// Expected
	String expct_text = "Swag Labs";
	String expct_tagname = "div";
	String expct_css = "\"DM Mono\", \"sans-serif\"";
	String expct_attribute = "login_logo";
	int expct_height=108;
	int expct_width=1536;
	if(expct_text.equals(text) && expct_css.equals(css) && expct_tagname.equals(tag_name) && expct_height==height) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	
	driver.close();
}
}

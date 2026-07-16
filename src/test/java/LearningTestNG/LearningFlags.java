package LearningTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningFlags {
@Test(priority = 999)
public void E() {
	Reporter.log("E",true);
}

@Test(priority = 3)
public void V() {
	Reporter.log("v",true);
}

@Test(priority =-1)
public void N(){
	Reporter.log("N ",true);
}

@Test(priority = 0)
public void I(){
	Reporter.log("I",true);
}

//Invocation Count
@Test(priority = 1000,invocationCount = 3)
public void T() {
	Reporter.log("*",true);
}

//depends on method
@Test(priority = 1001)
public void H() {
	Assert.fail();
	Reporter.log("@",true);
}

@Test(priority = 1002,dependsOnMethods  = "H")
public void D() {
	Reporter.log("^");
}

@Test(priority = 1004,enabled = true)
public void F() {
	Reporter.log("True",true);
}
}

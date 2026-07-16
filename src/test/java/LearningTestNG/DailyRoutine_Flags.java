package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DailyRoutine_Flags {
@Test(priority = -1,enabled = false)
public void Study() {
	Reporter.log("Study",true);
}

@Test(priority =1,invocationCount = 3)
public void breakfast() {
	Reporter.log("Dosa",true);
}
@Test(priority = 2,invocationCount = 2,dependsOnMethods = "breakfast")
public void chicken() {
	Reporter.log("Dosa+chicken",true);
}

@Test(priority = 3,invocationCount = 0)
public void Selenium() {
	Reporter.log("Selenium",true);
}
}

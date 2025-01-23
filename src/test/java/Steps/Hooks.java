package Steps;

import BaseLayer.BaseClass;
import io.cucumber.java.AfterAll;

public class Hooks extends BaseClass{

	@AfterAll
	public static void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		getDriver().quit();
	}
}

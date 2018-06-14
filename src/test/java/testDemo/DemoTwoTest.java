package testDemo;

import org.testng.annotations.Test;

public class DemoTwoTest {

	@Test(priority=2)
	public void hello(){
		System.out.println("Hello3");
	}
}

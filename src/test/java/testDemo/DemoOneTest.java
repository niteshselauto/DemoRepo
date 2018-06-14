package testDemo;

import org.testng.annotations.Test;

public class DemoOneTest {

	@Test(priority=1)
	public void hello(){
		System.out.println("Hello2");
	}
}

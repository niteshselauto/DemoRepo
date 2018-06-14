package testDemo;

import org.testng.annotations.Test;

public class DemoTest {

	@Test(priority=0)
	public void hello(){
		System.out.println("Hello1");
	}
}

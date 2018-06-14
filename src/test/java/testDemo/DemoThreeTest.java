package testDemo;

import org.testng.annotations.Test;

public class DemoThreeTest {

	@Test(priority=3)
	public void hello(){
		System.out.println("Hello4");
	}
}

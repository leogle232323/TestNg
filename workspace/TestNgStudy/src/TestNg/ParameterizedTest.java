package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	@Test
	@Parameters({ "para1", "para2" })
	public void testPara1(String para1, String para2) {
		System.out.println("This is " + para1 + " and " + para2);
	}

	@Test
	public void testPara2() {
		System.out.println("This is testPara2!");
	}
}

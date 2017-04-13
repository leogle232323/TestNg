package TestNg;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups = { "systemtest" })
	public void testLogin() {
		System.out.println("This is testLogin!");
	}

	@Test(groups = { "functiontest" })
	public void testOpenPage() {
		System.out.println("This is testOpenPage!");
	}

	@Test(groups = { "functiontest" })
	public void testClickPage() {
		System.out.println("This is testClickPage");
	}
}

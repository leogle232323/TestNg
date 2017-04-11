package TestNg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is beforeClass ");
	}

	@Test
	public void test1() {
		System.out.println("This is testNg test1!");
	}

	@Test
	public void test2() {
		System.out.println("This is testNg test2!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this is afterClass");
	}
}

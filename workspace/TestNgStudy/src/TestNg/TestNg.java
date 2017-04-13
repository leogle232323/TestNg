package TestNg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	@Test
	public void test1() {
		System.out.println("This is testNg test1!");
	}

	@Test
	public void test2() {
		System.out.println("This is testNg test2!");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is beforeSuite!");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("this is afterSuite!");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("this is beforeTest!");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this is afterTest!");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("this is beforeClass!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this is afterClass!");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is beforeMethod!");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this is afterMethod!");
	}
}

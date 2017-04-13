package TestNg;

import org.testng.annotations.Test;

public class TestNg1 {
	// 1.priority 表示执行顺序，越小越靠前，与testng.xml配置preserve-order不兼容(高于xml配置)
	// 注意：如果类中某个方法没有设置priority参数，运行该类则只会执行该方法
	@Test(priority = -1)
	public void test11() {
		System.out.println("This is test11 content!");
	}

	@Test(priority = -2)
	public void Aest12() {
		System.out.println("This is test12 content!");
	}

	@Test(priority = 2)
	public void test13() {
		System.out.println("This is test13 content!");
	}

	// 2.TestNg依赖测试，dependsOnMethods 参数，执行方法前需要先执行参数指定的方法，该参数优先级高于priority
	@Test(dependsOnMethods = { "test11" }, priority = 3)
	public void test14() {
		System.out.println("This is test14 content!");
	}

	// 3.TestNg异常测试,通过@Test(expectedExceptions)来判断期待的异常，并且判断Error Message
	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "NullPoint", priority = 5)
	public void testException() {
		throw new IllegalArgumentException("NullPoint");
	}

	// 4.TestNg忽略测试，enabled为false的用例不会执行
	@Test(enabled = false, priority = 4)
	public void test15() {
		System.out.println("This is enable test!");
	}
}

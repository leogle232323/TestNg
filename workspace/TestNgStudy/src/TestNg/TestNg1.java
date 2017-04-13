package TestNg;

import org.testng.annotations.Test;

public class TestNg1 {
	// 1.priority ��ʾִ��˳��ԽСԽ��ǰ����testng.xml����preserve-order������(����xml����)
	// ע�⣺�������ĳ������û������priority���������и�����ֻ��ִ�и÷���
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

	// 2.TestNg�������ԣ�dependsOnMethods ������ִ�з���ǰ��Ҫ��ִ�в���ָ���ķ������ò������ȼ�����priority
	@Test(dependsOnMethods = { "test11" }, priority = 3)
	public void test14() {
		System.out.println("This is test14 content!");
	}

	// 3.TestNg�쳣����,ͨ��@Test(expectedExceptions)���ж��ڴ����쳣�������ж�Error Message
	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "NullPoint", priority = 5)
	public void testException() {
		throw new IllegalArgumentException("NullPoint");
	}

	// 4.TestNg���Բ��ԣ�enabledΪfalse����������ִ��
	@Test(enabled = false, priority = 4)
	public void test15() {
		System.out.println("This is enable test!");
	}
}

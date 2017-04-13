package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider(name = "user")
	public Object[][] Users() {
		return new Object[][] { { "root", "passwordRoot" }, { "guest", "passwordGuest" }, { "test", "passwordTest" } };
	}

	@Test(dataProvider = "user")
	public void testVerifyUser(String userName, String password) {
		System.out.println("UserName:" + userName + " Password:" + password);
	}
}

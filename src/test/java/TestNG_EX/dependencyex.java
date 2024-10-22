package TestNG_EX;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyex {

	@Test(priority=1)
	void browser() {
		Assert.assertTrue(true);
	}

	@Test(priority=2, dependsOnMethods= {"browser"})
	void login() {
		Assert.assertTrue(true);
	}

	@Test(priority=2, dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(false);
	}

	@Test(priority=2, dependsOnMethods= {"login","search"})
	void advsearch() {
		Assert.assertTrue(true);
	}

	@Test(priority=2, dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
	}

}

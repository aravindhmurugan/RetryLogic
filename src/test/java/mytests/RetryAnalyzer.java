package mytests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RetryAnalyzer {
	
	@Test
	public void test1() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, true);
	}

}

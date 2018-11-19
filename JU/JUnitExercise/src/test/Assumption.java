package test;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class Assumption {

	boolean isSonarRunning = false;
	
	@Test
	public void very_critical_test() throws Exception{
		
		isSonarRunning = true;
		Assume.assumeFalse(isSonarRunning);
		Assert.assertTrue(true);
	}
	
	@Test
	@Ignore ("Happy vocation")
	public void This_test_is_intented_ignore_when_we_are_on_vocation() {
		System.out.println("You should not see this message");
	}
}

package test;
import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.containsString;

public class AssertThatStringMatcher {

	@Test
	public void verify_Strings() throws Exception{
		
		String name = "Sun Hai Ying";
		
		assertThat(name,startsWith("Su"));
		assertThat(name,endsWith("ng"));
		assertThat(name,containsString(" Hai"));
	}
}

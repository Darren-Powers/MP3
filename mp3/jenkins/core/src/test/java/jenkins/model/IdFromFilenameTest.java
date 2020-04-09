package jenkins.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class IdFromFilenameTest {
	
	@Test public void hexAsExpected() throws Exception {
		final String result = "Test12345";
		
		IdStrategy strategy = new IdStrategy.CaseSensitive();
		
		String id = strategy.idFromFilename("~test123$0034$0035");
		
		assertTrue(result, id.equals(result));
		
	}
	
	@Test public void badHex() throws Exception {
		IdStrategy strategy = new IdStrategy.CaseSensitive();
		String id = strategy.idFromFilename("$003");
		assertTrue(id, id.equals(""));
	}
}

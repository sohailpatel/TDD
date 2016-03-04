import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UsernameTest {
	userName username;
	@Before
	public void setUp(){
		username=new userName();
	}
	@Test
	public void test() {
		assertFalse(username.validateUsername("abch"));
		assertFalse(username.validateUsername("abc++"));
		assertFalse(username.validateUsername("pqr,pqr??asd!-"));
		assertFalse(username.validateUsername("pqr,xyz-_*%"));
	}
	@Test
	public void testSucess() {
		assertTrue(username.validateUsername("abchg,"));
		assertTrue(username.validateUsername("abc.abc"));
		assertTrue(username.validateUsername("pqr,pqr-"));
		assertTrue(username.validateUsername("pqr,xyz-_"));
	}
}

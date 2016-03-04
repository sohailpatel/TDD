import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PasswordTest {
	password pass;
	@Before
	public void setUp(){
		pass=new password();
	}
	@Test
	public void test() {
		assertFalse(pass.passwordValidation("abbc"));
		assertFalse(pass.passwordValidation(""));
		assertFalse(pass.passwordValidation("@s"));
		assertFalse(pass.passwordValidation("#@$%"));
	}
	@Test
	public void testSucess() {
		assertTrue(pass.passwordValidation("abcabcabc"));
		assertTrue(pass.passwordValidation("abcabc123"));
		assertTrue(pass.passwordValidation("abcabca@s"));
		assertTrue(pass.passwordValidation("abcabca$#%"));
	}
}

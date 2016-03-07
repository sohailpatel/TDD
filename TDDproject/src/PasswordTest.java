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
		assertFalse(pass.passwordValidation("ADCVFGtted"));
		assertFalse(pass.passwordValidation("#@$%"));
	}
	@Test
	public void testSucess() {
		assertTrue(pass.passwordValidation("abAbc1abc$"));
		assertTrue(pass.passwordValidation("ab&cCbc123"));
		assertTrue(pass.passwordValidation("abcaD3b**caa"));
		assertTrue(pass.passwordValidation("@asAAA1Asdk"));
	}
}

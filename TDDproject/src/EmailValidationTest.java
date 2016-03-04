import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmailValidationTest {
emailValidation email;
	@Before
	public void setUp(){
		email=new emailValidation();
	}
	@Test
	public void test() {
		assertFalse(email.validateEmailAddress("sohail.23com"));
		assertFalse(email.validateEmailAddress("abc123@ac.c"));
		assertFalse(email.validateEmailAddress("abc.abc@gmail"));
		assertFalse(email.validateEmailAddress("markus.sprunck@sampledomaineu"));
		assertFalse(email.validateEmailAddress("abc.abc@yahoo.co.india"));
	}
	@Test
	public void testSucess() {
		assertTrue(email.validateEmailAddress("sohail12@gmail.com"));
		assertTrue(email.validateEmailAddress("abc123@ac.com"));
		assertTrue(email.validateEmailAddress("abc.abc@gmail.com"));
		assertTrue(email.validateEmailAddress("abc.abc@yahoo.co.in"));
	}

}

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {
	person personString;
	@Before
	public void setUp(){
		personString=new person();
	}
	@Test
	public void test() {
		assertEquals("Id no. 200 of name qwert having age 90 is male",personString.toString(200,"qwert",90,"male"));
		assertEquals("Id no. 1 of name abc having age 21 is male",personString.toString(1,"abc",21,"male"));
		assertEquals("Id no. 4 of name abcdef having age 40 is female",personString.toString(4,"abcdef",40,"female"));
	}

}

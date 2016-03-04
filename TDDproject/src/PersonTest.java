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
		personString.id=200;personString.name="qwert";personString.age=90;personString.gender="male";
		assertEquals("Id no. 200 of name qwert having age 90 is male",personString.toString());
		personString.id=1;personString.name="abc";personString.age=21;personString.gender="male";
		assertEquals("Id no. 1 of name abc having age 21 is male",personString.toString());
		personString.id=4;personString.name="abcdef";personString.age=40;personString.gender="female";
		assertEquals("Id no. 4 of name abcdef having age 40 is female",personString.toString());
	}

}

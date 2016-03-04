import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ConcatArrayTest {
	concatArray concatarray;
	@Before
	public void setUp(){
		concatarray=new concatArray();
	}
	@Test
	public void test() {
		assertEquals("abc", concatarray.concatingArray(new String[]{"a","b","c"}));
		assertEquals("abcdef", concatarray.concatingArray(new String[]{"abc","def"}));
		assertEquals("abcd123efg", concatarray.concatingArray(new String[]{"a","b","cd1","23e","f","g"}));
	}

}

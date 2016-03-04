import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class IFSCCodeTest {
	IFSCcode code;
	
	@Before
	public void setUp(){
		code=new IFSCcode();
	}

	@Test
	public void test() {
		assertFalse(code.validatingIFSC("acde12354564"));
		assertFalse(code.validatingIFSC("a84561234564"));
		assertFalse(code.validatingIFSC("boi1234564"));
		assertFalse(code.validatingIFSC("SI1234564"));
	}
	@Test
	public void testSucess() {
		assertTrue(code.validatingIFSC("acde1234564"));
		assertTrue(code.validatingIFSC("a4561234564"));
		assertTrue(code.validatingIFSC("boi21234564"));
		assertTrue(code.validatingIFSC("SBOI1234564"));
	}

}

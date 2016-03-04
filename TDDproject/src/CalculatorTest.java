import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	Calculator calculator;
	@Before
	public void setUp(){
		calculator=new Calculator();
	}
	
	@Test
	public void test() {
		assertEquals(10, calculator.add(5,5));
		assertEquals(9, calculator.add(5,4));
		assertEquals(5, calculator.subtract(10,5));
		assertEquals(10, calculator.subtract(15,5));
		assertEquals(100, calculator.multiply(10,10));
		assertEquals(25, calculator.multiply(5,5));
		assertEquals(1, calculator.divide(5,5));
		assertEquals(3, calculator.divide(15,5));
	}

}

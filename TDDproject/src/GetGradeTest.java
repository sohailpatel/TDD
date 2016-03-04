import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GetGradeTest {
	
	getGrade getgrade;
	@Before
	public void setUp(){
		getgrade=new getGrade();
	}
	
	@Test
	public void test() {
		assertEquals('A', getgrade.calculateGrade(80));
		assertEquals('B', getgrade.calculateGrade(70));
		assertEquals('C', getgrade.calculateGrade(55));
		assertEquals('D', getgrade.calculateGrade(42));
		assertEquals('F', getgrade.calculateGrade(30));
		assertEquals('A', getgrade.calculateGrade(71));
		assertEquals('B', getgrade.calculateGrade(69));
	}

}

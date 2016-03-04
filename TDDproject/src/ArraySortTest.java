import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ArraySortTest {
	arraySort arraysort;
	@Before
	public void setUp(){
		arraysort=new arraySort();
	}

	@Test
	public void test() {
		assertArrayEquals(new int[]{1,2,3},arraysort.sort(new int[]{3,2,1}));
		assertArrayEquals(new int[]{1,2,3,4},arraysort.sort(new int[]{3,2,4,1}));
		assertArrayEquals(new int[]{9,30,100},arraysort.sort(new int[]{30,100,9}));
		assertArrayEquals(new int[]{3,8,20,78,90,100,123},arraysort.sort(new int[]{123,78,90,8,3,20,100}));
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testMultiple() {
		int a = 20;
		int b = 25;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a,b);
		
		int expected = 500;
		assertEquals(expected,actual);
	}
	@Test
	public void testDivide() {
		int a = 9999;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 3333;
		
		assertEquals(expected,actual);
		
	}
	
	

}

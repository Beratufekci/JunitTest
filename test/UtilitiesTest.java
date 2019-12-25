import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtilitiesTest {
	
	private Utilities util;
	
	@Before
	public void setUp() {
		util = new Utilities();
	}


	@Test
	public void testEveryNthChar() throws Exception{

		char[] output = util.everyNthChar(new char[] {'h','e','l','l','o'}, 2);
		assertArrayEquals(new char[] {'e','l'},output);
		
		/*these returns address so they wont be equal
		assertEquals(new char[] {'e','l'},output);
		*/
		
		char[] output2 = util.everyNthChar(new char[] {'h','e','l','l','o'}, 8);
		assertArrayEquals(new char[] {'h','e','l','l','o'},output2);

	}

	@Test
	public void testRemovePairs() throws Exception {

		assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
		assertEquals("ABCABDEF",util.removePairs("ABCCABDEEF"));
		assertNull("Did not get null returned when argument passed was null...",util.removePairs(null)); 
		assertEquals("A",util.removePairs("A"));
		assertEquals("",util.removePairs("")); 
	}

	@Test
	public void testConverter() throws Exception {
		
		int output = util.converter(10, 5);
		assertEquals(300,output);
		
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void converter_arithmeticException() throws Exception{
		
		util.converter(10, 0);
		
	}

	@Test
	public void testNullIfOddLength() throws Exception{
		
		assertNull(util.nullIfOddLength("odd"));
		assertNotNull(util.nullIfOddLength("even"));
		
	}

}

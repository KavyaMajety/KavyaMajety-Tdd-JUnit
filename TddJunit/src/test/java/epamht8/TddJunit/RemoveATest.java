package epamht8.TddJunit;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {
	
	/* TODO list for my feature
	 * 1. ABCD => BCD
	 * 2. AACD => CD
	 * 3. BACD => BCD
	 * 4. BBAA => BBAA
	 * 5. AABAA => BAA
	 * 6. AA => ""
	 * 7. "" => "" 
	 */
	
	RemoveA removeCharA;
	
	@BeforeEach
	public void setUp() {
		removeCharA = new RemoveA();
	}
	
	@Test
	public void testRemove1A() {
		assertEquals("BCD", removeCharA.removeA("ABCD"));
	}
	
	@Test
	public void testRemove2A() {
		assertEquals("CD", removeCharA.removeA("AACD"));
	}
	
	@Test
	public void testRemove3A() {
		assertEquals("BCD", removeCharA.removeA("BACD"));
	}

	@Test
	public void testRemove4A() {
		assertEquals("BBAA", removeCharA.removeA("BBAA"));
	}
	
	@Test
	public void testRemove5A() {
		assertEquals("BAA", removeCharA.removeA("AABAA"));
	}
	
	@Test
	public void testRemove6A() {
		assertEquals("", removeCharA.removeA("AA"));
	}
	
	@Test
	public void testRemove7A() {
		assertEquals("", removeCharA.removeA(""));
	}
}
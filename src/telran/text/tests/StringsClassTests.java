package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsClassTests {

	private static final int N_RUNS = 10000;
	private static final int N_STRINGS = 10000;

	@Test
	void deepCompareTest() {
		String str1 = "123,tT89";
		String str2 = "123,tT89";
		String str3 = "19";
		String str5 = "98Tt,321";
		String str4 = "kugy";
		int expected1[] = { 8, 0 };
		int expected2[] = { 1, 1 };
		int expected3[] = { 0, 8 };
		int expected4[] = { 0, 0 };
		//for (int i = 0; i < N_RUNS; i++) {
			assertArrayEquals(expected1, Strings.deepNoRepeatedCompare(str1, str2));
			assertArrayEquals(expected2, Strings.deepNoRepeatedCompare(str1, str3));
			assertArrayEquals(expected3, Strings.deepNoRepeatedCompare(str1, str5));
			assertArrayEquals(expected4, Strings.deepNoRepeatedCompare(str1, str4));
		//}
	}

	@Test
	void isAnagramTests() {
		String str1 = "Hello";
		String str2 = "Helll";
		String str3 = "eloHl";
		String str4 = "Helo";
		String str5 = "lllll";
		assertTrue(Strings.isAnagram(str1, str3));
		assertFalse(Strings.isAnagram(str1, str2));
		assertFalse(Strings.isAnagram(str1, str4));
		assertTrue(Strings.isAnagram(str1, str1));
		assertFalse(Strings.isAnagram(str1, str5));
	}
	
	@Test
	void joinTest() {
		String array[] = {"Hello", "Vasya"};
		String expected = "Hello Vasya";
		assertEquals(expected, Strings.join(array, " "));
	}
	@Test
	void joinPerformanceTest() {
		String array[] = getBigArray();
		for(int i = 0; i < N_RUNS; i++) {
			Strings.join(array, " ");
		}
	}

	private String[] getBigArray() {
		String res[] = new String[N_STRINGS];
		for (int i = 0; i < res.length; i++) {
			res[i] = "Hello";
		}
		return res;
	}
	@Test
	void matchesTest() {
		//TODO
		//        Examples:
//	        - David vs. david: match
//	        - John F vs. John Fitzgerald: match
//	        - John K vs. John Fitzgerald: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena: match
//	        - Anna Maria Magdalena vs. Maria Magdalena: match
//	        - Anna Maria Magdalena vs. Anna Maria Roberta: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena Roberta: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena Maria: no match
	}
	@Test
	void sortStringsAsNumbersTest() {
		//TODO
	}

}
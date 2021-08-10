package test;

import static org.junit.Assert.*;
import org.junit.Test;

import static Dev.findMissingLetter.*;
public class findMissingLettertest {
	
	@Test
	public void test() {
		assertEquals('e', findMissingLetter(new char[] { 'a','b','c','d','f' }));
		assertEquals('m', findMissingLetter(new char[] { 'k','l','n','o' }));
		assertEquals('w', findMissingLetter(new char[] { 'u','v','x' }));
        assertEquals('P', findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('Y', findMissingLetter(new char[] { 'X','Z' }));
	}


}

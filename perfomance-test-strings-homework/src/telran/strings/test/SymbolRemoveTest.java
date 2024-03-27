package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.SymbolsRemove;
import telran.strings.SymbolsRemoveCharArray;
import telran.strings.SymbolsRemoveStandard;

class SymbolRemoveTest {

	@Test
	void removeSymbolStandardTest() {
		removeSymbolTest(new SymbolsRemoveStandard());
	}
	@Test
	void removeSymbolCharArrayTest() {
		removeSymbolTest(new SymbolsRemoveCharArray());
	}

	private void removeSymbolTest(SymbolsRemove symbolsRemove) {
		String str = "Hello 123sCDd!!? ? ";
		String expectedNoSpace = "Hello123sCDd!!??";
		String expectedNoT = str;
		String expectedNo1 = "Hello 23sCDd!!? ? ";
		String expectedNoQuestionSymbol = "Hello 123sCDd!!  ";
		String expectedNoH = "ello 123sCDd!!? ? ";
		String expectedNoExclam = "Hello 123sCDd? ? ";

		assertEquals(expectedNoSpace, symbolsRemove.removeSymbol(str, ' '));
		assertEquals(expectedNoT, symbolsRemove.removeSymbol(str, '$'));
		assertEquals(expectedNo1, symbolsRemove.removeSymbol(str, '1'));
		assertEquals(expectedNoQuestionSymbol, symbolsRemove.removeSymbol(str, '?'));
		assertEquals(expectedNoH, symbolsRemove.removeSymbol(str, 'H'));
		assertEquals(expectedNoExclam, symbolsRemove.removeSymbol(str, '!'));

		assertEquals("", symbolsRemove.removeSymbol("[[[[[[[[[[[[[[[[",'['));
		
		
	}

}

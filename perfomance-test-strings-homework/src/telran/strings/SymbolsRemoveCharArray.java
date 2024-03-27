package telran.strings;

import java.util.Arrays;

import telran.perfomance.remove.SymbolsRemovePerformanceTest;

public class SymbolsRemoveCharArray implements SymbolsRemove{



	@Override
	public String removeSymbol(String str, char symbol) {
		int counter = 0;
		char[] charArray = str.toCharArray();
		char[] charArrayRes = new char[charArray.length];
		for (char ch : charArray) {
			if (ch != symbol) {
				charArrayRes[counter++] += ch;
			}
		}
		return new String(charArrayRes, 0, counter);
	}
	
	
	

	

}

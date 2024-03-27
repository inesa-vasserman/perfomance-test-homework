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
				addSymbol(charArrayRes, ch, counter);
				counter ++;
			}
		}
		return new String(Arrays.copyOf(charArrayRes, counter));
	}
	
	private void addSymbol(char[] charArrayRes, char ch, int counter) {
		
		charArrayRes[counter] += ch;
		
	}
	
	

	

}

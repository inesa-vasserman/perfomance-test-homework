package telran.perfomance.strings;

import java.util.Random;

import telran.perfomance.PerfomanceTest;
import telran.perfomance.remove.SymbolsRemovePerformanceTest;
import telran.strings.StringsJoin;
import telran.strings.StringsJoinBuilder;
import telran.strings.SymbolsRemove;
import telran.strings.SymbolsRemoveCharArray;
import telran.strings.SymbolsRemoveStandard;

public class SymbolsRemovePerformanceAppl {

	private static final int N_SYMBOLS = 10000;
	private static final int N_RUNS = 10000;
    static Random random = new Random();


	
	public static void main(String[] args) {

		String stringOfChar = getString(N_SYMBOLS);

	SymbolsRemovePerformanceTest removeStandart = getTest(stringOfChar, N_RUNS, "test of strings with standart remove", new SymbolsRemoveStandard());


	SymbolsRemovePerformanceTest removeCharArray = getTest(stringOfChar, N_RUNS, "test of strings with char array remove", new SymbolsRemoveCharArray());
	
	removeStandart.run();
	System.out.println();
	removeCharArray.run();
	
	}

private static SymbolsRemovePerformanceTest getTest(String string, int nRuns, String displayName,
		SymbolsRemove symbolsRemove) {
	
	return new SymbolsRemovePerformanceTest(displayName, nRuns, symbolsRemove, string);
}

private static String getString(int nSymbols) {
	StringBuilder sb = new StringBuilder(N_SYMBOLS);
	   for (int i = 0; i < nSymbols; i++) {
		   char randomChar = (char) (random.nextInt(Character.MAX_VALUE + 1));
           sb.append(randomChar);
       }
       return sb.toString();
}



}

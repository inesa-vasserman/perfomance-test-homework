package telran.perfomance.remove;

import telran.perfomance.PerfomanceTest;
import telran.strings.SymbolsRemove;

public class SymbolsRemovePerformanceTest extends PerfomanceTest {
	
	SymbolsRemove symbolRemove;
	String str;
	char symbol;

	public SymbolsRemovePerformanceTest(String displayNname, int nRuns, SymbolsRemove symbolRemove, String str) {
		super(displayNname, nRuns);
		this.symbolRemove = symbolRemove;
		this.str = str;
		
	}

	@Override
	protected void runTest() {
		symbolRemove.removeSymbol(str, symbol);
	}

}

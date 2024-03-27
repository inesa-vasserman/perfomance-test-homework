package telran.perfomance;

public abstract class PerfomanceTest {
	
	int nRuns;
	String displayName;
	
    protected PerfomanceTest(String displayNname, int nRuns) {
    	this.nRuns = nRuns;
    	this.displayName = displayNname;
    }
    
    protected abstract void runTest();
    
    public void run() {
    	long timestampStart = System.currentTimeMillis();
    	for (int i = 0; i < nRuns; i++) {
    		runTest();
    	}
    	
    	long timestampFinish = System.currentTimeMillis();
    	long runningTime = timestampFinish - timestampStart;
    	System.out.printf("%s; number of runs: %d; running time: %d", 
    			displayName, nRuns, runningTime);
    }
}

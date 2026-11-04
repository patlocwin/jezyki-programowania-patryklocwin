package lab01.zadanie5;

public class BenchmarkResult {
    private final String operationName;
    private final long arrayListTimeNs;
    private final long linkedListTimeNs;
    public BenchmarkResult(String operationName, long arrayListTimeNs, long linkedListTimeNs) {
        this.operationName = operationName;
        this.arrayListTimeNs = arrayListTimeNs;
        this.linkedListTimeNs = linkedListTimeNs;
    }
    public String getOperationName() {
        return operationName;
    }
    public double getArrayListTimeMs() {
        return arrayListTimeNs / 1_000_000.0;
    }
    public double getLinkedListTimeMs() {
        return linkedListTimeNs / 1_000_000.0;
    }
    public String getFasterListType() {
        return arrayListTimeNs < linkedListTimeNs ? "ArrayList" : "LinkedList";
    }
    public double getSpeedupRatio() {
        if (arrayListTimeNs == 0 || linkedListTimeNs == 0) {
            return 1.0;
        }
        return arrayListTimeNs < linkedListTimeNs
                ? (double) linkedListTimeNs / arrayListTimeNs
                : (double) arrayListTimeNs / linkedListTimeNs;
    }
}
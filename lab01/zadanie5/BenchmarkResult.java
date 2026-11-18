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
        return arrayListTimeNs / 1000000.0;
    }

    public double getLinkedListTimeMs() {
        return linkedListTimeNs / 1000000.0;
    }

    public String getFasterListName() {
        return arrayListTimeNs < linkedListTimeNs ? "ArrayList" : "LinkedList";
    }

    public double getSpeedRatio() {
        long faster = Math.min(arrayListTimeNs, linkedListTimeNs);
        long slower = Math.max(arrayListTimeNs, linkedListTimeNs);
        if (faster == 0) {
            return 1.0;
        }
        return (double) slower / faster;
    }
}

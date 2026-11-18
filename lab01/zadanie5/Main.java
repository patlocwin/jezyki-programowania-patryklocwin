package lab01.zadanie5;

public class Main {
    public static void main(String[] args) {
        final int baseElementsCount = 100000;
        final int searchCount = 1000;
        final int insertDeleteCount = 20000;

        ListBenchmark benchmark = new ListBenchmark(baseElementsCount);
        BenchmarkReporter reporter = new BenchmarkReporter();

        reporter.printHeader(baseElementsCount);
        reporter.printResult(benchmark.testAddingToEnd());
        reporter.printResult(benchmark.testAddingToBeginning(insertDeleteCount));
        reporter.printResult(benchmark.testSearching(searchCount));
        reporter.printResult(benchmark.testRemovingFromBeginning(insertDeleteCount));
    }
}

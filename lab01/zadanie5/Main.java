package lab01.zadanie5;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        final int BASE_ELEMENTS_COUNT = 100_000;
        final int SEARCH_COUNT = 1_000;
        final int INSERT_DELETE_COUNT = 20_000;
        DataGenerator dataGenerator = new DataGenerator();
        TimeMeasurer timeMeasurer = new TimeMeasurer();
        ListBenchmark benchmark = new ListBenchmark(BASE_ELEMENTS_COUNT, dataGenerator, timeMeasurer);
        BenchmarkReporter reporter = new BenchmarkReporter();
        reporter.printHeader(BASE_ELEMENTS_COUNT);
        List<BenchmarkResult> results = new ArrayList<>();
        BenchmarkResult addEndResult = benchmark.testAddingToEnd();
        reporter.printResult(addEndResult);
        results.add(addEndResult);
        BenchmarkResult addBegResult = benchmark.testAddingToBeginning(INSERT_DELETE_COUNT);
        reporter.printResult(addBegResult);
        results.add(addBegResult);
        BenchmarkResult searchResult = benchmark.testSearching(SEARCH_COUNT);
        reporter.printResult(searchResult);
        results.add(searchResult);
        BenchmarkResult removeBegResult = benchmark.testRemovingFromBeginning(INSERT_DELETE_COUNT);
        reporter.printResult(removeBegResult);
        results.add(removeBegResult);
    }
}
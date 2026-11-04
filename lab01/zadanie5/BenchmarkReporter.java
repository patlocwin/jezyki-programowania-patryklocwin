package lab01.zadanie5;

import java.util.List;
public class BenchmarkReporter {
    public void printHeader(int elementsCount) {
        System.out.println("Porównanie wydajności: ArrayList <-> LinkedList");
        System.out.println("Liczba elementów bazowych: " + elementsCount);
        System.out.println();
    }
    public void printResult(BenchmarkResult result) {
        System.out.printf("Test: %s\n", result.getOperationName());
        System.out.printf("  - ArrayList:  %10.2f ms\n", result.getArrayListTimeMs());
        System.out.printf("  - LinkedList: %10.2f ms\n", result.getLinkedListTimeMs());
        System.out.printf("%s (%.1fx szybciej)\n\n",
                result.getFasterListType(), result.getSpeedupRatio());
    }
}

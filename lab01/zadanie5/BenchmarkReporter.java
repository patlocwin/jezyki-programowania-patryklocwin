package lab01.zadanie5;

public class BenchmarkReporter {
    public void printHeader(int baseElementsCount) {
        System.out.println("Porównanie wydajności - między ArrayList a LinkedList");
        System.out.println("Liczba elementów początkowych: " + baseElementsCount);
        System.out.println();
    }

    public void printResult(BenchmarkResult result) {
        System.out.printf("Test: %s%n", result.getOperationName());
        System.out.printf("  - ArrayList:  %.2f ms%n", result.getArrayListTimeMs());
        System.out.printf("  - LinkedList: %.2f ms%n", result.getLinkedListTimeMs());
        System.out.printf("Wynik: %s (%.1fx szybciej)%n%n", result.getFasterListName(), result.getSpeedRatio());
    }
}

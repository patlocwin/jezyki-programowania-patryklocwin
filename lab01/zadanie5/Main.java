package lab01.zadanie5;

public class Main {
    public static void main(String[] args) {
        final int BASE_ELEMENTS_COUNT = 100_000;
        final int SEARCH_COUNT = 1_000;
        final int INSERT_DELETE_COUNT = 20_000;

        System.out.println("Porównanie wydajności: ArrayList <-> LinkedList");
        System.out.println("Liczba elementów bazowych: " + BASE_ELEMENTS_COUNT);
        System.out.println();

        ListBenchmark benchmark = new ListBenchmark(BASE_ELEMENTS_COUNT);

        benchmark.testAddingToEnd();
        benchmark.testAddingToBeginning(INSERT_DELETE_COUNT);
        benchmark.testSearching(SEARCH_COUNT);
        benchmark.testRemovingFromBeginning(INSERT_DELETE_COUNT);
    }
}

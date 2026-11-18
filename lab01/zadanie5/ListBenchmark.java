package lab01.zadanie5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListBenchmark {
    private final int baseElementsCount;
    private final Random random = new Random();

    public ListBenchmark(int baseElementsCount) {
        this.baseElementsCount = baseElementsCount;
    }

    public BenchmarkResult testAddingToEnd() {
        List<Integer> data = generateRandomNumbers(baseElementsCount);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startArrayList = System.nanoTime();
        for (Integer number : data) {
            arrayList.add(number);
        }
        long timeArrayList = System.nanoTime() - startArrayList;

        long startLinkedList = System.nanoTime();
        for (Integer number : data) {
            linkedList.add(number);
        }
        long timeLinkedList = System.nanoTime() - startLinkedList;

        return new BenchmarkResult("Dodawanie na koniec listy", timeArrayList, timeLinkedList);
    }

    public BenchmarkResult testAddingToBeginning(int operationsCount) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startArrayList = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            arrayList.add(0, i);
        }
        long timeArrayList = System.nanoTime() - startArrayList;

        long startLinkedList = System.nanoTime();
        for (int i = 0; i < operationsCount; i++) {
            linkedList.add(0, i);
        }
        long timeLinkedList = System.nanoTime() - startLinkedList;

        return new BenchmarkResult("Dodawanie na początek", timeArrayList, timeLinkedList);
    }

    public BenchmarkResult testSearching(int searchCount) {
        List<Integer> data = generateRandomNumbers(baseElementsCount);
        List<Integer> arrayList = new ArrayList<>(data);
        List<Integer> linkedList = new LinkedList<>(data);
        List<Integer> targets = generateRandomNumbers(searchCount);

        long startArrayList = System.nanoTime();
        for (Integer target : targets) {
            arrayList.contains(target);
        }
        long timeArrayList = System.nanoTime() - startArrayList;

        long startLinkedList = System.nanoTime();
        for (Integer target : targets) {
            linkedList.contains(target);
        }
        long timeLinkedList = System.nanoTime() - startLinkedList;

        return new BenchmarkResult("Przeszukiwanie", timeArrayList, timeLinkedList);
    }

    public BenchmarkResult testRemovingFromBeginning(int removeCount) {
        List<Integer> data = generateRandomNumbers(baseElementsCount);
        List<Integer> arrayList = new ArrayList<>(data);
        List<Integer> linkedList = new LinkedList<>(data);

        long startArrayList = System.nanoTime();
        for (int i = 0; i < removeCount; i++) {
            arrayList.remove(0);
        }
        long timeArrayList = System.nanoTime() - startArrayList;

        long startLinkedList = System.nanoTime();
        for (int i = 0; i < removeCount; i++) {
            linkedList.remove(0);
        }
        long timeLinkedList = System.nanoTime() - startLinkedList;

        return new BenchmarkResult("Usuwanie z początku", timeArrayList, timeLinkedList);
    }

    private List<Integer> generateRandomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }
}

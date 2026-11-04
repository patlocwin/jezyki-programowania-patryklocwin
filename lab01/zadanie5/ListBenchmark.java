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

    public void testAddingToEnd() {
        List<Integer> data = generateRandomNumbers(baseElementsCount);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startArrayList = System.nanoTime();
        for (Integer num : data) {
            arrayList.add(num);
        }
        long timeArrayList = System.nanoTime() - startArrayList;

        long startLinkedList = System.nanoTime();
        for (Integer num : data) {
            linkedList.add(num);
        }
        long timeLinkedList = System.nanoTime() - startLinkedList;

        printResult("Dodawanie na koniec listy", timeArrayList, timeLinkedList);
    }

    public void testAddingToBeginning(int operationsCount) {
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

        printResult("Dodawanie na początek", timeArrayList, timeLinkedList);
    }

    public void testSearching(int searchCount) {
        List<Integer> data = generateRandomNumbers(baseElementsCount);
        List<Integer> arrayList = new ArrayList<>(data);
        List<Integer> linkedList = new LinkedList<>(data);

        List<Integer> targets = new ArrayList<>(searchCount);
        for (int i = 0; i < searchCount; i++) {
            targets.add(random.nextInt(baseElementsCount));
        }

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

        printResult("Przeszukiwanie", timeArrayList, timeLinkedList);
    }

    public void testRemovingFromBeginning(int removeCount) {
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

        printResult("Usuwanie z początku", timeArrayList, timeLinkedList);
    }

    private List<Integer> generateRandomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }

    private void printResult(String operationName, long arrayListNs, long linkedListNs) {
        double arrayListMs = arrayListNs / 1_000_000.0;
        double linkedListMs = linkedListNs / 1_000_000.0;
        String faster = arrayListNs < linkedListNs ? "ArrayList" : "LinkedList";
        double ratio = (arrayListNs == 0 || linkedListNs == 0) ? 1.0 :
                (arrayListNs < linkedListNs ? (double) linkedListNs / arrayListNs : (double) arrayListNs / linkedListNs);

        System.out.printf("Test: %s%n", operationName);
        System.out.printf("  - ArrayList:  %10.2f ms%n", arrayListMs);
        System.out.printf("  - LinkedList: %10.2f ms%n", linkedListMs);
        System.out.printf("%s (%.1fx szybciej)%n%n", faster, ratio);
    }
}

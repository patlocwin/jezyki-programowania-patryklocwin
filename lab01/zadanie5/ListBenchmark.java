package lab01.zadanie5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListBenchmark {
    private final int elementsCount;
    private final DataGenerator dataGenerator;
    private final TimeMeasurer timeMeasurer;
    public ListBenchmark(int elementsCount, DataGenerator dataGenerator, TimeMeasurer timeMeasurer) {
        this.elementsCount = elementsCount;
        this.dataGenerator = dataGenerator;
        this.timeMeasurer = timeMeasurer;
    }
    public BenchmarkResult testAddingToEnd() {
        List<Integer> data = dataGenerator.generateRandomNumbers(elementsCount);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long timeArrayList = timeMeasurer.measureInNanoseconds(() -> {
            for (Integer num : data) {
                arrayList.add(num);
            }
        });
        long timeLinkedList = timeMeasurer.measureInNanoseconds(() -> {
            for (Integer num : data) {
                linkedList.add(num);
            }
        });
        return new BenchmarkResult("Dodawanie na koniec listy", timeArrayList, timeLinkedList);
    }
    public BenchmarkResult testAddingToBeginning(int operationsCount) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long timeArrayList = timeMeasurer.measureInNanoseconds(() -> {
            for (int i = 0; i < operationsCount; i++) {
                arrayList.add(0, i);
            }
        });
        long timeLinkedList = timeMeasurer.measureInNanoseconds(() -> {
            for (int i = 0; i < operationsCount; i++) {
                linkedList.add(0, i);
            }
        });
        return new BenchmarkResult("Dodawanie na początek", timeArrayList, timeLinkedList);
    }
    public BenchmarkResult testSearching(int searchCount) {
        List<Integer> data = dataGenerator.generateRandomNumbers(elementsCount);
        List<Integer> arrayList = new ArrayList<>(data);
        List<Integer> linkedList = new LinkedList<>(data);
        long timeArrayList = timeMeasurer.measureInNanoseconds(() -> {
            for (int i = 0; i < searchCount; i++) {
                arrayList.contains(dataGenerator.getRandomNumber(elementsCount));
            }
        });
        long timeLinkedList = timeMeasurer.measureInNanoseconds(() -> {
            for (int i = 0; i < searchCount; i++) {
                linkedList.contains(dataGenerator.getRandomNumber(elementsCount));
            }
        });
        return new BenchmarkResult("Przeszukiwanie", timeArrayList, timeLinkedList);
    }
    public BenchmarkResult testRemovingFromBeginning(int removeCount) {
        List<Integer> data = dataGenerator.generateRandomNumbers(elementsCount);
        List<Integer> arrayList = new ArrayList<>(data);
        List<Integer> linkedList = new LinkedList<>(data);
        long timeArrayList = timeMeasurer.measureInNanoseconds(() -> {
            for (int i = 0; i < removeCount; i++) {
                arrayList.remove(0);
            }
        });
        long timeLinkedList = timeMeasurer.measureInNanoseconds(() -> {
            for (int i = 0; i < removeCount; i++) {
                linkedList.remove(0);
            }
        });
        return new BenchmarkResult("Usuwanie z początku", timeArrayList, timeLinkedList);
    }
}
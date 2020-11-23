package designPrinciples.dependencyInversionPrinciple;

import java.util.ArrayList;

public class dependencyInversionPrinciple {

}

interface ISortAlgorithms {
    public void sort();
}

class QuickSort implements ISortAlgorithms {

    private final ArrayList<Integer> arrayToSort;

    public QuickSort(ArrayList<Integer> array) {
        this.arrayToSort = array;
    }

    public void quickSort() {
        // quick sort implementation
    }

    @Override
    public void sort() {
        quickSort();
    }
}

class BubbleSort implements ISortAlgorithms {

    private final ArrayList<Integer> arrayToSort;

    public BubbleSort(ArrayList<Integer> array) {
        this.arrayToSort = array;
    }

    public void bubbleSort() {
        // bubble sort implementation
    }
    @Override
    public void sort() {
       bubbleSort();
    }
}
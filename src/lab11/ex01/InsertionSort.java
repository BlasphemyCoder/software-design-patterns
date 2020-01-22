package ex01;

import java.util.Comparator;

public class InsertionSort implements AlgorithmStrategy {
    private Phone[] array;
    private Comparator<Phone> c;

    public InsertionSort(Phone[] array, Comparator<Phone> c)
    {
        this.array = array;
        this.c = c;
    }

    @Override
    public void sort() {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            Phone key = array[i];
            int j = i - 1;

            /*
             * Move elements of arr[0..i-1], that are greater than key, to one position
             * ahead of their current position
             */
            while (j >= 0 && c.compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
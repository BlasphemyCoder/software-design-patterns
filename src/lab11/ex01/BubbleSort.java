package ex01;

import java.util.Comparator;

public class BubbleSort implements AlgorithmStrategy {
    private Phone[] array;
    private Comparator<Phone> c;

    public BubbleSort(Phone[] array, Comparator<Phone> c)
    {
        this.array = array;
        this.c = c;
    }

    @Override
    public void sort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (c.compare(array[j], array[j + 1]) > 0) {
                    // swap array[j+1] and array[i]
                    Phone temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
package ex01;

import java.util.Comparator;

public class SelectionSort implements AlgorithmStrategy {
    private Phone[] array;
    private Comparator<Phone> c;

    public SelectionSort(Phone[] array, Comparator<Phone> c)
    {
        this.array = array;
        this.c = c;
    }

    @Override
    public void sort() {

        int n = array.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (c.compare(array[j], array[min_idx]) < 0)
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            Phone temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        } 
    }
}
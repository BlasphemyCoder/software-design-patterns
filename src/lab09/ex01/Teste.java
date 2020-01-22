package ex01;

import java.util.Iterator;
import java.util.ListIterator;

public class Teste {
    public static void main(String[] args) {
        VectorGeneric<Integer> vp = new VectorGeneric<>();
        for (int i = 0; i < 10; i++)
            vp.addElem(i);

        // ITERATOR
        System.out.println("Iterator");
        Iterator<Integer> vecIterator = vp.iterator();
        while (vecIterator.hasNext())
            System.out.println(vecIterator.next());


        // LIST ITERATOR DEFULT
        System.out.println("\n\nList Iterator");
        ListIterator<Integer> vecListIterator = vp.listIterator();
        System.out.println("\nNEXT");
        while (vecListIterator.hasNext())
            System.out.printf("Index %d: %d\n",vecListIterator.nextIndex(),vecListIterator.next());
        
        System.out.println("\nPREVIOUS");
        while (vecListIterator.hasPrevious())
            System.out.printf("Index %d: %d\n",vecListIterator.previousIndex(),vecListIterator.previous());

    
        // LIST ITERATOR WITH INDEX
        System.out.println("\n\nList Iterator with Index");
        ListIterator<Integer> vecListIteratorWithIndex = vp.listIterator(5);
        System.out.println("\nNEXT");
        while (vecListIteratorWithIndex.hasNext())
            System.out.printf("Index %d: %d\n",vecListIteratorWithIndex.nextIndex(),vecListIteratorWithIndex.next());
        
        System.out.println("\nPREVIOUS");
        while (vecListIteratorWithIndex.hasPrevious())
            System.out.printf("Index %d: %d\n",vecListIteratorWithIndex.previousIndex(),vecListIteratorWithIndex.previous());
    }
}
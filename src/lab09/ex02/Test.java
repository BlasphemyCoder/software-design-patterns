package ex02;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<String> ourList = new ArrayList<>();
        AddCommand addCommand = new AddCommand(ourList);
        RemoveCommand removeCommand = new RemoveCommand(ourList);

        addCommand.execute("Oi");
        addCommand.execute("Amigo");

        System.out.println("Size after 2 addCommands : "+ourList.size());
        if(ourList.size()>1){
            System.out.println("Element at index 0: " + ourList.get(0));
            System.out.println("Element at index 1: " + ourList.get(1));
        }

        addCommand.undo();
        System.out.println("Element at index 0 after first addCommand undo : " + ourList.get(0));

        removeCommand.execute("Oi");
        System.out.println("Size of list after removeCommand on 'Oi' : " + ourList.size());

        removeCommand.undo();
        System.out.println("Element at index 0 after first removeCommand undo : " + ourList.get(0));
    }
}
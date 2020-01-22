package ex02;
import java.util.Stack;
import java.util.Collection;

class AddCommand<T> extends CommandAbstract{

    AddCommand(Collection<T> genericCollection){
        super(genericCollection);
    } 

    //@Override
    public boolean execute(T element){
        boolean success = this.genericCollection.add(element); //Tries to add the element to the collection
        
        if(success) //If it managed to do so, it pushes the element to the top of the elements stack
            this.elementsStack.push(element);

        return success;
    }

    @Override
    public boolean undo(){
        boolean success = this.genericCollection.remove(this.elementsStack.peek()); //Tries to remove the element from the collection
        if(success)
            this.elementsStack.pop(); //If it managed to do so, it pops the element out of the elements stack

        return success;
    }
}
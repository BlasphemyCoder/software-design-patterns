package ex02;
import java.util.Stack;
import java.util.Collection;

abstract class CommandAbstract<T>{
    protected Stack<T> elementsStack; //Used to store the order in which elements are added/removed
    protected Collection<T> genericCollection; //The collection that's going to be affected by the command

    CommandAbstract(Collection<T> genericCollection){
        this.genericCollection = genericCollection;
        this.elementsStack = new Stack<>();
    }

    /*public boolean execute(T element){
        return false;
    };*/
    public boolean undo(){
        return false;
    };
}
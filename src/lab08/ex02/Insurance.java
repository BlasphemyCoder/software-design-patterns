package ex02;
import java.util.ArrayList;
import java.util.List;

class Insurance{
    private List<Person> registrees = new ArrayList<>();

    public void regist(Person person){
        registrees.add(person);
    }

    public List<Person> getRegistrations(){
        return this.registrees;
    }
}
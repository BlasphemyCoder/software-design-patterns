package ex02;

import java.util.ArrayList;
import java.util.List;

class Parking{
    private List<Person> allowed = new ArrayList<>();

    public void allow(Person person){
        allowed.add(person);
    }

    public boolean remove(Person person){
        boolean exists = false;
        for(Person p : allowed){
            if (p.getName() == person.getName()){
                exists = true;
                break;
            }
        }

        if(exists){
            allowed.remove(person);
            return true;
        }

        return false;
    }

    public List<Person> getAllowed(){
        return this.allowed;
    }
}
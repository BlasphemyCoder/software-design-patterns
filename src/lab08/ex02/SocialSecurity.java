package ex02;
import java.util.ArrayList;
import java.util.List;

class SocialSecurity{
    private static List<Person> registrees = new ArrayList<>();

    public static void regist(Person person){
        registrees.add(person);
    }

    public static List<Person> getRegistrations(){
        return registrees;
    }
}
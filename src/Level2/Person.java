package Level2;

import java.util.ArrayList;

public class Person {
    String name, jobTitle;
    int age;

    Person(String name, String jt, int age){
        this.name = name;
        jobTitle = jt;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + jobTitle;
    }

    public static Person findPerson(String name, ArrayList<Person> pList){
        Person output = null;
        for (Person person:pList
             ) {
            if(person.name.equals(name)) {
                output =  person;

            }
        }
        return output;
    }
}

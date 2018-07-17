package WorkingWithFiles;

public class Person {
    String name, occupation;
    int age;

    Person(){
        age = (int)(Math.random()*100);

    }
    Person(String n,String o, int a){

        name = n;
        occupation = o;
        age = a;

    }
}

package WorkingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> pList = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            pList.add(new Person("Name"+i,"Occupation"+i,(int)(Math.random()*100)));
        }
        File newFile = new File();
        BufferedWriter bw = new BufferedWriter(new FileWriter());
    }

}

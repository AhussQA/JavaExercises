package WorkingWithFiles;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> pList = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            pList.add(new Person("Name"+i,"Occupation"+i,(int)(Math.random()*100)));
        }
        for (Person p :pList
             ) {

            BufferedWriter bw;
            File newFile = new File("C:\\users\\Person\\" +p.name+".txt");
            try {
                bw = new BufferedWriter(new FileWriter(newFile));
                bw.write("Name:"+p.name+"\r\nOccupation:"+p.occupation+"\r\nAge:"+p.age);
                bw.flush();
            }catch(IOException ioe){
                ioe.printStackTrace();

            }catch(Exception e){
                e.printStackTrace();
            }
            finally {

            }

        }
        ArrayList<Person> readList = new ArrayList<>();
        BufferedReader br;
        try {
            File[] fileList = new File("C:\\users\\person").listFiles();
            for(File f: fileList) {
                br = new BufferedReader(new FileReader(f));
                System.out.println(f.getName());
                while(br.ready())
                    System.out.println(br.readLine());
            }
        }catch (Exception e){

        }
    }

}

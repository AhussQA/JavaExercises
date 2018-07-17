package Level2;

import java.util.ArrayList;

public class Level2 {
    public static void main(String[] args) {
        Level2 l2 = new Level2();
        System.out.println(l2.blackjack(18,21));
        System.out.println(l2.blackjack(20,18));
        System.out.println(l2.blackjack(22,22));
        System.out.println(l2.uniqueSum(1,2,3));
        System.out.println(l2.uniqueSum(3,3,3));
        System.out.println(l2.uniqueSum(1,1,2));

        Person p1 = new Person("A","JT",20);
        Person p2 = new Person("B","JT1",21);
        Person p3 = new Person("C","JT2",22);
        ArrayList<Person> pList= new ArrayList<Person>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        System.out.println(Person.findPerson("A",pList));
        System.out.println("HEEEEEEELO");
        Garage garage = new Garage();
        Car c = new Car();
        Motorcycle m = new Motorcycle();
        Truck t = new Truck();
        garage.add(c);
        garage.add(t);
        garage.add(m);
        garage.billCalcAll();
        garage.fix(c);
        garage.remove(c.id);
        garage.remove(Truck.class);
        //garage.emptyGarage();
        System.out.println("Garage: "+garage);



    }

    public int blackjack(int a, int b){
        if(a<=21 && b<=21){
            if(a>b)
                return a;
                else return b;
        }

        if(a>21&&b<=21)
            return b;
        else if(a<=21 && b>21){
            return a;
        }
        else
            return 0;
    }
    public int uniqueSum(int a, int b, int c){
        int acc =0;
        if(a!=b && a!=c)
            acc+=a;
        if(b!=c)
            acc+=b+=c;

        return acc;
    }

    public boolean tooHot(int t,boolean b){
        int lower = 60;
        int upper;
        if(b){
            upper = 100;
        }
        else upper = 90;
        if(lower<=t && t<=upper)
            return true;
        else return false;
    }
}

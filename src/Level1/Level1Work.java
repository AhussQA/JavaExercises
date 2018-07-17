package Level1;

public class Level1Work {
    public static void main(String[] args) {
        Level1Work l1 = new Level1Work();
        l1.helloWorld();
        l1.helloWorld2();
        l1.helloWorld3("Hello World");
        System.out.println(l1.helloWorld4());
        System.out.println(l1.add(1,1));
        System.out.println(l1.add(1,3,true));
        System.out.println(l1.add(1,3,false));
        System.out.println(l1.addeh(0,3,true));
        System.out.println(l1.addeh(1,0,true));
        l1.addeh2();
        l1.arrayex();
        l1.arrayex2();
        l1.arrayex3();
    }
    public void helloWorld(){
        System.out.println("Hello World");
    }
    public void helloWorld2(){
        String output = "Hello World";
        System.out.println(output);
    }
    public void helloWorld3(String s){
        //String output = "Hello World";
        System.out.println(s);
    }
    public String helloWorld4(){
        return "Hello World";
    }

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,boolean bo){

        if(bo)
        return a+b;
        else return a*b;

    }
    public int addeh(int a, int b,boolean bo){
        if(a == 0 && b!= 0)
            return b;
        if(b == 0 && a!= 0)
            return a;
        if(bo)
            return a+b;
        else return a*b;

    }
    public void addeh2(){
        for (int i = 0; i < 10; i++) {

            int output = addeh(i,2,true);
            System.out.print(output+" : ");
        }

    }
    public void arrayex(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println();
        System.out.println(addeh(array[0],array[1],true));

    }
    public void arrayex2(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
    public void arrayex3(){
        int[] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random()*10);
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[j]+" : ");
            }
            System.out.println();

        }
        for (int i = 0; i < array.length ; i++) {
            array[i] *= 10;
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[j]+" : ");
            }
            System.out.println();

        }

    }
}

package Level2;

import java.util.ArrayList;

public class Garage {
    static ArrayList<Vehicle> vList = new ArrayList<Vehicle>();

    public void add(Vehicle v){
        vList.add(v);
        System.out.println("ADD: "+this);

    }
    public void remove(Vehicle v){
        vList.remove(v);
        System.out.println("Remove: "+this);
    }
    public void remove(int id){
        vList.remove(findVehicle(id));
        System.out.println("Remove: "+this);
    }
//    public void remove(Class type){
//        ArrayList<Vehicle> tempList = new ArrayList<Vehicle>();
//        for (Vehicle v:vList
//             ) { if(v.getClass().equals(type)) {
//                    tempList.add(v);
//        }
//        }
//        System.out.println("RemoveByType:\n"+this);
//        vList.removeAll(tempList);
//        tempList.clear();
//    }
public void remove(Class type){
    ArrayList<Vehicle> tempList = new ArrayList<Vehicle>();
    for (Vehicle v:vList
            ) { if(v.getClass().equals(type)) {

    } else{
        tempList.add(v);
    }
    }
    System.out.println("RemoveByType:\n"+this);
    vList = tempList;

}

    public static Vehicle findVehicle(int id){
        Vehicle output = null;
        for (Vehicle vehicle:vList
                ) {
            if(vehicle.id==id) {
                output =  vehicle;

            }
        }
        return output;
    }

    public int billCalcAll(){
        int bill=0;
        Vehicle v;
        for (int i = 0; i < vList.size() ; i++) {
            v = vList.get(i);
            if(v instanceof Motorcycle)
            bill+=1;
            if(v instanceof Car)
            bill+=2;
            if(v instanceof Truck)
            bill+=3;
        }
        System.out.println("Bill All:"+bill);
        return bill;
    }
    public int billCalc(Vehicle v){
        int bill=0;


        if(v instanceof Motorcycle)
        bill+=1;
        if(v instanceof Car)
        bill+=2;
        if(v instanceof Truck)
        bill+=3;
        System.out.println("Bill:"+bill);
        return bill;
    }

    public int fix(Vehicle v){
        return billCalc(v);
    }

    public void emptyGarage(){
        vList.clear();
    }

    @Override
    public String toString() {
        String output = "";
        for (Vehicle v:vList
                ) {
            output += "ID: " + v.id +" Type: "+v.type+ " Engine Size: " + v.engineSize + " Seats: " + v.seats + " Doors: " +v.doorNo + " Wheels: "+v.wheelNo+"\n";
        }
        return output;
    }
}

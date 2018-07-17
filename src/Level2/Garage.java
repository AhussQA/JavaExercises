package Level2;

import java.util.ArrayList;

public class Garage {
   static ArrayList<Vehicle> vList = new ArrayList<Vehicle>();

    public void add(Vehicle v){
        vList.add(v);
    }
    public void remove(Vehicle v){
        vList.remove(v);
    }
    public void remove(int id){
        vList.remove(findVehicle(id));
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

    public int billCalc(){
        int bill=0;
        Vehicle v;
        for (int i = 0; i < vList.size() ; i++) {
            v = vList.get(i);
            if(v instanceof Motorcycle);
            bill+=1;
            if(v instanceof Car);
            bill+=2;
            if(v instanceof Truck);
            bill+=3;
        }
        return bill;
    }
}

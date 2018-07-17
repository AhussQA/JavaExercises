package PaintWizard;

import java.util.ArrayList;

public class PaintWizard {


    public static void main(String[] args) {
        PaintCan p1 = new PaintCan(0);
        PaintCan p2 = new PaintCan(1);
        PaintCan p3 = new PaintCan(2);
        ArrayList<PaintCan> pcList = new ArrayList<PaintCan>();
        int roomSize = 45;
        double currentCheapest =100,currentLeastWaste = 100;
        PaintCan cheapestCan = null,leastWastedCan = null;
        pcList.add(p1);
        pcList.add(p2);
        pcList.add(p3);
        double wasted;


        for(PaintCan p : pcList){

            double roomSizeLeft = roomSize%p.coverage;
            System.out.println("Room size unpainted: "+roomSizeLeft);
            double wholeCans;
            if(roomSize%p.coverage == 0){
                wholeCans = roomSize/p.coverage;
                wasted=0;
                System.out.println("No wasted paint");
            }
            else {

                wholeCans = roomSize / p.coverage + 1;
                wasted = p.coverage - roomSizeLeft;
                System.out.println("Wasted Paint: "+wasted);
            }
            double costWholeCans = wholeCans*p.price;
            System.out.println("Cans to Buy: "+wholeCans+"  Cost: "+costWholeCans);
            if(currentCheapest>costWholeCans) {
                currentCheapest = costWholeCans;
                cheapestCan = p;
            }
            if(currentLeastWaste > wasted){
                currentLeastWaste = wasted;
                leastWastedCan = p;
            }

        }
        System.out.println("Cheapest can is: "+cheapestCan);
        System.out.println("Least wasted can is: "+leastWastedCan);
    }




}

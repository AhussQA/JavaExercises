package PaintWizard;

public class PaintCan {
    String brand;
    int litres,coverage;
    double price;

    public PaintCan(int brand){
        switch (brand){
            case 0:
                this.brand = "CheapoMax";
                    litres = 20;
                    coverage = 10;
                    price = 19.99;
                break;
            case 1:
                this.brand = "AverageJoes";
                litres = 15;
                coverage = 11;
                price = 17.99;
                break;
            case 2:
                this.brand = "DuluxourousPaints";
                litres = 10;
                coverage = 20;
                price = 25;
                break;
            default: this.brand = "NONE";
        }
    }

    @Override
    public String toString() {
        return "Brand: "+ brand+" Price: "+price + " Litres: "+litres + " Coverage: "+coverage;
    }
}

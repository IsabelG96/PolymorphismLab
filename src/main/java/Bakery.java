import java.util.ArrayList;

public class Bakery {

    private String name;
    private ArrayList<BakedGood> stock;
    private double revenue;

    public Bakery(String name){

        this.name = name;
        this.stock = new ArrayList<>();
        this.revenue = 0;
    }


    public void addBakedGood(BakedGood bakedGood) {
        this.stock.add(bakedGood);
    }

    public ArrayList<BakedGood> takeStock(){
        return this.stock;
    }

    public void addRevenue(BakedGood bakedGood){
        this.revenue = bakedGood.price + this.revenue;
    }
//getter
    public double getRevenue(){
        return this.revenue;
    }
}

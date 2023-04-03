public class Bread extends BakedGood {

    BreadWheatType flour;
    public Bread(String name, BreadWheatType flour) {
        super(name);
        this.flour = flour;
    }

    public String getFlour(){
        return String.valueOf(this.flour);
    }
}

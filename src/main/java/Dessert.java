public class Dessert extends BakedGood {

    DessertSugarContent sugar;
    public Dessert(String name, DessertSugarContent sugar) {
        super(name);
        this.sugar = sugar;


    }

    public String getSugar(){
        return String.valueOf(this.sugar);
    }
}

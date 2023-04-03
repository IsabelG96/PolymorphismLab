public class Cake extends Dessert {

    private CakeTopping topping;
    public Cake(String name, CakeTopping topping, DessertSugarContent sugar){
        super(name, sugar);
        this.topping = topping;
    }

    public String getTopping(){
        return String.valueOf(this.topping);
    }






}

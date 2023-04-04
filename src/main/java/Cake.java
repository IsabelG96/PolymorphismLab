public class Cake extends Dessert {

    public CakeTopping topping;
    public String message;
    public Cake(String name, CakeTopping topping, DessertSugarContent sugar){
        super(name, sugar);
        this.topping = topping;
        this.message = "blank";
    }

    public String getTopping(){
        return String.valueOf(this.topping);
    }

    public String setMessage(String message){
        this.message = message;
        return message;
        }

    public String setBirthdayMessage(String name){
        this.message = "Happy Birthday " + name + "!";
        return message;
    }

    public String setBirthdayMessage(){
        this.message = "Happy Birthday!";
        return message;
    }
}

//    Add an extra method to addMessage for adding a name and/or date to a birthday cake.






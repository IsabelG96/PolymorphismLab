import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class BakeryTest {

    Bakery bakery;
    BakedGood bakedGood;
    Dessert dessert;
    Dessert dessert2;
    Bread bread;
    Cake cake;

    @BeforeEach

    public void setUp(){
        bakery = new Bakery("Issy's Bakery");
        dessert = new Dessert("Brownie", DessertSugarContent.MEDIUM);
        dessert2 = new Dessert("Bakewell Slice", DessertSugarContent.HIGH);
        cake = new Cake("Chocolate gateau", CakeTopping.CHOCOLATE, DessertSugarContent.HIGH);
        bread = new Bread("White Loaf", BreadWheatType.WHITE);
        dessert.price = 2.00;
        dessert2.price = 1.50;
        cake.price = 15.00;
        bread.price = 1.00;
    }

    @Test
    public void canAddBakedGoodToBakery(){
        bakery.addBakedGood(dessert);
        bakery.addBakedGood(cake);
        int result = bakery.takeStock().size();
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void canAddRevenue(){
        bakery.addRevenue(dessert);
        bakery.addRevenue(cake);
        double result = bakery.getRevenue();
        assertThat(result).isEqualTo(17);
    }



}



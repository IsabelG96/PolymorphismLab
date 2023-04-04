import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class DessertTest {

    Dessert dessert;

    @BeforeEach
    public void setUp(){
        dessert = new Dessert("Brownie",DessertSugarContent.MEDIUM);
        dessert.price = 2.00;
        dessert.glutenFree = true;
        dessert.vegan = true;
    }

    @Test
    public void canGetSugarContent(){
        assertThat(dessert.getSugar()).isEqualTo("MEDIUM");
    }

    @Test
    public void canGetPrice(){
        double result = dessert.price;
        assertThat(result).isEqualTo(2.00);
    }

    @Test
    public void canGetVegan(){
        boolean result = dessert.vegan;
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void canGetGlutenFree(){
        boolean result = dessert.glutenFree;
        assertThat(result).isEqualTo(true);
    }
}

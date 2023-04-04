import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class BreadTest {
    Bread bread;

    @BeforeEach
    public void setUp(){
        bread = new Bread("Granary Loaf", BreadWheatType.GRANARY);
        bread.price = 1.00;
        bread.glutenFree = true;
        bread.vegan = true;
    }

    @Test
    public void canGetFlour(){
        assertThat(bread.getFlour()).isEqualTo("GRANARY");
    }

    @Test
    public void canGetPrice(){
        double result = bread.price;
        assertThat(result).isEqualTo(2.00);
    }

    @Test
    public void canGetVegan(){
        boolean result = bread.vegan;
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void canGetGlutenFree(){
        boolean result = bread.glutenFree;
        assertThat(result).isEqualTo(true);
    }

}

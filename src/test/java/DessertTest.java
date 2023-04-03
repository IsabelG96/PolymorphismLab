import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class DessertTest {

    Dessert dessert;

    @BeforeEach
    public void setUp(){
        dessert = new Dessert("Brownie",DessertSugarContent.MEDIUM);
    }

    @Test
    public void canGetSugarContent(){
        assertThat(dessert.getSugar()).isEqualTo("MEDIUM");
    }

}

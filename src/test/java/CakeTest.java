import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class CakeTest {

    Cake cake;

    @BeforeEach
    public void setUp(){
        cake = new Cake("Birthday Cake", CakeTopping.ICING, DessertSugarContent.HIGH);
    }

    @Test
    public void canGetTopping(){
        assertThat(cake.getTopping()).isEqualTo("ICING");
    }



}

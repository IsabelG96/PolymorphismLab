import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class BreadTest {
    Bread bread;

    @BeforeEach
    public void setUp(){
        bread = new Bread("Granary Loaf", BreadWheatType.GRANARY);
    }

    @Test
    public void canGetFlour(){
        assertThat(bread.getFlour()).isEqualTo("GRANARY");
    }

}

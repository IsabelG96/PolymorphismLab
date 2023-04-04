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

    @Test
    public void canSetMessage(){
        String result = cake.setMessage("Congratulations");
        assertThat(result).isEqualTo("Congratulations");
    }

    @Test
    public void canSetBirthdayMessage(){
        String result = cake.setBirthdayMessage();
        assertThat(result).isEqualTo("Happy Birthday!");
    }

    @Test
    public void canSetPersonalizedBirthdayMessage(){
        String result = cake.setBirthdayMessage("Clare");
        assertThat(result).isEqualTo("Happy Birthday Clare!");
    }





}

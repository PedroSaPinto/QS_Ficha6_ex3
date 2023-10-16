import org.example.NumDigitos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumDigitosTest {

    static NumDigitos numD;
    int num = 4567326;

    public NumDigitosTest() {
    }

    @BeforeAll
    public static void setup() {
        numD = new NumDigitos();
    }

    @Test
    public void numDigitosTest() {
        int expect = 8;
        int actual = numD.verDigitos(num);
        Assertions.assertEquals(expect, actual, "Erro de cÃ¡lculo");
    }
}

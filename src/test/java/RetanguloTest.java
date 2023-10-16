import org.example.Retangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RetanguloTest {

    static Retangulo ret;
    int comp1 = 3;
    int comp2 = 5;
    int comp3 = 2;
    int larg1 = 5;
    int larg2 = 8;
    int larg3 = 4;

    public RetanguloTest() {
    }

    @BeforeAll
    public static void setup() {
        ret = new Retangulo();
    }

    @Test
    public void areaTest1() {
        int expect = 15;
        int actual = ret.area(this.comp1, this.larg1);
        Assertions.assertEquals(expect, actual, "Erro no cÃ¡lculo da Ã¡rea");
    }

    @Test
    public void areaTest2() {
        int expect = 15;
        int actual = ret.area(this.comp2, this.larg2);
        Assertions.assertEquals(expect, actual, "Erro no cÃ¡lculo da Ã¡rea");
    }

    @Test
    public void areaTest3() {
        int expect = 8;
        int actual = ret.area(this.comp3, this.larg3);
        Assertions.assertEquals(expect, actual, "Erro no cÃ¡lculo da Ã¡rea");
    }

    @Test
    public void perimetroTest1() {
        int expect = 16;
        int actual = ret.perimetro(3, 5);
        Assertions.assertEquals(expect, actual, "Erro no cÃ¡lculo do perimetro");
    }

    @Test
    public void perimetroTest2() {
        int expect = 26;
        int actual = ret.perimetro(5, 8);
        Assertions.assertEquals(expect, actual, "Erro no cÃ¡lculo do perimetro");
    }

    @Test
    public void perimetroTest3() {
        int expect = 10;
        int actual = ret.perimetro(2, 4);
        Assertions.assertEquals(expect, actual, "Erro no cÃ¡lculo do perimetro");
    }

    @Test
    public void trianguloTest() {
        boolean expect = true;
        boolean actual = ret.isTriangle(4, 6, 8);
        Assertions.assertEquals(expect, actual, "Erro no cÃ¡lculo");
    }
}

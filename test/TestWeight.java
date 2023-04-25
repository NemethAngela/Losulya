import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach; // ez a @BeforeEach-el jön létre
import org.junit.jupiter.api.Test; // fontos, hogy innen importáljunk

import controllers.MainController;

public class TestWeight {   //így az osuzályt, amit többször használok, így használhatom
    MainController mc;
    @BeforeEach
    public void initEach() {
        mc = new MainController();
    }
    //Első teszt, egyeznek-e:
    @Test
    public void testCalcWeight01() {
        double actual = mc.calcWeight(30, 35);
        double expected = 2.6521848951755493;
        assertEquals(expected, actual);
    }

    //Második teszt:
    @Test
    public void testCalcWeight02() { 
        double actual = mc.calcWeight(130, 135);
        double expected = 192.0939631220005;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcWeight03() { 
        double actual = mc.calcWeight(150, 160);
        double expected = 303.1068451629199;
        assertEquals(expected, actual);
    }
}

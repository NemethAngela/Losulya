import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import controllers.MainController;

public class TestMethods {
    ArrayList<String> methodNames;

    @BeforeEach
    public void initList() {
        this.methodNames = new ArrayList<>();
        Method[] methods = MainController.class.getDeclaredMethods();
        //forEach ciklus, bejárás
        for (Method method: methods) {
            this.methodNames.add(
            method.getName()
            );
        }
    }

    @Test
    public void testCalcWeightExist() {
        //megjegyzés
        boolean actual = this.methodNames.contains("calcWeight");
        assertTrue(actual);
    }

    @Test
    public void testHandleEventExist() {
        boolean actual = this.methodNames.contains("handleEvents");
        assertTrue(actual);
    }
}

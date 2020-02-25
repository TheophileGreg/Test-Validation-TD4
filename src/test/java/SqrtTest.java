import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void racineEntre1et1() {
        double [] attendu = new double[] {1.0} ;
        assertEquals(attendu, Sqrt.racine(1,1));
    }

    @Test
    void racineEntre1et5() {

        double [] attendu = new double[] {Math.sqrt(1), Math.sqrt(2), Math.sqrt(3), Math.sqrt(4), Math.sqrt(5)} ;
        assertEquals(attendu, Sqrt.racine(1,5));

    }

}
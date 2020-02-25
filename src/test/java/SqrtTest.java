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
    void racineEntre11() {

        float [] attendu = new float[] {1f} ;
        assertEquals(attendu, Sqrt.racine(1,1f));

    }


}
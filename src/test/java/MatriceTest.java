import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriceTest {

    int[][] Y;

    @BeforeEach
    void setUp() {
        Y = Matrice.initMatrice(2,3,5,10);
    }

    @Test
    void matrice_test() {
        assertEquals( 2, Y.length);
        for(int i = 0; i < 2; i++){
            assertEquals(3, Y[i].length);
            for (int j = 0; j < 3; j++){
                assertTrue( Y[i][j] <= 10);
                assertTrue(5 <= Y[i][j]);
            }
        }
    }

}
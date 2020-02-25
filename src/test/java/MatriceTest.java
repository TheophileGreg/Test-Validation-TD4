import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MatriceTest {
    int[][] Y;

    @BeforeEach
    void setUp() {
        Y = initMatrice(M,N,A,B);
    }

    void matrice_test(int M, int N, int A,int  B) {
        assertEquals( M, Y.length);
        for(int i = 0; i < M; i++){
            assertEquals(N, Y[i]);
            for (int j = 0; j < N; j++){
                assertTrue( Y[i][j] <= B);
                assertTrue(A <= Y[i][j]);
            }
        }
    }
}
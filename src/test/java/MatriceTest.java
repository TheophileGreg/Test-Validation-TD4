import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MatriceTest {
    @BeforeEach
    void setUp() {
        int[][] Y = initMatrice(M,N,A,B);
    }

    void matrice_test(M, N, A, B) {
        assertEquals( M, Y.length);
        for(int i = 0; i < M; i++){
            assertEquals(N, Y[i]);
            for (int j = 0; j < N; j++){
                assertTrue( A <= Y[i][j] <= B);
            }
        }
    }
}
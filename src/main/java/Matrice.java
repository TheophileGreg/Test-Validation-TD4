import java.util.Random;

public class Matrice {
    public static int[][] initMatrice(int M, int N, int A, int B) {
        int[][] matrice = new int[M][N];

        Random r = new Random();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrice[i][j] = r.nextInt((B - A) + 1) + A;
            }
        }
        return matrice;
    }
}

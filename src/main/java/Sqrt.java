public class Sqrt {

    public static double[] racine(int a, int b){
        double res[] = new double[b-a+1];

        for (int i = a; i <= b; i++){
            res[i-a] = Math.sqrt(i);
        }
        return res;
    }

}

public class Triangle {

    public static int quelTriangle(int a, int b, int c){
        if(a+b>c && a+c>b && b+c>a) {
            if (a == b && b == c) {
                return 2;
            }
            if (a == b || b == c || a == c) {
                return 1;
            }
            return 3;
        }
        return 4;
    }
}

public class Fibonacci {


    public static int recursiveFibonacci(int n) {
        switch (n){
            case 0: return 0;
            case 1: return 1;
            default: return recursiveFibonacci(n-1) + recursiveFibonacci(n -2);
        }

    }
    public static int linearFibonacci(int n) {
        int a =0;
        int b =0;
        int aux;
        for (int i = 0; i <= n; i++) {
            switch (i){
                case 0: a= 0; break;
                case 1: a= 1; break;
                default:
                    aux = a;
                    a += b;
                    b = aux;
            }
        }
        return a;
    }

}

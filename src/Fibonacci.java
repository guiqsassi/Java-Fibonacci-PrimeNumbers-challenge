public class Fibonacci {

    //1 - Fibonacci
    //
    //-- Criar uma função em sua linguagem preferida. A função deve receber um numero N >= 0 (deve validar o input para a função),
    //e retornar o valor correspondente desse número na sequência Fibonacci. EX. fib(0) =0; fib(1) = 1; fib(2) = 1; fib(3) = 2; fib(5) = 5; fib(6) = 8.


    //--- Criar uma função recursiva que resolva Fibonacci
    public static int recursiveFibonacci(int n) {
        switch (n){
            case 0: return 0;
            case 1: return 1;
            default: return recursiveFibonacci(n-1) + recursiveFibonacci(n -2);
        }

    }

    //--- Criar uma função linear que resolva Fibonacci
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

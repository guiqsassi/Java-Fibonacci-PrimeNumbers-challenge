import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    //-- Criar uma função em sua linguagem preferida. A função deve receber um numero N > 1 (validar o input),
    //e retornar todos os números primos até o número N. EX. p(2) = [2]; p(3) = [2, 3]; p(10) = [2, 3, 5, 7];



    // --- Criar uma função recursiva que resolva p
    public static List<Integer> recursiveGetPrimeNumbers(int n){
        List<Integer> primes = new ArrayList<>();
       return findPrimeNumbers(n, primes);
    }

    public static List<Integer> findPrimeNumbers(int n, List<Integer> primes) {
        boolean isPrime = true;
        if (n < 2) {
            return primes;
        }

        for(int i = 1;i < n; i++){
            if(n % i == 0 && i != 1 && i != n){
                isPrime = false;
            }
        }
        if(isPrime){
            primes.add(n);
        }
        return findPrimeNumbers(n - 1, primes);

    }

    //--- Criar uma função linear que resolva p
    public static List<Integer> linearGetPrimeNumbers(int n){
        List<Integer> primes = new ArrayList<>();
        if(n < 2){
            return primes;
        }
        for(int i = n; i > 1; i--){
            boolean isPrime = true;
            for(int j = 1; j < i; j++){

                if(n % j == 0 && j != 1 && j != n){
                    isPrime = false;
                }
            }
            if(isPrime){
                primes.add(n);
            }
            n--;
        }

        return primes;

    }


}

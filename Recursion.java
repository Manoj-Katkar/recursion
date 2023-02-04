import java.util.function.Function;

public class Recursion{
    public static void main(String[] args) {
        int N = 5;
        // call the Function
        // name(N);
        // one_To_N(N);

        // calling the fibonacci number function
        int fib = ntn_fibonacci(N);
        System.out.println(fib);
        
    }
    /* 
    static void name(int A){
        // base case
        if(A == 0){
            return;
        }

        System.out.println("hello world");
        name(A - 1);
    }
    */

    // write the recursive code to print the number in increasing order
    // example = 1 2 3 4 5
/* 
    static void one_To_N(int N){
        if(N == 0){
            return;
        }

        one_To_N(N - 1);
        System.out.println(N);

    }
    */

    // write the recursive function to find the N th fibonacci numbers 

    static int ntn_fibonacci(int N){
        // base case for the n th ibonacci number 
        if(N == 0 || N == 1){
            return N;
        }

        // main logic
        // find the two previous numbers with the help of same Function
        int temp_1 = ntn_fibonacci(N - 1);
        int temp_2 = ntn_fibonacci(N - 2);

        return temp_1 + temp_2;
    }

}
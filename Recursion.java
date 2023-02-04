import java.util.function.Function;

public class Recursion{
    public static void main(String[] args) {
        int N = 5;
        // call the Function
        // name(N);
        one_To_N(N);
        
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

    static void one_To_N(int N){
        if(N == 0){
            return;
        }

        one_To_N(N - 1);
        System.out.println(N);

    }
}
//
//The Fibonacci sequence is a series of numbers in which each number
//(known as a Fibonacci number) is the sum of the two preceding ones.
//It starts with 0 and 1, and each subsequent number is the sum of the two numbers immediately before it.


import java.io.*;
import java.util.*;
public class Get_Nth_Value_Fibonnaci {
    public static long calculateFibonacciNthValue(int n) {
        if (n <= 0) {
            return 0; // F(0) = 0
        } else if (n == 1) {
            return 1; // F(1) = 1
        } else {
            long prev = 0;
            long current = 1;

            for (int i = 2; i <= n; i++) {
                long next = prev + current;
                prev = current;
                current = next;
            }
            return current;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Get_Nth_Value_Fibonnaci s = new Get_Nth_Value_Fibonnaci();
        long fibN = s.calculateFibonacciNthValue(n);
        System.out.println(fibN); //nth value of the fibonacci sequence
    }

}

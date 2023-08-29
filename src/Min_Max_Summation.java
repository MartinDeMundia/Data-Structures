import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Min_Max_Summation {
    public static void selectionSort(List<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            Collections.swap(arr, minIndex, i);
        }
    }
    public static void miniMaxSum(List<Integer> arr) {
        int n = arr.size();
        long max1 = 0, max2 = 0, genericSum = 0;
        selectionSort(arr);
        for (int i = 0; i < n; i++) {
            genericSum += arr.get(i);
        }
        max1 = genericSum - arr.get(0);
        max2 = genericSum - arr.get(n - 1);
        System.out.println(max2 + " " + max1);
    }
}

class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Min_Max_Summation.miniMaxSum(arr);
        bufferedReader.close();
    }
}

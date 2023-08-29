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
public class Count_Ratio_Positive_Negative_Zeros {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> positivesCount = new HashMap<>();
        Map<Integer, Integer> zerosCount = new HashMap<>();
        Map<Integer, Integer> negativesCount = new HashMap<>();

        for (int int_numbers : arr) {
            if(int_numbers >0){
                positivesCount.put(int_numbers, positivesCount.getOrDefault(int_numbers, 0) + 1);
            }
            if(int_numbers < 0){
                negativesCount.put(int_numbers, negativesCount.getOrDefault(int_numbers, 0) + 1);
            }
            if(int_numbers == 0){
                zerosCount.put(int_numbers, zerosCount.getOrDefault(int_numbers, 0) + 1);
            }
        }
        double positiveRatio = (double) positivesCount.values().stream().mapToInt(Integer::intValue).sum() / arr.size();

        double negativeRatio = (double) negativesCount.values().stream().mapToInt(Integer::intValue).sum() / arr.size();

        double zeroRatio = (double) zerosCount.values().stream().mapToInt(Integer::intValue).sum() / arr.size();

        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);


    }
}

class RatioCountSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Count_Ratio_Positive_Negative_Zeros.plusMinus(arr);

        bufferedReader.close();
    }
}

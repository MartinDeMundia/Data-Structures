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
public class Difference_Diagonal_Matrix {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRightSum = 0;
        int rightToLeftSum = 0;
        int n = arr.size(); // Assuming the matrix is square

        //O(n): Linear time complexity. The algorithm's runtime grows linearly with the input size.
        for (int i = 0; i < n; i++) {
            leftToRightSum += arr.get(i).get(i);
            rightToLeftSum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(leftToRightSum - rightToLeftSum);

    }
}

class difference_Diagonal_MatrixSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int result = Difference_Diagonal_Matrix.diagonalDifference(arr);
        bufferedReader.close();
    }
}

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
public class UniqueFromArray {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int result = 0;
        for (int num : a) {
            result ^= num; // XOR operation time complexity of this approach is O(n), where n is the number of elements in the array.
        }
        return result;
    }
}


class uniqueNumberSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int result = UniqueFromArray.lonelyinteger(a);
        bufferedReader.close();
    }
}

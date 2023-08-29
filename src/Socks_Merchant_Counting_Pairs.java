import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Socks_Merchant_Counting_Pairs {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> colorCount = new HashMap<>();
        // Count the occurrences of each color
        for (int color : ar) {
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }
        // Calculate the number of pairs
        int pairCount = 0;
        for (int count : colorCount.values()) {
            pairCount += count / 2;
        }
        return pairCount;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String line = scanner.nextLine();

        String[] parts = line.split(" ");

        List<Integer> ar = new ArrayList<>();
        for (String part : parts) {
            int num = Integer.parseInt(part);
            ar.add(num);
        }

        int result = Socks_Merchant_Counting_Pairs.sockMerchant(n, ar);

    }
    }

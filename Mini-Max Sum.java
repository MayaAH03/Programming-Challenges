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

class Result {

    /*
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly 
     * four of the five integers. Then print the respective minimum and maximum values as a single line of two 
     * space-separated long integers.
     * Example:
     * arr = [1,3,5,7,9]
     * The minimum sum is: 1 + 3 + 5 + 7 = 16
     * The maximum sum is: 3 + 5 + 7 + 9 = 24
     * The function prints:
     * 16 24
     *
     */

    public static void miniMaxSum(List<Integer> arr) {
    
        arr.sort(null);

        long minSum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }

        long maxSum = 0;
        for (int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);
        

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}


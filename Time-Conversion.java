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
     * Given a time in -hour AM/PM format, convert it to military  (24-hour) time.
     * Note: 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
-    * Note: 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     *
     * Example Input: 07:05:45PM
     * Example Output: 19:05:45
     *
     */

   public static String timeConversion(String s) {
        String[] parts = s.split(":");
        String hours = parts[0];
        String minutes = parts[1];
        String seconds = parts[2];

        //Conversion
        //12AM turning to 00
        if (hours.contains("12") && seconds.contains("AM")){
            hours = "00";
        }
        //Any other time is converted regularly
        else if (!(seconds.contains("AM")) && !(hours.contains("12"))){
            int hoursInt = Integer.parseInt(hours);
            hoursInt = hoursInt + 12;
            String hoursString = Integer.toString(hoursInt);
            hours = hoursString;
        }
        //Noon stays the same.
        else if (hours.contains("12") && seconds.contains("PM")){
            hours = "12";
        }
        
        
        //Removing AM and PM from string.
        seconds = seconds.replace("AM","").replace("PM","");

        
        return hours + ":"+ minutes + ":" + seconds;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

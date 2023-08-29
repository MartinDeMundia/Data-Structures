import java.io.*;
public class Time_Conversion_Millitary {
    public static String timeConversion(String s) {
        // Write your code here
        String[] parts = s.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2].substring(0, 2));
        String meridiem = parts[2].substring(2);

        if (meridiem.equals("PM") && hours != 12) {
            hours += 12;
        } else if (meridiem.equals("AM") && hours == 12) {
            hours = 0;
        }
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}


class timeConversionSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();


        String result = Time_Conversion_Millitary.timeConversion(s);
        System.out.println(result);
        bufferedReader.close();

    }
}


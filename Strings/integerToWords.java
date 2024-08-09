import java.util.ArrayList;
import java.util.List;

public class integerToWords {
    // Static arrays for ones and tens
    private static final String[] onesMap = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tensMap = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int num = 1234567891;
        System.out.println(integerToEnglishWords(num));  // Example usage
    }

    public static String integerToEnglishWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String[] postFix = {"", " Thousand", " Million", " Billion"};
        int i = 0;
        String result = "";

        while (num > 0) {
            int digits = num % 1000;
            if (digits != 0) {
                String s = getDigit(digits) + postFix[i];
                result = s + " " + result;
            }
            num /= 1000;
            i++;
        }

        return result.trim();
    }

    // This method converts a three-digit number into words
    public static String getDigit(int num) {
        List<String> res = new ArrayList<>();

        int hundreds = num / 100;
        if (hundreds > 0) {
            res.add(onesMap[hundreds] + " Hundred");
        }

        int last2 = num % 100;
        if (last2 >= 20) {
            int tens = last2 / 10;
            int ones = last2 % 10;
            res.add(tensMap[tens]);
            if (ones > 0) {
                res.add(onesMap[ones]);
            }
        } else if (last2 > 0) {
            res.add(onesMap[last2]);
        }

        return String.join(" ", res);
    }
}

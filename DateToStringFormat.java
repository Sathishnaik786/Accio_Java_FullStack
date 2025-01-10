import java.text.DateFormatSymbols;
import java.util.Locale;

public class DateToStringFormat {
    public static String dateToString(int year, int month, int day) {
        // Convert year to words
        String yearInWords = convertYearToWords(year);

        // Get month name in short form (e.g., "Feb")
        String monthName = new DateFormatSymbols(Locale.ENGLISH).getShortMonths()[month - 1];

        // Convert day to words
        String dayInWords = convertNumberToWords(day);

        // Combine into desired format
        return yearInWords + " - " + monthName + " - " + dayInWords;
    }

    private static String convertYearToWords(int year) {
        String[] words = { 
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", 
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", 
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" 
        };

        String[] tens = { 
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", 
            "Eighty", "Ninety" 
        };

        int thousands = year / 1000;
        int hundreds = (year % 1000) / 100;
        int lastTwoDigits = year % 100;

        StringBuilder yearInWords = new StringBuilder();
        yearInWords.append(words[thousands]).append(" thousand ");

        if (hundreds > 0) {
            yearInWords.append(words[hundreds]).append(" hundred ");
        }

        if (lastTwoDigits > 0) {
            if (lastTwoDigits < 20) {
                yearInWords.append(words[lastTwoDigits]);
            } else {
                yearInWords.append(tens[lastTwoDigits / 10]);
                if (lastTwoDigits % 10 != 0) {
                    yearInWords.append(" ").append(words[lastTwoDigits % 10]);
                }
            }
        }

        return yearInWords.toString().trim();
    }

    private static String convertNumberToWords(int number) {
        String[] words = { 
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", 
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", 
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" 
        };

        if (number < 20) {
            return words[number];
        }

        return ""; // This handles only numbers < 20 for days
    }

    public static void main(String[] args) {
        int year = 2003;
        int month = 2; // February
        int day = 1;

        String result = dateToString(year, month, day);
        System.out.println(result);
        // Output: Two thousand three - Feb - One
    }
}

package roman;

public class RomanNumerals {

    public static String roman(int number) {
        int d = (number % 10000) / 1000;
        int c = (number % 1000) / 100;
        int x = (number % 100) / 10;
        int i = (number % 10) / 1;
        return romanForDigit(d, 'M', ' ', ' ') + romanForDigit(c, 'C', 'D', 'M') + romanForDigit(x, 'X', 'L', 'C')
                + romanForDigit(i, 'I', 'V', 'X');
    }

    private static String romanForDigit(int digit, char one, char five, char ten) {
        if (digit == 0)
            return "";
        if (digit <= 3)
            return repeatedChar(digit, one);
        if (digit == 4)
            return "" + one + five;
        if (digit <= 8)
            return five + repeatedChar(digit - 5, one);
        return "" + one + ten;
    }

    private static String repeatedChar(int count, char c) {
        String result = "";
        for (int i = 0; i < count; i++)
            result += c;
        return result;
    }

    // public static void main(String[] args) {
    // System.out.println(roman(50));
    // System.out.println(roman(2025));
    // }
}
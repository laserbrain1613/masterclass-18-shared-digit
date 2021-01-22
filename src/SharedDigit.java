public class SharedDigit {

    public static boolean hasSharedDigit(int value1, int value2) {
        if (value1 >= 10 && value1 <= 99 && value2 >= 10 && value2 <= 99) {
            return (value1 / 10 == value2 / 10) || // First digit versus first digit
                    (value1 / 10 == value2 % 10) || // First digit versus last digit
                    (value1 % 10 == value2 / 10) || // Last digit versus first digit
                    (value1 % 10 == value2 % 10); // Last digit versus last digit
        }
        return false;
    }
}
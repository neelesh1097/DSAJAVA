package introduction_functions;
import java.util.*;

public class base_to_decimal {



        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();     // number in given base
            int base = scn.nextInt();  // base (e.g., 8 for octal)

            int result = baseToDecimal(n, base);

            System.out.println(result);
        }

        public static int baseToDecimal(int n, int base) {
            int result = 0;
            int power = 0;

            while (n > 0) {
                int digit = n % 10; // get last digit
                result += digit * Math.pow(base, power);
                n = n / 10;
                power++;
            }

            return result;

    }

}

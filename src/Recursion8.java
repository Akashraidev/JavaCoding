public class Recursion8 {
           public static int sumOfDigits(int number) {
            if (number == 0) {
                return 0;
            } else {
                return number % 10 + sumOfDigits(number / 10);
            }
        }

        public static void main(String[] args) {
            int n = 12345; // Change this to the desired positive integer.

            int sum = sumOfDigits(n);

            System.out.println("The sum of digits in " + n + " is " + sum);
        }
    }

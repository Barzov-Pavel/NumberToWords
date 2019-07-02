public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int reverse = reverse(number);
        int localNumber = 0;
        StringBuilder numbers = new StringBuilder("");

        int countNumber = getDigitCount(number);
        int countReverse = getDigitCount(reverse);

        while (true) {
            if (reverse == 0)
                break;

            localNumber = reverse % 10;
            reverse /= 10;

            if (localNumber == 0) {
                numbers.append("Zero").append(" ");
            } else if (localNumber == 1) {
                numbers.append("One").append(" ");
            } else if (localNumber == 2) {
                numbers.append("Two").append(" ");
            } else if (localNumber == 3) {
                numbers.append("Three").append(" ");
            } else if (localNumber == 4) {
                numbers.append("Four").append(" ");
            } else if (localNumber == 5) {
                numbers.append("Five").append(" ");
            } else if (localNumber == 6) {
                numbers.append("Six").append(" ");
            } else if (localNumber == 7) {
                numbers.append("Seven").append(" ");
            } else if (localNumber == 8) {
                numbers.append("Eight").append(" ");
            } else if (localNumber == 9) {
                numbers.append("Nine").append(" ");
            }
        }

        if (countReverse != countNumber) {
            for (int i = 0; i < countNumber - countReverse; i++) {
                numbers.append("Zero").append(" ");
            }
        }
        if (number != 0) {
            System.out.println(numbers.toString().trim());
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int localNumber = number;

        while (true) {
            reverse += localNumber % 10;
            localNumber /= 10;
            if (localNumber == 0) {
                break;
            }
            reverse *= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        String n = Integer.toString(number);

        return n.length();
    }

}

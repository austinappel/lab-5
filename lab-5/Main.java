import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        long  total = 0;
        int i = 0;
        char letter;
        char notLetter;
        String input;

        System.out.print("Enter a hexadecimal number: ");
        input = scan.next();
        if (input.charAt(0) == '0' && input.charAt(1) == 'x') {
            input = input.substring(2);
        }

        int base = input.length() - 1;

        while (i < input.length()) {
            notLetter = input.charAt(i);
            letter = Character.toUpperCase(input.charAt(i));

            switch (letter) {
                case 'A':
                    total += 10 * Math.pow(16, base);
                    break;
                case 'B':
                    total += 11 * Math.pow(16, base);
                    break;
                case 'C':
                    total += 12 * Math.pow(16, base);
                    break;
                case 'D':
                    total += 13 * Math.pow(16, base);
                    break;
                case 'E':
                    total += 14 * Math.pow(16, base);
                    break;
                case 'F':
                    total += 15 * Math.pow(16, base);
                    break;
                default:
                    total += Integer.parseInt(Character.toString(notLetter)) * Math.pow(16, base);
                    break;

            }

            i++;
            base--;
        }
        System.out.println("Your number is " + total + " in decimal");
    }
}

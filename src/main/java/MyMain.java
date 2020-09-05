import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if ((b-a)*(a-c) >= 0) {
            return a;
        }
        else if ((a-b)*(b-c) >= 0) {
            return b;
        }
        else {
            return c;
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        if (Math.max(a1, b1) == a1) {
            return a;
        }
        else {
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));
        return c;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String command = scan.next();
        String commanda = "median";
        String commandb = "magnitude";
         String commandc = "pythagoras";

        if (command.equals(commanda) == true) {
            System.out.println("What is the first number?");
            int a_1 = scan.nextInt();
            System.out.println("What is the second number?");
            int a_2 = scan.nextInt();
            System.out.println("What is the third number?");
            int a_3 = scan.nextInt();
            System.out.println("The median is " + median(a_1, a_2, a_3));
        }
        else if (command.equals(commandb) == true) {
            System.out.println("What is the first number?");
            int b_1 = scan.nextInt();
            System.out.println("What is the second number?");
            int b_2 = scan.nextInt();
            System.out.println("The integer with the larger absolute value is " + magnitude(b_1, b_2));
        }
        else if (command.equals(commandc) == true) {
            System.out.println("What is the first number?");
            int c_1 = scan.nextInt();
            System.out.println("What is the second number?");
            int c_2 = scan.nextInt();
            System.out.println("The value of c in the Pythagoras theorem is " + pythagoras(c_1, c_2));
        }
        scan.close();
    }
}

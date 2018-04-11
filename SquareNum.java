import java.util.Scanner;

/* Continuously squares the given input numbers until -1 inputted */
public class SquareNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = 0.0;
        while (num != -1) {
            System.out.println("Please enter a number to be squared! (Enter -1 to quit)");
            num = input.nextDouble();
            System.out.println(num + " squared is " + (num * num));
        }
    }
}

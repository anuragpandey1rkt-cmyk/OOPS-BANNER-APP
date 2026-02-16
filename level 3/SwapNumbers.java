import java.util.Scanner;

class SwapNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After swapping:");
        System.out.println("First number = " + number1);
        System.out.println("Second number = " + number2);

        input.close();
    }
}

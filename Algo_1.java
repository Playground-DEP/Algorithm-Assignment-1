import java.util.Scanner;

class Algo_1 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number = 0;
        int num1 = 0;
        int num2 = 1;
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            scanner.nextLine();

            if (number <= 0 ){
                System.out.println("Invalid number, please enter a positive number");
            }

            else {
                System.out.println("Fibonacci Sequence up to " + number + ":");
                System.out.print(num1 + " ");
                
                while (num2 <= number) {
                    System.out.print(num2 + " ");
                    int next = num1 + num2;
                    num1 = num2;
                    num2 = next;
                }
            }
        }while (true);
    }
}
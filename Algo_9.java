import java.util.Scanner;

public class Algo_9 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a word: ");
            String word = scanner.nextLine().strip();
            if (word.isBlank()) System.out.println("Please enter a word!");
            else if (word.split(" ").length != 1) System.out.println("More than one word entered! please try again");
            else{
                boolean isPalindrome = true;
                int length = word.length();
                for (int i = 0; i < length/2; i++) {
                    if (word.charAt(i) != word.charAt(word.length()-i-1)) isPalindrome = false;
                    
                }
                if (isPalindrome) System.out.printf("%s is a palindrome\n", word);
                else System.out.printf("%s is not a palindrome\n", word);
            }
        }while(true);
    }
}

import java.util.Scanner;

public class Algo_5 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a text: ");
            String text = scanner.nextLine();

            if (text.strip().isBlank()){
                System.out.println("empty text!");
            }

            else{
                char[] chars = text.toCharArray();
                char[] temp = new char[chars.length];
                for (int i = 0; i < chars.length; i++) {
                    temp[i] = chars[chars.length-1-i];                   
                }
                System.out.print("Reversed text: ");
                for (int i = 0; i < chars.length; i++) {
                    chars[i] = temp[i];
                    System.out.print(chars[i]);
                }
                System.out.println();               
            }
        }while(true);
        
    }
}

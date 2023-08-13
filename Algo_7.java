import java.util.Scanner;

public class Algo_7 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().strip();
            

            if (sentence.strip().isBlank()){
                System.out.println("empty text!");
            }

            else{
                String words[] = sentence.split(" ");

                String maxString = "";
                String minString = words[0];

                for (int i = 0; i < words.length; i++) {
                    if (words[i].length()>maxString.length()) maxString = words[i];
                    else if (words[i].length()<minString.length()) minString = words[i];
                }
                System.out.printf("Longest word: %s -> %d\n", maxString, maxString.length());
                System.out.printf("Shortest word: %s -> %d\n", minString, minString.length());
            }

        }while(true);
    }
}

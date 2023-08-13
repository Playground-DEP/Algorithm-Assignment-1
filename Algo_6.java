import java.util.Scanner;

public class Algo_6 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().strip();
            

            if (sentence.strip().isBlank()){
                System.out.println("empty text!");
            }

            else{
                String[] words = sentence.split(" ");
                String invertedSentence = "";
                for (int i = words.length - 1; i >= 0; i--) {
                    invertedSentence += words[i] + " ";
                }
                System.out.println(invertedSentence + "\b");

            }
        }while(true);
    }
}

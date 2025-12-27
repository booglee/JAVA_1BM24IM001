import java.util.*;

public class IngWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String para = sc.nextLine();
        String[] words = para.split("\\s+");
        System.out.println("Words ending with 'ing':");
        for (String word : words) {
            if (word.endsWith("ing")) {
                System.out.println(word);
            }
        }
        sc.close();
    }
}
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        String[] words = s.trim().split("\\s+");
        System.out.println("Word count: " + words.length);
        sc.close();
    }
}
import java.util.*;

public class StringHalfCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Position " + i + ": " + s.charAt(i));
        }
        char[] half = new char[s.length() / 2];
        for (int i = 0; i < half.length; i++) {
            half[i] = s.charAt(i);
        }
        System.out.println("First half copied to array:");
        for (char ch : half) {
            System.out.print(ch);
        }
        System.out.println();
        sc.close();
    }
}

package P;

import java.util.*;

public class IndexCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items = {"apple", "banana", "cherry", "date"};
        System.out.print("Enter index to access: ");
        try {
            int index = sc.nextInt();
            System.out.println("Item: " + items[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        }
        sc.close();
    }
}
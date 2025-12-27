package P;

import myPackage.Addition;

public class Mainclass {
    public static void main(String[] args) {
        Addition obj = new Addition();
        int sum = obj.add(10, 20);
        System.out.println("Sum: " + sum);
    }
}
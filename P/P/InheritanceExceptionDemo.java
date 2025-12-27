package P;
import java.util.*;

class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

class Father {
    int age;
    Father(int age) throws WrongAge {
        if (age < 0) throw new WrongAge("Invalid Father Age");
        this.age = age;
    }
}

class Son extends Father {
    int sonAge;
    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);
        if (sonAge >= fatherAge) throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        this.sonAge = sonAge;
    }
}

public class InheritanceExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Father's age: ");
            int fAge = sc.nextInt();
            System.out.print("Enter Son's age: ");
            int sAge = sc.nextInt();
            Son s = new Son(fAge, sAge);
            System.out.println("Father's age: " + s.age);
            System.out.println("Son's age: " + s.sonAge);
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
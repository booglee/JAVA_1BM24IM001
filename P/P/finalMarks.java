package P;
import SEE.*;
import CIE.*;
import java.util.*;
public class finalMarks{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Personal[] p = new Personal[n];
        Internals[] in = new Internals[n];
        External[] ex = new External[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));
            String usn = sc.nextLine();
            String name = sc.nextLine();
            int sem = sc.nextInt();
            int[] imarks = new int[5];
            for (int j = 0; j < 5; j++) imarks[j] = sc.nextInt();
            int[] emarks = new int[5];
            for (int j = 0; j < 5; j++) emarks[j] = sc.nextInt();
            sc.nextLine();
            p[i] = new Personal(usn, name, sem);
            in[i] = new Internals(imarks);
            ex[i] = new External(usn, name, sem, emarks);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student: " + p[i].name + " USN: " + p[i].usn);
            for (int j = 0; j < 5; j++) {
                int finalMarks = in[i].marks[j] + ex[i].marks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
        }
        sc.close();
    }
}

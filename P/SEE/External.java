package SEE;
import CIE.Personal;

public class External extends Personal {
    public int[] marks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        this.marks = marks;
    }
}

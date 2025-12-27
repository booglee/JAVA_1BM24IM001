package P;
public class RhymeString {
    public static void main(String[] args) {
        String s1 = new String("Mary had a little lamb");
        char[] c = {'l','i','t','t','l','e',' ','l','a','m','b'};
        String s2 = new String(c);
        String s3 = new String("Mary had a little lamb".toCharArray());
        byte[] b = "it's fleece was white as snow".getBytes();
        String s4 = new String(b);

        String rhyme = s1 + "\n" + s2 + "\n" + s3 + "\n" + s4;
        System.out.println(rhyme);
        System.out.println("Length: " + rhyme.length());
    }
}
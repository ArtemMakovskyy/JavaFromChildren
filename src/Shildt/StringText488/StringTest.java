package Shildt.StringText488;

class ABC {
    int a, b;
    String c = " Date ";

    public ABC(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.err.println(toString());
    }

    @Override
    public String toString() {
        return "ABC{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }


}

public class StringTest {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s3 = "abcdef";
        String s = new String(chars);
        System.out.println(s + "/" + s3);
        String f = new String(chars, 2, 3);
        System.out.println(f);

        char c[] = {'J', 'a', 'v', 'a', '!', '!'};
        String c1 = new String(c);
        String c2 = new String(c1);
        System.out.println(c1);
        System.out.println(c2);

        byte ascii[] = {65, 66, 67, 68, 69, 70};
        String s1 = new String(ascii);
        System.out.println(s1);
        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);

        System.out.println(s.length());
        System.out.println("abc".length());
        String s5 = "A" + 2 + 2;
        System.out.println(s5);
        System.out.println(s.charAt(1));

        ABC abc = new ABC(1, 2, "asdsa");


    }
}

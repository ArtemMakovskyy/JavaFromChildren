package Shildt.StringText488;

public class AppendDemo {
    public static void main(String[] args) {
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);
        s = sb.append("a = ").append(a).append(" !").toString();
        System.out.println(s);

        StringBuffer sb2 = new StringBuffer("MNE JAVA");
        sb2.insert(4,"like ");
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer("abcde");
        System.out.println(sb3);
        System.out.println(sb3.reverse());

        StringBuffer sb4 = new StringBuffer("Этo простой тест.");
        sb4.delete(3,11);
        System.out.println(sb4);

        sb4.deleteCharAt(0);
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer("Этo простой тест.");
        sb5.replace(4,11,"был");
        System.out.println(sb5);

        System.out.println(sb2.substring(1,2));
    }
}

package Shildt.StringText488;

public class StringReplace2 {
    public static void main(String[] args) {
        String str = "This is a test. This is, too.";
        String replace = "REPLACE";
        System.out.println(str);

        int serchIndex = str.indexOf("test");

        System.out.println("start of input: "+serchIndex);
        String resultStartString = str.substring(0,serchIndex);
        System.out.println("str.substring(0,serchIndex) "+resultStartString);

        resultStartString = resultStartString + replace;
        System.out.println(resultStartString);

        String EndString = str.substring(serchIndex);
        System.out.println(EndString);

        EndString = str.substring(serchIndex+"test".length());
        System.out.println("finish is a one digit "+EndString);
        String strEnd =resultStartString +EndString;
        System.out.println(strEnd);

        //concat()
        System.out.println();
        String t1 = "One ";
        String t2 = "think";
        String t3 = t1.concat(t2);
        System.out.println(t3+" t1.concat(t2)");

        String t4 = "Hello";
        String t5 = t4.replace('l', 'w');
        System.out.println(t5);

        t5 = t4.replace("He", "A");
        System.out.println(t5);

        String t6 = "        Превед медвед.         ";
        String t7 = t6.trim();
        System.out.println(t6);
        System.out.println(t7 + "trim");

    }
}

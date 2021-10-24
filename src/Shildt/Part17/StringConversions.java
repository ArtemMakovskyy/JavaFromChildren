package Shildt.Part17;

public class StringConversions {
    public static void main(String[] args) {
        int num = 19648;
        System.out.println("Чиcлo " + num + " в  двоичной форме: " +Integer.toBinaryString(num));
        System.out.println("Чиcлo " + num + " в  восьмеричной  форме: " +Integer.toOctalString(num));
        System.out.println("Чиcлo " + num + " в  шестнадцатеричной форме: " +Integer.toHexString(num));

    }
}

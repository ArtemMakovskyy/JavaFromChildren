package Shildt.PART1.S228;

public class S201StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First line";
        String strOb2 = "Second line";
        String strOb3 = strOb1;

        System.out.println("Length of lune Ob1 = " + strOb1.length());
        System.out.println("Symbol 3 - "+ strOb1.charAt(3));
        if(strOb1.equals(strOb2)) System.out.println("1 amd 2 = ");
        else System.out.println(" do not equals 1 and 2");
        if(strOb1.equals(strOb3)) System.out.println("1 and 3 = ");
        else System.out.println(" do not equals 1 and 3");

    }
}

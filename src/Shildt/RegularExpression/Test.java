package Shildt.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("javap");
        Matcher  mat = pattern.matcher("java f javap");
        if (mat.find()){
            System.out.println("ok");
        }


    }
}

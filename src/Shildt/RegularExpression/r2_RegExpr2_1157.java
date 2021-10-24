package Shildt.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r2_RegExpr2_1157 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 99");
        System.out.println(mat.find());
    }
}

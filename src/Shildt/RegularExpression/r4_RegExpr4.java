package Shildt.RegularExpression;
/**
 * + qeuals one times or more
 * * qeuals null times or more
 * ? denoutes equals zero times or one-time
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TestIt2 {
    void info() {
        String[] infoMetaSymbols = {
                "\\b Позиция соответствующая границе слова. \\bjava\\b",
                "\\B Позиция не соответсятвующая границе слова",
                "\\n Соответсятвует символу новой строки",
                "\\r Соответствует символу возврата каретки",
                "\\t Соответствует символу табуляции",
                "\\f Соответствует символу конца файла",
                "\\d Соответствует любой десятичной цифре",
                "\\D Соответствует любому символу, кром десятичной цифре",
                "\\w Соответствует любому алфавитно-цифровому символу и символу подчеркивания" +
                        "=[a-zA-Z_0-9]",
                "\\W Соответствует всем символам, кроме \\w",
                "\\s Соответствует любому пробельному символу",
                "\\S Соответствует любому не пробельному символу",
                "+ Предшествующий символ входит в строку один и более раз",
                "* Предшествующий символ входит в строку любое число раз, включая 0",
                "? Предшествующий символ либо входит в строку один раз, либо в неё не входит",
                "{n} Предшествующий символ входит в строку n раз",
                "{n,} Предшествующий символ входит в строку n и более раз",
                "{n,m} Предшествующий символ входит в строку от n до m раз",
                ". соответствует одному любому символу",
                "[a-z]",
                "[^a-d] за исключением указанных",
                "^ позиция в начале строки",
                "$ позиция в конце строки",
                "| любое из раздляемых выражений. Примнр [a-f]|[2-4]",
                "(...) логическое объединение",

        };
        for (String s : infoMetaSymbols) {
            System.out.println(s);
        }
    }
    void _4RegExpr4() {
        int count = 0;
        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW WW");

        while (mat.find()) {
            count++;
            System.out.println(count + " Coвпaдeниe: " + mat.group());
        }
    }

    void _5RegExpr5() {
        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find()) {
            System.out.println("Coвпaдeниe: " + mat.group());
        }
    }

    void _6RegExpr6() {
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find()) {
            System.out.println("Coвпaдeниe: " + mat.group());
        }
    }

    void _7RegExpr7() {
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while (mat.find()) {
            System.out.println("Coвпaдeниe: " + mat.group());
        }
    }

    void _8RegExpr8_1161() {
        String str = "Jon Jonathan Frank Ken Todd";
        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);
        System.out.println("Иcxoднaя последовательность: " + str);
        str = mat.replaceAll("Eric ");
        System.out.println("Измeнeннaя последовательность: " + str);

    }

    void _9RegExpr9() {//1162
        Pattern pat = Pattern.compile("[ ,.!]");
        String[] strs = pat.split("one two,alpha9 12!done.");

        for (int i = 0; i < strs.length; i++)
            System.out.println("Cлeдyющaя лексема: " + strs[i]);


    }

    void test() {
        int count = 0;
        Pattern pat = Pattern.compile("Z{2,}");
        Matcher mat = pat.matcher("z ZZ ZZZWWW aWW WWWW");

        while (mat.find()) {
            count++;
            System.out.println(count + " Coвпaдeниe: " + mat.group());
        }
    }
}

public class r4_RegExpr4 {
    public static void main(String[] args) {
        TestIt2 t = new TestIt2();
//        t.info();
        System.out.println(2);
        t._4RegExpr4();//"W+" / mat.group()
        System.out.println(3);
        t._5RegExpr5();
        System.out.println(4);
        t._6RegExpr6();
        System.out.println(5);
        t._7RegExpr7();
        System.out.println(6);
        t._8RegExpr8_1161();
        System.out.println(7);
        t._9RegExpr9();
        System.out.println(8);
        t.test();


    }
}

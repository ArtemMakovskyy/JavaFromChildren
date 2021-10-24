package Shildt.RegularExpression;
// стр 1156

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern и Matcher.
 * В классе Р а t t е rn конструкторы не определяются.
 * Вместо этого для составления шаблона вызывается фабричный метод compile ()
 * Метод сompilе ( ) преобразует в шаблон символьную строку,
 * Чтобы определить, совпадает ли с шаблоном подпоследовательность из входной
 * последовательности символов, следует вызвать метод find ()
 * Символьную строку, содержащую последнюю совпавшую последовательность, можно получить,
 * вызвав метод group ( ) .
 * Если ни одного совпадения не обнаружено, генерируется исключение типа IllegalSta teException.
 *Вызвав метод start (), можно получить индекс текущего совпадения во входной последовательности символов,
 * а индекс, следующий после текущего совпадения, -вызвав метод end ( ) .
 * Каждую совпавшую последовательность символов можно заменить другой
 * последовательностью, вызвав метод replaceAll ()
 * апример, класс символов [wxyz] совпадает с символами w, х, у или z.
 * Чтобы задать обратный набор символов, перед ними следует указать знак л.
 * Например, класс символов [ лwxyz] совпадает с любым символом, кроме w, х, у и z.
 */
public class r1_RegExpr1156 {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;
        pat = Pattern.compile("Java");

        mat = pat.matcher("Java");
        found = mat.matches();// проверить на совпадение

        System.out.println("Пpoвepкa совпадения Java с Java:");
        if (found) System.out.println("Coвпaдaeт");
        else System.out.println("NE Coвпaдaeт");
        System.out.println();
        System.out.println("Проверка совпадения Java с Java 9:");
        mat = pat.matcher("Java 9");
        found = mat.matches();
        if (found) System.out.println("Coвпaдaeт");
        else System.out.println("NE Coвпaдaeт");

    }
}

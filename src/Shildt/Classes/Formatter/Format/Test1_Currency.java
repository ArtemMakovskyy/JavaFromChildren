package Shildt.Classes.Formatter.Format;
//https://www.youtube.com/watch?v=O2NiLjzkvn0
import java.text.MessageFormat;

public class Test1_Currency {
    public static void main(String[] args) {
        String s1 = "On 22-02-2017 was huracain";
        String s2 = "On {0} was {1}";
        String s3 = MessageFormat.format(s2,"22-02-2017", "huracain");
        System.out.println(s3);

        String s4 = "On {1} was {0}";
        String s5 = MessageFormat.format(s4,"22-02-2017", "huracain");
        System.out.println(s5);

//        On 22-02-2017 was huracain
//        On huracain was 22-02-2017


    }
}

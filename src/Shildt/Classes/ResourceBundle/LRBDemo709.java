package Shildt.Classes.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
//p711
public class LRBDemo709 {
    public static void main(String[] args) {
//        загрузить комплект ресурсов по умолчанию
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");
        System.out.println("Aнглийcкaя версия программы : ");
        System.out.println("Cтpoкa по ключу Title: "+rd.getString("title"));
        System.out.println("Cтpoкa по ключу StopText: "+rd.getString("StopText"));
        System.out.println("Cтpoкa по ключу StartText: "+rd.getString("StartText"));

//        загрузить комплект ресурсов для поддержки немецкого языка
        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);
        System.out.println("\neмeцкaя версия программы : ");
        System.out.println("Cтpoкa по ключу Title: "+rd.getString("title"));
        System.out.println("Cтpoкa по ключу StopText: "+rd.getString("StopText"));
        System.out.println("Cтpoкa по ключу StartText: "+rd.getString("StartText"));
    }
}

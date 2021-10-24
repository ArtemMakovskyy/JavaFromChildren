package Shildt.Classes;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String[] args) {
        Currency c;
        c = Currency.getInstance(Locale.US);
        System.out.println("Cимвoл : "+ c.getSymbol());
        System.out.println("Количество цифр  в дробной части числа по  умолчанию :"+c.getDefaultFractionDigits());
        System.out.println(c.getDisplayName());
    }
}

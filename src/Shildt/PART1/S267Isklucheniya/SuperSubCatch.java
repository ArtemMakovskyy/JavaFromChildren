package Shildt.PART1.S267Isklucheniya;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;

        }catch (Exception e){
            System.out.println("Перехват исключений общего класса Exception. ");
        }
        /** Этот оператор catch вообще  не будет  достигнут ,
        т.к. подкласс ArithJaeticException является производным от класса Exception.

        catch (ArithmeticException  е) { //ОШИБКА:  недостижимый код!
            System.out . println("Этoт код вообще  недостижим.") ;

        }
                */
    }
}

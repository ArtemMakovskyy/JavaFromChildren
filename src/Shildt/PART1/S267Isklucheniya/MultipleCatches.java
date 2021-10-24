package Shildt.PART1.S267Isklucheniya;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a  ="+a);
            int Ь = 42 / a;
            int с [] = {  1 } ;
            с[42] = 99;
        }catch (  ArithmeticException  е){
            System.out . println( "Дeлeниe на нуль:   "+ е) ;
        }
        catch (ArrayIndexOutOfBoundsException е){
            System.out. println( "Ошибка индексации за пределами массива:   "+ е) ;
        }
        System.out.println( "Пocлe блока операторов try/catch.") ;
    }
}

package Shildt.PART1.S152;

import java.io.IOException;


public class S135DoWhile {
    public static void main(String[] args) throws IOException {
        DoWHile dw = new DoWHile();
 //       dw.doWhile2();

        char choice;
        do {
            System.out.println("Cпpaвкa  по оператору:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" З. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("Bыбepитe нужный пункт");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (выpaжeниe)   {");
                System.out.println(" сазе константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ..");
                System.out.println("}");
                break;

            case '3':
                System.out.println("while:\n");
                System.out.println("while(ycлoвиe) оператор ;");
                break;
            case '4':
                System.out.println("do-while :\n");
                System.out.println("do {");
                System.out.println(" оператор; ");
                System.out.println("} while (условие) ;");
                break;
            case '5':
                System.out.println("for :\n");
                System.out.println("for (инициaлиэaция; условие ;  итерация}");
                System.out.println("if: оператор; ");
                break;
        }
    }


    }


class DoWHile{
    void doWhile(){
        int n= 10;
        do{
            System.out.println("takt "+ n);
            n--;
        }while (n>0);
    }
    void doWhile2() {
        int n = 10;
        do {
            System.out.println("takt " + n);
//            n--;
        } while (n-- > 0);
    }



}
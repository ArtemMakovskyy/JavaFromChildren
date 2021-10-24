package javaForChildren;

public class DifFanCollection {
    /**             Логические функции
     *  Логическое или
     *   if(state.equals("Texas")      ||      state.equals("California")
     *
     * Логическое и
     * if(state.equals("NewYork") &&  price>110)
     *
     *Логическое     не(negation)    !   / != не равно / if(!(price>=50))
     *
     * discount= price> 50? 10:5;
     *
     */

    /**
     * if else
     */
    public void tabelIf(int testResultOut) {
        char grade;
        int testResult = testResultOut;

        if (!(testResult <= 89)) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println();
        System.out.println("Ваш бал - " + testResult + " и Ваша буква - " + grade + " /тест if подсчет бала/");

        /**switch*/


        char latter = grade;
        switch (latter) {
            case 'A':
                System.out.println("Отлично");
                break;
            case 'B':
                System.out.println("Хорошо");
                break;
            case 'C':
                System.out.println("Подтяни");
                break;
            case 'D':
                System.out.println("Аяяй");
                break;
        }
    }

    public int rost() {
        int x = 2;
        System.out.println(x + " sm.");
        return x;
    }

    ;
}


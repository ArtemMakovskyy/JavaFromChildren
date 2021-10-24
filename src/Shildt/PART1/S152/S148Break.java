package Shildt.PART1.S152;

public class S148Break {
    public static void main(String[] args) {
        WorkBreak wb = new WorkBreak();
        int s = 6;
        switch (s) {
            case 1:
                wb.breakLoop();
                break;
            case 2:
                wb.breakLoop2();
                break;
            case 3:
                wb.breakLoop3();
                break;
            case 4:
                wb.breakGoto();
                break;
            case 5:
                wb.breakLoop4();
                break;
            case 6:
                wb.breakError();
                break;
        }

    }
}


class WorkBreak {
    void breakLoop() {
        for (int i = 0; i < 100; i += 10) {
            if (i == 50) break;
            System.out.println("i: " + i);
        }
        System.out.println("cikl finishid");
    }

    void breakLoop2() {
        int i = 0;
        while (i < 100) {
            if (i >= 10) break;
            System.out.println("i: " + i);
            i += 3;
        }
        System.out.println("cikl finishid");
    }

    void breakLoop3() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Line " + i + ":");
            for (int j = 0; j < 100; j++) {
                if (j == 20) break;
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("finish");
    }

    void breakGoto() {
        System.out.println();
        boolean t = true;
        first:
        {
            second:
            {
                therd:
                {
                    System.out.println("Предшествует оператору брейк.");
                    if (t) break second; // выход из блока секонд
                }
                System.out.println("не будет віполнятся");
            }
            System.out.println("этот следует за блоком секонд");
        }
    }

    void breakLoop4(){
        outer:
        for (int i = 0; i < 4; i++) {
            System.out.print("Prohod " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; // выход из общих циклов
                System.out.print(j + " ");
            }
            System.out.println("ne budet vivoditsia");
        }
        System.out.println("cicls finish");
    }

    void breakError() {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд" + i + "· ");
        }
        for (int j = 0; j < 100; j++) {
            if (j == 10)// break; //one; // oшибка
            System.out.print(j + " ");
        }
    }
}
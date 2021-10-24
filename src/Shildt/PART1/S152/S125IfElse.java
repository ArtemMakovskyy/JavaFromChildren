package Shildt.PART1.S152;

/**
 * if (условяе)  операторl ;
 * else оператор2;
 */
public class S125IfElse {
    public static void main(String[] args) {
        Rascoti ras = new Rascoti();
//        ras.ifOne();
//        System.out.println();
//        ras.switchFun();
//        ras.switchFun1();
        ras.switchFunSeazon();
    }
}


class Rascoti{

    void ifOne() {
        int month = 4;
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "whinter ";
        else if (month == 3 || month == 4 || month == 5)
            season = "spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "summer ";
        else if (month == 9 || month == 10 || month == 11)
            season = "autumn ";
        else season = "XZ";
        System.out.println("naw " + season);
    }

    void ifTwo(){
        int month = 12;
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "whinter ";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "summer ";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "autumn ";
        } else season = "XZ";
        System.out.println("naw " + season);
    }

    void ifTree() {
        int month = 4;
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "whinter ";
        }
        else season = "XZ";

        System.out.println("naw " + season);
    }

    void switchFun() {
        for (int w = 0; w < 6; w++)
            switch (w) {
                case 0:
                    System.out.println("w=0");
                    break;
                case 1:
                    System.out.println("w=1");
                    break;
                case 2:
                    System.out.println("w=2");
                    break;
                case 3:
                    System.out.println("w=3");
                    break;
                default:
                    System.out.println("more then 3");
            }
    }

    void switchFun1(){
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("<6");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("<10");
                case 10:
                default:
                    System.out.println("finish");
            }
        }
    }

    void switchFunSeazon() {
        int i = 6;
        String seazon;

        switch (i) {
            case 12:
            case 1:
            case 2:
                seazon = "whinter";
                break;
            case 3:
            case 4:
            case 5:
                seazon = "spring";
                break;
            case 6:
            case 7:
            case 8:
                seazon = "summer";
                break;
            case 9:
            case 10:
            case 11:
                seazon = "autumn";
            default:
                seazon = "ooolala";
        }
        System.out.println(i + " - month. Now is " + seazon);
    }


}

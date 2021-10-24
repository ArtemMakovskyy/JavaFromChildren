package Shildt.PART1.S325Enum;

public class EnumDemo {
    public static void main(String[] args) {

        Apple ap;
        ap = Apple.Cortland;
        switch (ap){
            case Jonathan:
                System.out.println(1);
                return;
            case  GoldenDel:
                System.out.println(2);
                return;
            default:
                System.out.println(5);
        }

Apple [] allAp = Apple.values();
        for (Apple a :
                allAp) {
            System.out.print(a+ ", ");
        }
        System.out.println();
ap = Apple.valueOf("GoldenDel");
        System.out.println(ap);


        Week week;
        System.out.println();
        System.out.println(Week.Friday);
        System.out.println(Week.Friday.numsDay());
        System.out.println();
        for (Week w:
                Week.values()) {
            System.out.print(w+" "+w.numsDay()+" - день. ");
        }

    }
}


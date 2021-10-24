package Shildt.PART1.S267Isklucheniya;

public class ThrowDemo {

    static void demoproc() {
        try {
            throw new NullPointerException("1/ дeмoнcтpaция");
        } catch (NullPointerException e) {
            System.out.println("2/ Исключение перехвачено в  теле метода demoproc() .");
            throw e; // повторно сгенерировать исключение
        }
    }


    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("3/ Пoвтopный перехват: " + e);
        }
    }
}

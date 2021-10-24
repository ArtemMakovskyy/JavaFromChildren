package Shildt.Part17;
//Измерение времени выполнения программы
public class Elapsed {
    public static void main(String[] args) {
        long start, end;
        System.out.println("Измерение времени перебора от О до 100000000");
        start = System.currentTimeMillis();
        for ( long i = 0; i< 1900000000;i++);
        end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.nanoTime();
        for ( long i = 0; i< 1900000000;i++);
        end = System.nanoTime();
        System.out.println(end-start);
    }
}

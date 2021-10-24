package Shildt.Paralelizm.ForkJoin;

public class Info {
    public static void main(String[] args) {
        String ForkJoinTaskV = "ForkJoinTask<V>  - Абстрактный класс, определяющий выполняемую задачу \n";
        String ForkJoinPool  = "ForkJoinPool   - Управляет выполнением задач типа ForkJoinTask  \n";
        String RecursiveAction  = "RecursiveAction (инкапсу лирует задачу,)  - Является производным от " +
                "класса ForkJoinTask<V> \n" +
                " для выполнения задач, не возвращающих значения  \n";
        String RecursiveTaskV = "Recursiveтask<V>   - вляется производным от класса ForkJoinTask<V> \n" +
                " для выполнения задач, возвращающих значения  \n";

        System.out.println(ForkJoinTaskV);
        System.out.println(ForkJoinPool);
        System.out.println(RecursiveAction);
        System.out.println(RecursiveTaskV);
/**
 *  ForkJoinTask методы fork () и join ()
 *   f о r k ( ) передает вызывающую задачу для асинхронного выполнения.
 *   join () ожидает завершения задачи, для которой он вызван
 *   Чтобы запустить задачу на выполнение и не ждать ее завершения, можно воспользоваться методом executе (
 *
 *   с помощью методов fork () и join ()
 *   можно запустить на выполнение одну или несколько новых задач и ожидать их завершения.
 *
 *   invoke (). Он объединяет операции вилочного соединения в единый вызов,
 *
 *   Вызвав метод coпunonPool (),определенный в классе ForkJoinPool, можно
 *   получить ссылку на общий пул, хотя это и необязательно.
 *
 *   ======================
 *   RecursiveAction инкапсу лирует задачу.
 *   compute () представляет вычислительную часть задачи.
 *   ======================
 *   чтобы запустить на выполнение задачу типа ForkJoinTask, сначала потребуется объект типа ForkJoinPool
 *   два способа получения объекта типа ForkJoinPool
 *
 *   1) используя конструктор класса ForkJoinPool
 *   2) воспользоваться так называемым общим пулом.
 *===========================================================
 * запустить задачу на выполнение из общего пула можно двумя способами.
 *  1. ызвав метод comrnonPool (), можно получить ссылку на пул,
 *  а затем вызвать по этой ссылке метод invoke () или execute ()
 *  2. в любой части задачи, кроме вычислительной, можно вызвать метод fork () или invoke () из класса ForkJoinTask.
 *  В последнем случае общий пул выбирается автоматически. Иными словами, метод fork () или invoke () запу
 *  стит задачу на выполнение из общего пула, если задача еще не выполняется в пуле типа ForkJoinPool.
 *
 *  Следует также иметь в виду, что в пуле типа ForkJoinPool используются по
 *  токовые демоны. Потоковый демон автоматически завершается
 *  вместе со всеми пользовательскими потоками.
 *  Таким образом, нет никакой необходимости явно завершать работу пула типа ForkJoinPool.
 *  Тем не менее это можно сделать, вызвав метод shutdown ().
 *  Впрочем, вызов метода shutdown () не оказывает ника
 *  кого влияния на общий пул.
 *
 */

    }
    static int numCore = Runtime.getRuntime().availableProcessors();
}
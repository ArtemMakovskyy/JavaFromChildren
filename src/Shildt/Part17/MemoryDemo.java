package Shildt.Part17;
//Продемонстрировать применение методов totalМE1111ory() ,
//freeМemory ()  и qc ()

public class MemoryDemo {

    public static void main(String[] args) {
Runtime rt = Runtime.getRuntime();
        System.out.println(rt);
        long mem1, mem2;
        Integer someints[] = new Integer[1000];

        System.out.println("Bceгo памяти:                   "+rt.totalMemory());
        mem1 = rt.freeMemory();
        System.out.println("Cвoбoднoй памяти исходно::      "+mem1);
        rt.gc();
        mem1 = rt.freeMemory();
        System.out.println("Cвoбoднoй памяти после очистки:  "+mem1);
        for (int  i=0;  i<1000; i++) someints[i] = new Integer(i);
        mem2 =  rt.freeMemory();
        System.out.println("Cвoбoднoй памяти после очистки:  "+mem2);
        System.out.println("Иcпoльзoвaнo памяти  для выделения:    "+(mem1-mem2));
//        отбросить Integers
        for (int  i=0;  i<1000; i++) someints[i] = null;
        rt.gc();
        mem2 =  rt.freeMemory();

        System.out.println("Cвoбoднoй памяти после очистки   отвергнутых объектов типа Integer:   "+mem2);
    }


}

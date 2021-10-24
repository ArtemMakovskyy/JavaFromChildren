package Shildt.StringText488;

public class IndexOfDemo {
    public static void main(String[] args) {
        String s = "Now is the time for all good men " + "to come to the aid of their country. ";
        System.out.println(s);

        System.out.println("indexOf (t) = " + s.indexOf('t'));
        System.out.println("lastindexOf (t) =  " + s.lastIndexOf('t'));
        System.out.println("indexOf (the)  = " + s.indexOf("the"));
        System.out.println("LadtIndexOf (the) =  " + s.lastIndexOf("the"));

        System.out.println();
        System.out.println("indexOf (t, 12) =  " + s.indexOf('t',12));
        System.out.println("lastindexOf(t, 60) =  " + s.lastIndexOf('t',60));
        System.out.println("indexOf (the,   10) =   " + s.indexOf("the",10));
        System.out.println("lastindexOf(the, 60) =  " + s.lastIndexOf("the",60));

//        System.out.println(s.i);



    }
}

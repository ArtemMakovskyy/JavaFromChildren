package Shildt.StringText488;
//Сравнить методы lenqth() и capacity () из класса StringBuffer
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println( "бyфep = " + sb);
        System.out.println( "длина = " + sb.length());
        System.out.println( "eмкocть  = " + sb.capacity());
//        ensureCapacity (), чтобы установить емкость буфера p 490
//        setLength ()                p490

        System.out.println();
        System.out.println( "бyфep до = " + sb);
        System.out.println( "дo  вызова charAt(1) = " +  sb. charAt(1));

        sb. setCharAt(1,'i');
        sb.setLength(2);
        System.out.println("Бyфep после =  "+ sb);
        System.out.println("пocлe вызова charAt(1) = " + sb . charAt(1));


    }
}

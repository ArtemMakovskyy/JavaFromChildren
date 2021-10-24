package Shildt.Part17;

//Использовать метод arraycopy( )
class ACDemo {
    static <T>void show(T[] ar){
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("]");
    }
    static byte a[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
    static byte b[] = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77};

    static Integer i1[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
    static Integer i2[]= new Integer[i1.length];

    public static void main(String[] args) {
        System.out.println("a  =" + new String(a));
        System.out.println("b  =" + new String(b));
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println("a  =" + new String(a));
        System.out.println("b  =" + new String(b));
        System.arraycopy(a, 0, a, 1, a.length - 1);
        System.arraycopy(b, 1, b, 0, b.length - 1);
        System.out.println("a  =" + new String(a));
        System.out.println("b  =" + new String(b));

        System.arraycopy(i1,0,i2,0,i1.length);
        show(i1);
        show(i2);

        System.out . println(System.getProperty("user.dir"));
    }
}

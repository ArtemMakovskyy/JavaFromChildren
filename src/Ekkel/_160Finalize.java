package Ekkel;
class Book{
    boolean checkOut = false;

    public Book(boolean checkOut) {
        this.checkOut = checkOut;
    }
    void chekIn(){
      checkOut = false;
    }

    public void finalize(){
        if (checkOut)
            System.out.println("err chOut");

    }
}
public class _160Finalize {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.chekIn();
        new Book(true);
        System.gc();//очистка мусора
    }
}

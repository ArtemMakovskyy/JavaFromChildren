package Shildt.Exceptions;
class ExcTest1 extends Exception{
    int c;

    public ExcTest1(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "ExcTest1{" +
                "c=" + c +
                '}';
    }
}
public class TestCreateException {
    /**
     * 1) создаем класс с консруктором, полем и тyстрингом. Икстендим к супперклассу
     * 2) В главном классе создаем статический метод и бросаем на него исключение
     * 3) в мейне присваиваем значения
     */
static void exsMathod(int b){
    System.out.println("start " + b);
    try {
        if (b==0)throw new ExcTest1(b);
    } catch (ExcTest1 excTest1) {
        System.out.println("not equal 0");
        excTest1.printStackTrace();
    }
}


    public static void main(String[] args) {
    exsMathod(5);
    exsMathod(-5);
    exsMathod(0);

    }
}

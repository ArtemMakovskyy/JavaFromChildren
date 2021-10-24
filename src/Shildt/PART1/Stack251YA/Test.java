package Shildt.PART1.Stack251YA;

public class Test {
    public static void main(String[] args) {
//        Steck st1 = new Steck(10);
//        Steck st2 = new Steck(5);
///       Steck st3 = new Steck(15);

        Steck st1 = new Steck();
        Steck st2 = new Steck();
        Steck st3 = new Steck();

        st1.pushFunction(5);
        st1.popFunction();

        st2.pushFunction(11);
        st2.popFunction();

        st3.pushFunction(22);
        st3.popFunction();

    }
}
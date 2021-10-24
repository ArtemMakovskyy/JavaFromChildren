package Shildt.PART1.Stack250;

class IFTestЗ {
    public static void main(String[] args) {
        IntStack mystack; //создать переменную ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // загрузить динамический стек
        for( int i=0;   i<12;   i++)  mystack.push(i);

        mystack =  fs;//загрузить фиксированный стек
        for(int i=0;   i<8;  i++)  mystack.push(i);

        mystack =  ds ;
        System.out .print("Знaчeния в  динамическом стеке: ");
        for( int i=0;   i<12;  i++) System.out. print(mystack.pop () +", ");
        System.out.println();
        mystack =  fs ;
        System.out .print("Знaчeния в  динамическом стеке: ");
        for( int i=0;   i<8;  i++) System.out. print(mystack.pop () +", ");

    }
}

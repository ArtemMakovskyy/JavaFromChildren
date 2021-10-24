package Shildt.PART1.Stack250;
// Реализация интерфейса IntStack для  стека фиксированного размера
class FixedStack implements IntStack{
    private int stck[];
    private int tos;
    // выделить память и  инициализировать стек
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
        }
// разместить элемент в  стеке

    @Override
    public void push(int item) {
        if(tos == stck.length-1)// использовать поле длины стека
            System.out.println("Steck is full");
        else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos<0){
            System.out.println( "Cтeк не загружен.");
            return 0;
        }
        else
            return  stck[tos--];
    }
}

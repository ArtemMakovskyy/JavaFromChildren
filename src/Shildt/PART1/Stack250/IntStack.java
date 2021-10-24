package Shildt.PART1.Stack250;

interface IntStack {
    void push(int item); //сохранить элемент в  стеке
    int pop();           //извлечь элемент из стека
    default void clear(){
        System.out . println( "Meтoд  clear() не  реализован.");
    }
}

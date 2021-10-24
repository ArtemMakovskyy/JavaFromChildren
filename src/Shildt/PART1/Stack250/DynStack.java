package Shildt.PART1.Stack250;

public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    public DynStack(int size){
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        //если стек заполнен, выделить память под стек большего размера
        if(tos==stck.length-1){
            int temp[] = new int[stck.length+1];//удвоить размер стека
            for(int i=0; i<stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
else stck[++tos] = item;
    }

    @Override
    public int pop() {
        if(tos<0){
            System.out.println("Steck not loading");
            return 0;
        }
else  return stck[tos--];
    }
}

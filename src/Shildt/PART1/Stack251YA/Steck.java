package Shildt.PART1.Stack251YA;

public class Steck implements StFunction {
    private int steck[];
    int top = -1;
    Thread thread = Thread.currentThread();



//   Steck(int arrayLong){
//       steck = new int [arrayLong];
//    }

    public void push(int item){
        if(top == steck.length-1) System.out.print("st is full");
        else
        steck[++top] = item+1;
    }

    public int pop(){
        if(top<0){
            System.out.print("is empty");return 0;
        }
       return steck[top--];
    }
    public void pushFunction(int arrayLong){
        steck = new int [arrayLong];   // перенос длині стека
        for(int i = 0;i<steck.length;i++) push(i);
    }

    public void popFunction(){
        System.out.println();
        for(int i = 0;i<steck.length;i++) System.out.print( pop()+", ");
    }
}

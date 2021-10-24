package Shildt.PART1.S253PeremInter;

public class AskМe implements SharedConstants{
    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());


    }

     static void answer(int resilt){
        switch (resilt){
            case 0:
                System.out.println("NO");
                return;
            case 1:
                System.out.println("YAS");
                return;
            case MAYBE|2:
                System.out.println("MAYBE");
                return;
        }

    }
}

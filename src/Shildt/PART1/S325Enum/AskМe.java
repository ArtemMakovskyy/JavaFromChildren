package Shildt.PART1.S325Enum;

import java.util.Random;

class Question {
    Random random = new Random();

    Answers ask() {
        int prob = (int) (100 * random.nextDouble());
        if (prob < 15) return Answers.MAYBE;
        else if (prob < 30) return Answers.NO;
        else if (prob < 60) return Answers.YAS;
        else if (prob < 75) return Answers.LATER;
        else if (prob < 98) return Answers.SOON;
        else return Answers.NEVER;
    }
}

public class AskМe {
     static void answer(Answers result){
        switch (result){
            case NO:
                System.out.println("нет");
                break;
            case YAS:
                System.out.println("да");
                break;
            case LATER:
                System.out.println("позже");
                break;
            case SOON:
                System.out.println("вскоре");
                break;
            case NEVER:
                System.out.println("никогда");
                break;
            case MAYBE:
                System.out.println("может быть");
                break;
        }
    }


    public static void main(String[] args) {
Question q = new Question();
answer(q.ask());
answer(q.ask());
answer(q.ask());
answer(q.ask());
answer(q.ask());
answer(q.ask());

    }
}

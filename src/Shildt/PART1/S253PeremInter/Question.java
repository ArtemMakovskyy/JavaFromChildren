package Shildt.PART1.S253PeremInter;

import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 33) return NO;
        else if (prob < 66) return MAYBE;
        else return YAS;
    }
}

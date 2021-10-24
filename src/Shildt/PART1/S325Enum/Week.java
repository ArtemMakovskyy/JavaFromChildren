package Shildt.PART1.S325Enum;

public enum Week {
    Sunday(1), Monday(2), Tuesday(3), Wednesday(4),
    Thursday(5), Friday(6), Saturday(7), Noday;

    private int dey;

    Week(int dey){
        this.dey = dey;
    }

    Week(){
        dey = 0;
    }

    int numsDay(){
        return this.dey;
    }
}

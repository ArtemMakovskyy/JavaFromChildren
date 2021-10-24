package Shildt.PART2.S437;

class TWOD {
    int a, b;
    public TWOD(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
class Go<T extends Number> {
    T[] nums;

    public Go(T[] nums) {
        this.nums = nums;
    }
    double calc() {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum;
    }
    void prn() {
        System.out.println(calc());
    }
    void prnUnderArrey(){
    }
}

 class ЕTest1 {
    public static void main(String[] args) {
        Integer[] inaums = {1, 2, 3, 4, 5};
        Integer[] inaums2 = {1, 2, 3, 4, 5};

        Go<Integer> i1 = new Go<>(inaums);

/////////////////////////////////////////
        TWOD[] td1 = {
                new TWOD(1, 2),
                new TWOD(1, 2),};

        TWOD[] td2 = new TWOD[3];
        td2[0] = new TWOD(4, 5);
        td2[1] = new TWOD(8, 7);
        td2[2] = new TWOD(9, 7);
//        Go<Integer> in3 = new Go<Integer>(td2);

        for (int i = 0; i < td2.length; i++) {
            System.out.println(td2[i].a+"/"+td2[i].b);
        }
       int aa = td2[0].a;
       int ab = td2[0].b;
        for (int i = 0; i < td1.length; i++) {
        }
    }
}

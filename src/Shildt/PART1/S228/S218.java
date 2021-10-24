package Shildt.PART1.S228;

class AA{
    int i;
}

class BB extends AA{
    int i;
    BB(int a, int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i AA          = "+ super.i);
        System.out.println("i v podklasse = " + i);
    }
}

public class S218 {
    public static void main(String[] args) {
        BB subOb = new BB(1,2);
        subOb.show();
    }
}

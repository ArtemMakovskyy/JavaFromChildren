package Shildt.PART1.Stack250;

public class IFТest {
    public static void main(String[] args) {
        FixedStack ms1 = new FixedStack(5);

        //разместить числа в  стеке
        for (int i = 0; i < 5; i++) ms1.push(i);

        // извлечь эти числа из стека
        System.out.print("Cтeк в  mystackl: ");
        for (int i = 0; i < 5; i++) System.out.print(ms1.pop()+", ");

        System.out.println();

    }
}

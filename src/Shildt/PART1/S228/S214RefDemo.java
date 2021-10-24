package Shildt.PART1.S228;

public class S214RefDemo {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3 = new BoxWeight();// по умолчанию
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем 1 равен "+ vol);
        System.out.println("Вес 1 равен "+ mybox1.weight);


        vol = mybox2.volume();
        System.out.println("Объем 2 равен "+ vol);
        System.out.println("Вес 2 равен "+ mybox2.weight);


        vol = mybox3.volume();
        System.out.println("Объем 3 равен "+ vol);
        System.out.println("Вес 3 равен "+ mybox3.weight);


        vol = myclone.volume();
        System.out.println("Объем myclone равен "+ vol);
        System.out.println("Вес 3 равен "+ myclone.weight);


        vol = mycube.volume();
        System.out.println("Объем mycube равен "+ vol);
        System.out.println("Вес 3 равен "+ mycube.weight);

    }
}

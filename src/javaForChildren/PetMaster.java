package javaForChildren;

public class PetMaster {
    public static void main(String[] args) {

        Pet myPet = new Pet();
        String govorilka;
        govorilka = myPet.say("исходящий текст ГОВОР ");
        System.out.println(govorilka);

        myPet.eat();
        myPet.sleep();
        myPet.rost();


//        String petReaction;
        //      javaForChildren.Pet myPet = new javaForChildren.Pet();
        //    petReaction = myPet.say("Чик!! Чирик!!");
        //  System.out.println(petReaction);
    }
}

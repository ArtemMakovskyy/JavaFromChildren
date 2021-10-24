package javaForChildren;

public class Game2 {
    public static void main(String[] args) {

        String players[] = {"Sasha", "MAsha", "Dasha", "Kostya","Vasya"};

        int counter=0;

        while (counter < players.length){
            if (counter>2) break;
            System.out.println("congrat "+players[counter]);
            counter++;

        }

    }
}


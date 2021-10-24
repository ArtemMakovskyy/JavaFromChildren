package javaForChildren;

class Gamres {


    int arreysA[] = new int[2];
    String players[] = new String[4];

    String winNer = "Победитель - ";
    int w;

    String p ,u, r ,s;
    int count=0;


    Gamres(String l, String m, String n, String o, int win){
        p=l; u = m; r = n; s= o;
        players[0]=p;
        players[1]=u;
        players[2]=r;
        players[3]=s;
        w=win;
    }
    void listGamers(){
//        String list = p+"\n"+u+"\n"+r+"\n"+s;
//        System.out.println(list);
        for(int i =0; i< players.length;i++){
            System.out.println("Position - "+(i+1)+". Name is "+players[i]);
        ++count;}
        System.out.println("Toutal gamers - "+ count);
    }
    void winner(int win){
        w=win;
        System.out.println(winNer + players[w]+". УРРРРА!!!");
    }
    void congratulation(){
        for(int i = 0; i< players.length;i++)
            System.out.println(players[i]+" congtatulation");
    }
    void playersWhile(){
        count=0;
        int toutPl = players.length;
        String thePlayers = null;
        while(count< toutPl){
            thePlayers = players[count];}
            System.out.println(thePlayers);
        count++;
    }


}

public class Game {
    public static void main(String[] args) {
        Gamres gamers = new Gamres("Sasha", "Masha", "Dasha", "Vanya",1);
        gamers.listGamers();
        System.out.println();
        gamers.congratulation();
        gamers.winner(gamers.w);
        System.out.println();
//        gamers.playersWhile();

        int totalPlayers = gamers.players.length;
        int counter = -1;

        while ((counter+1)<totalPlayers)
            counter++;
            String thePlayer = gamers.players[counter];
        System.out.println(thePlayer);

    }
}

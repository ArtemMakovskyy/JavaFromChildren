package Shildt.PART1.S247;

 class AnotherClient implements Callback{
     public void callback(int p){
         System.out.println( "Eщe один вариант метода callback()");
         System.out.println("p  в квадрате равно"  + (p*p));

     }
}

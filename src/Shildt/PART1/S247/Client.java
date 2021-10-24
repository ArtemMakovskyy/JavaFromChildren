package Shildt.PART1.S247;

class Client implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("Метод  callback(), вызываеNЫЙ  со значением"  + p);
    }
    void nonInfaceMeth(){
        System.out.println("dif");
    }
}

//package LessonsJava.Tread;
////https://www.youtube.com/watch?v=s032s29-NUU
//import javax.naming.InsufficientResourcesException;
//
//public class Operations {
//    static void transfer(
//            Account acc1, Account acc2, int amount
//    ) throws InsufficientResourcesException{
//        if(acc1.getBalance()< amount) throw new InsufficientResourcesException();
//        acc1.withdraw(amount);
//        acc2.deposit(amount);
//    }
//    public static void main(String[] args) {
//        final Account a = new Account(1000);
//        final Account b = new Account(2000);
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    transfer(a,b,500);
//                } catch (InsufficientResourcesException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    transfer(b, a, 300);
//                } catch (InsufficientResourcesException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//    }
//}

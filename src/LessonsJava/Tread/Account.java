package LessonsJava.Tread;
//https://www.youtube.com/watch?v=s032s29-NUU
public class Account {
    private  int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    public void deposit(int amount){
        balance += amount;
    }

    public boolean getBalance() {
        return true;
    }
}

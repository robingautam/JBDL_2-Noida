package abstraction;

public abstract class Bank {

    public  void add(double amnt){
        System.out.println("Some implementation");
    }
    public abstract int loanInterest();
}

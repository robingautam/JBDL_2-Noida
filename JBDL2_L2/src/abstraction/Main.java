package abstraction;

public class Main {

    public void calculateInterest(ICICI b){
        System.out.println( b.loanInterest());
    }
    public static void main(String[] args) {
        Main m = new Main();
        ICICI bank = new ICICI();
        m.calculateInterest(bank);
        bank.add(23.8);
    }
}

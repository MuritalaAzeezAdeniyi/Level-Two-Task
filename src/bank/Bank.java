package bank;

public class Bank {
    private String name;
    private double balance;

    public Bank(String name) {
        this.name = name;
        this.balance = 0.0;

    }
    public void deposit(double amount) {
        if(amount > 0){
            this.balance += amount;
            System.out.println(this.name + " deposit $" + amount+"and balance $" + this.balance);
        }
        else {
            System.out.println(this.name + " can't deposit $0.");
        }
    }
      public void withdraw(double amount) {
        if(amount <= 0){
            System.out.println(this.name + " can't withdraw positive amount");
        }
        else if(amount > this.balance){
            System.out.println("Insufficient balance");
        }
        else {
            this.balance -= amount;
            System.out.println("Withdraw $" + amount);
        }
      }

      public void checkBalance(){
        System.out.println(this.name + " balance $" + this.balance);
      }
}

public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountID, String password) {
    this.accountID = accountID;
    this.password = password;
  }

  public double getBalance(){
    return balance;
  }
  
  public int getID() {
    return accountID;
  }
}
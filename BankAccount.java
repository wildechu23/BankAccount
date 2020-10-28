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

  public void setPassword(String password) {
    this.password = password;
  }
  
  public boolean deposit(double amount) {
    if(amount >= 0) {
      balance += amount;
      return true;
    } else {
      return false;
    }
  }
}
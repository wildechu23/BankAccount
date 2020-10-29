public class Tester {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(4631, "hellopotato");
    System.out.println(bankAccount.deposit(-3.5));
    System.out.println(bankAccount.deposit(3.5));
    System.out.println(bankAccount.withdraw(5));
    System.out.println(bankAccount.withdraw(-5));
    System.out.println(bankAccount.withdraw(2));

    System.out.println(bankAccount.toString());
    System.out.println(bankAccount.getAccountID());
    System.out.println(bankAccount.getBalance());
    bankAccount.setPassword("goodbyepotato");
  }
}

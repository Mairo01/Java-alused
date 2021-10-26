package Week4.Ex77;

public class LyyraCard {
  private double balanceLimit = 10000;
  private double balance;

  public LyyraCard(double balanceAtStart) {
    this.balance = balanceAtStart;
  }

  public String toString() {
    return Double.toString(this.balance);
  }

  public void payEconomical() {
    double payAmount = 25;

    if (this.balance <= payAmount) return;

    this.balance -= 25;
  }

  public void payGourmet() {
    double payAmount = 40;

    if (this.balance <= payAmount) return;

    this.balance -= 40;
  }

  public void loadMoney(double amount) {
    double newBalance = this.balance + amount;

    if (newBalance > this.balanceLimit || amount < 0) {
      this.balance = this.balanceLimit;
      return;
    }

    this.balance = newBalance;
  }
    
}

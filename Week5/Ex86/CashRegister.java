package Week5.Ex86;

public class CashRegister {
  private double cashInRegister;
  private int economicalsSold;
  private int gourmetsSold;

  public CashRegister() {
    this.cashInRegister = 1000;
  }

  public void loadMoney(double amount) {
    this.cashInRegister += amount;
  }

  public double payEconomical(double cashGiven) {
    double lunchPrice = 2.5;
    double cashReturned;
    if (cashGiven < lunchPrice) return cashGiven;

    this.cashInRegister += lunchPrice;
    this.economicalsSold++;
    cashReturned = cashGiven - lunchPrice;

    return cashReturned;
  }

  public double payGourmet(double cashGiven) {
    double lunchPrice = 4;
    double cashReturned;
    if (cashGiven < lunchPrice) return cashGiven;

    this.cashInRegister += lunchPrice;
    this.gourmetsSold++;
    cashReturned = cashGiven - lunchPrice;

    return cashReturned;
  }

  public String toString() {
    return 
    "Money in register " + cashInRegister + 
    " economical lunches sold: " + economicalsSold + 
    " gourmet lunches sold: " + gourmetsSold;
  }
}

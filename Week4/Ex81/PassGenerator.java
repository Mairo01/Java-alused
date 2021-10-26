package Week4.Ex81;

public class PassGenerator {
  private int passLength;

  public PassGenerator(int length) {
    this.passLength = length;
  }

  public String createPassword() {
    String password = "";
    char[] symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".toCharArray();

    for (int i = 0; i < this.passLength; i++) {
      int randomNumber = (int)(Math.random() * (symbols.length - 1));
      password += symbols[randomNumber];
    }
    return password;
  }

}

// Define package name
package bank;

// Account class in the bank package
class Account {
  public String name; // Accessible from anywhere
  protected String email; // Accessible within the package and by subclasses
  private String password; // Accessible only within this class

  // Getter and Setter for private variable `password`
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void printInfo(String name) {
    this.name = name;
    System.out.println("Account Holder: " + this.name);
  }
}

// Main class to test Account
public class Bank {
  public static void main(String args[]) {
    Account acct1 = new Account();
    acct1.name = "Shraddha Khapra";
    acct1.printInfo(acct1.name);

    // Since password is private, use setter
    acct1.setPassword("abc123");

    // To retrieve it (for example)
    System.out.println("Password: " + acct1.getPassword());
  }
}

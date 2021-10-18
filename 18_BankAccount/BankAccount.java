/*
Hugo Jenkins
APCS
HW 18 -- CPA-One
2021-10-17
*/
/*
Disco:
I didn't fully understand what private and public meant but this assignment
cleared it up. 
QCC:
Is there a better way to get around variables having the same name than just
naming them different names?
What is the point of instance variable being private if their only use it to
be accessed and used by an outside source?
Is there a way to interact with a java fil without having to write a full java
code? e.g. through terminal
*/

public class BankAccount {
public String name="";
private String password="";
private int pin=1;
public int accountNumber=1;
private double accountBalance=1;
public void setInfo(String newName, String newPassword, int newPin,
String oldPassword, int oldPin){
if (oldPassword==password&&oldPin==pin){
name = newName;
pin = newPin;
password = newPassword;
}
}

public void printInfo(String pass, int pinn){
if (pass==password&&pinn==pin){
System.out.println("name:"+name+" password:"+password+" pin:"+pin+" accNum:"+accountNumber+" balance:"+accountBalance);
}
}

public void deposit(double amt){
accountBalance += amt;
}

public void withdraw(String pass, int pinn, double amt){
if (pass==password&&pinn==pin&&accountBalance >= amt){
accountBalance -= amt;
}
}

public static void main(String[] args){
BankAccount richard = new BankAccount();
richard.setInfo("richard","richard",2,"",1);
richard.deposit(1);
richard.printInfo("richard",2);
richard.withdraw("richard",2,1);
}
}

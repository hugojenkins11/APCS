//HPN- Hugo Jenkins, Boary, Nada Hameed, Ray, Prattay Dey, Winnie
//APCS
//HW14-- Customize Your Creation
//2021-10-07: Customize Your Creation
public class BigSib {
  String helloMsg;
  public BigSib(){
    helloMsg = "Howdy";
  }
  public String greet(String n){
    return(helloMsg +' '+ n);
  }
}
/*
Disco:
Single quotations can only take a single character in java.
A contructor with no params still run and can be useful in many cases.
The difference between the Greet files is that one of them takes an argument
while creating the new instance of BigSib
QCC:
Can a constructor take multiple arguments, an array of arguments?
What other parameters could we include to make the code more efficient?
*/

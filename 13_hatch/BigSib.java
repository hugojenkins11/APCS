//NHS- Hugo Jenkins, Boary, Nada
//APCS
//HW13-- Where do BigSibs Come From?
//2021-10-06: Where do BigSibs Come From?
public class BigSib {
  String helloMsg;
  public BigSib(String n){
    helloMsg = n;
  }
  public String greet(String n){
    return(helloMsg +' '+ n);
  }
}
/*QCC:
Can you make contstructors which run whenever you try
to use a method? Just like this consructor runs when you
make a new isntance of the class?
Is there a way to make it that you don't have to make an
instance variable in the beginning of the class?
Can you have more than one contructor?
Can just creating a new object give an output?
DISCO:
The argument that you put for the class when creating
it is used as the argument for the first constructor

*/

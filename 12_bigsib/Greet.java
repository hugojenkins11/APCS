//KHB- Hugo Jenkins, Boary
//APCS
//HW12-- Refactor Big Sib One
//2021-10-05: On Elder Individuality and the Elimination of Radio Fuzz
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib neil = new BigSib();
    neil.setHelloMsg("Salutations");

    greeting = neil.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib bob = new BigSib();
    bob.setHelloMsg("Hey ya");

    greeting = bob.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib sophie = new BigSib();
    sophie.setHelloMsg("Sup");

    greeting = sophie.greet("mom");
    System.out.println(greeting);
  }
}
/*QCC:
If you can compile a .java file into a .class file, can you 'decompile' a
.class file into a .java file?
is there any limit to how long the chain of calling different files can go on?
DISCO:
You do not use static when using an instance variable
You can make mulitple 'new's of a class
*/

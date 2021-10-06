//NHS- Hugo Jenkins, Boary, Nada
//APCS
//HW13-- Where do BigSibs Come From?
//2021-10-06: Where do BigSibs Come From?
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib neil = new BigSib("Salutations");

    greeting = neil.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib bob = new BigSib("Hey ya");

    greeting = bob.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib sophie = new BigSib("Sup");

    greeting = sophie.greet("mom");
    System.out.println(greeting);
  }
}

public class Greet {
  public static void  main(String[] args) {
    System.out.println(greet());
  }
    public static String greet() {
      String[] names = {"Shiny", "Tiny", "Don"};
      String pencil = names[(int) Math.floor(3.0 * Math.random())];
      return("Howdy, " + pencil);
  }
}

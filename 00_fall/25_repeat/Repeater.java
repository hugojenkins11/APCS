/**
Jomin Zhang + Hugo Jenkins
APCS
HW#25 - Do I need to repeat myself?
2021/10/26
Time spent - 0.6 hours
Disco
- Recursion relies on a reduction case that will eventually lead back to the base case. The base case needs to return a concrete value that the rest of the function will use.
- A counter needs to be implemented with the while loop so that the program knows when to exit the loop.

QCC

**/
public class Repeater{
  String fence;
  // Assuming numPosts is a integer >= 1
  public static String fenceW (int numPosts){
    int counter = 1;
    String fence = "|";
    while (counter < numPosts){
      fence += "--|";
      counter += 1;
    }
    return fence;
  }
  public static String fenceR (int numPosts){
    if (numPosts == 1){
      return "|";
    }
    else {
      return fenceR(numPosts - 1) + "--|";
    }
  }
  public static void main(String[] args){
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceW(5));
    System.out.println(fenceR(1));
    System.out.println(fenceR(2));
    System.out.println(fenceR(5));
  }
}

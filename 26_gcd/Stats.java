public class Stats{
  public static void main(String[] args){

  }
  public static int gcd(int a, int b){
    if (a > b){
      int c = a;
    }
    else{
      int c = b;
    }
    int i = c;
    while (i > 0){
      
    }
  }
  public static int gcdER(int a, int b){
    if (a == b){
      return a;
    }
    else{
      if (a > b){
        return(gcd(a-b,b));
      }
      else{
        return(gcd(a,b-a));
      }
    }
  }
  public static int gcdEW(int a, int b){
    while (a != b){
      if (a > b){
        a = a -b;
      }
      else{
        b = b - a;
      }
    }
    return a;
  }
}

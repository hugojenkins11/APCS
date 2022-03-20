/*
JPH- Jacob Kirmayer, Prattay Dey, Hugo Jenkins
APCS
HW26 -- GCD Three Ways
2021-10-27
time spent: 0.75 hours
*/
/*
DISCO:
There are many ways to code the same thing, all of which are correct
QCC:
How do we know which is the best code for the job?
Which takes the computer the least computations?
ALGO:
For both GCDER and GCDEW, we work on working a and b down to the same number by using the rule thatthe GCD of 2 numbers remains the same if the larger number is replaced by its difference with the smaller number.
*/

public class Stats{
  public static int mean(int a, int b) {
    return (a + b)/2;
  }

  public static double mean(double a, double b) {
    return (a + b)/2;
  }

  public static int max(int a, int b) {
    if (a>b){return a;}else {return b;}
  }

  public static double max(double a, double b) {
    if (a>b){return a;}else {return b;}
  }

  public static int geoMean(int a, int b) {
    return (int) Math.sqrt(a*b);
  }

  public static double geoMean(double a, double b) {
    return Math.sqrt(a*b);
  }

  public static int max(int a, int b, int c) {
    int maximum = a;
    if (b>maximum){
      maximum = b;
    }
    if (c>maximum){
      maximum = c;
    }

    return maximum;
  }

  public static double max(double a, double b, double c) {
    double maximum = a;
    if (b>maximum){
      maximum = b;
    }
    if (c>maximum){
      maximum = c;
    }

    return maximum;
  }

  public static int geoMean(int a, int b, int c) {
    double product = (a*b*c);
    double res =  Math.cbrt(product);
    return (int) res ;
  }

  public static double geoMean(double a, double b, double c) {
    return Math.cbrt(a*b*c);
  }

  public static void main(String[] args){
    System.out.println(gcd(81,27) == gcdER(81,27) && gcdER(81,27) == gcdEW(81,27));//Should all return the same integer
    System.out.println(gcd(65,39));//Should be 13
    System.out.println(gcdER(65,39));//Should be 13
    System.out.println(gcdEW(65,39));//Should be 13
  }
  public static int gcd(int a, int b){
    int upperBound;
      if (a < b){
        upperBound = a;
      }
      else{
        upperBound = b;
      }
      while (!(a%upperBound==0&&b%upperBound==0)){
        upperBound--;
      }
      return upperBound;
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

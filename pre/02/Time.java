public class Time{
public static void main(String[] args){
double hour1 = 22.0;
double minute1 = 42.0;
double second1 = 45.0;
System.out.print("Number of seconds since midnight: ");
System.out.println((hour1 * 60 + minute1) * 60 + second1);
System.out.print("Percentage of day that has passed: ");
System.out.println((((hour1 * 60 + minute1) * 60 + second1) * 100) / (24 * 60 * 60));
double hour2 = 22.0;
double minute2 = 48.0;
double second2 = 23.0;
System.out.print("Seconds that have passed since I started working on this: ");
System.out.println(((hour2 * 60 + minute2) * 60 + second2) - ((hour1 * 60 + minute1) * 60 + second1));
}
}
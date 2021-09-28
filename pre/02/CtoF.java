import java.util.Scanner;
public class CtoF {
public static void main(String[] args) {
String line;
Scanner in = new Scanner(System.in);
System.out.print("What is the temperature in celsius?");
double celsius = in.nextDouble();
System.out.print("The temperature in farenheit is ");
System.out.println((celsius * 1.8) + 32);
}
}
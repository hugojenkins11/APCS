import java.util.Scanner;
public class isTriangle {
public static void check(int a, int b, int c) {
System.out.println(a + b > c && a + c > b && b + c > a);
}
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();
check(a,b,c);
}
}
import java.util.Scanner;
public class Ack {
public static int func(int m,int n) {
int ph;
int ans = 0;
if (m == 0) {
ans = n + 1;
} else if (m > 0 && n == 0) {
func(m-1,1);
} else {
ph = func(m,n-1);
func(m-1,ph);
}
return ans;
}
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int m = in.nextInt();
int n = in.nextInt();
System.out.println(func(m,n));
}
}
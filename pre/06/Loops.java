import java.util.Scanner;
public class Loops {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("what is the value of x? ");
double x = in.nextDouble();
System.out.print("what is the value of n? ");
int n = in.nextInt();
System.out.println(three(x,n));
System.out.print("what is the value of u? ");
int u = in.nextInt();
System.out.println(four(u));
System.out.print("what is the value of w? ");
double w = in.nextDouble();
System.out.print("what is the value of r? ");
int r = in.nextInt();
System.out.println(myexp(w,r));
System.out.println("All done");
}


public static double myexp(double w, int r) {
double ans = 1;
double prev = 1;
int i = r - 1;
int denom = 1;
while (i > 0) {
ans += prev * (w / denom);
prev = prev * (w / denom);
i -= 1;
denom += 1;
}
return ans;
}


public static int four(int u) {
int ans = u;
int i = u - 1;
while (i > 0) {
ans = ans * i;
i = i - 1;
}
return ans;
}


public static double three(double x, int n) {
int i = n;
double ans = x;
if (n == 0) {
return 1;
}
while (n > 1) {
ans = ans * x;
n = n - 1;
}
return ans;
}

}
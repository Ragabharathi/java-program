input
27
84
output
12 15

code
import java.util.*;
public class Hello{
  public static void(String[] args){
    Scanner sc =new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int a=y/2-x;
    System.out.print(x-a+" ");
    System.out.print(a);
  }
}

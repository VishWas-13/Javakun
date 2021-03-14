import java.util.*;
public class Factorial_using_recursion {
    public static int fact(int x){
        if(x==0)
            return 1;
        else
            return (x*(fact(x-1)));

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num,facto;
        System.out.print("Enter any integer: ");
        num=sc.nextInt();
        facto = fact(num);
        System.out.print("Factorial of "+num+" is: "+facto);
    }
}

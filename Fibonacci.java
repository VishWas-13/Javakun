import java.util.*;
public class Fibonacci_Series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1=0, num2=1, num3, count;
        System.out.print("Enter the number till you want to print the fibonacci series: ");
        count = sc.nextInt();
        System.out.print(num1+" "+num2);
        for (int i=0;i<=count;i++){
            num3= num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(" "+num3);
        }

    }
}

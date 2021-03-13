//Use suitable datatype as per question.
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number, fact=1;
        System.out.print("Enter any number: ");
        number = sc.nextInt();
        for(int i=number;i>=1;i--){
            fact *= i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

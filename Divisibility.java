//Java program to check divisiblity using switch case.
import java.util.*;
public class Divisibility_by_11_using_Switch_Case {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter any integer: ");
        number = sc.nextInt();
        switch (number%11){
            case 0:
                System.out.println(number+" is divisible by 11.");
                break;
            default:
                System.out.println(number+" is not divisible by 11.");
                break;
        }
    }
}

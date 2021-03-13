/*program to print pattern

    1
    12
    123
    1234
*/

import java.util.*;
public class Pattern_numerical {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter the number till you want to print the pattern: ");
        num=sc.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

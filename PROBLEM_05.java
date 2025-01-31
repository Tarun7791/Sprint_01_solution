/*Write a program to generate the Fibonacci series up to a
given number.
 Example:
 Input: limit = 10
 Output: [0, 1, 1, 2, 3, 5, 8] */

package Sprint_01;

import java.util.Scanner;

public class PROBLEM_05 {

    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int limit;
        System.out.println("Enter the limit ");
        limit=kb.nextInt();

        int i,n1=0,n2=1,n3;
        System.out.print(n1+" "+n2); //printing 0 and 1

        for (i=2;i<limit;++i){ //loop starts from 2 because 0 and 1 are already printed
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }














    }











}

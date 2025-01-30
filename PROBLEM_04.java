/* Write a program to check if a number is an Armstrong Number.
 Example:
 Input: number = 153
 Output: Armstrong Number
 Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 =
 153.
*/
package Sprint_01_solutions;

import java.util.Scanner;

public class PROBLEM_04 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int num;
        num=kb.nextInt();

    int original=num;
    int sum=0;
    int digits= String.valueOf(num).length();

    while(num>0){
        int digit=num%10; // Get the last digit
        sum += Math.pow(digit, digits); // Add digit^digits to sum
        num /= 10; // remove the last digit
    }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }



    }
}

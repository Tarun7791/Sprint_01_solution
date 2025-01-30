// Write a program to check if a given year is a leap year

package Sprint_01_solutions;

import java.util.Scanner;

public class PROBLEM_03 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int year;
        System.out.println("Enter the number");
        year = kb.nextInt();

    if(year%400==0) {
        System.out.println("It is a leap year");
    }
    else if (year%100==0){
            System.out.println("It is not a leap year");
        }
    else if(year%4==0){
        System.out.println("It is a leap year");
    }

    else {
        System.out.println("It is not a leap year");
    }

    }
}

/* Easy Way to Remember:
Think of ₹400 as a jackpot → Leap Year 💰✅
If you only have ₹100 → No Leap Year ❌
If you have ₹4 but not ₹100 → Leap Year 🎉✅
If you have neither ₹4 nor ₹100 → No Leap Year 🚫❌ */
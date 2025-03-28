package Sprint_01;

import java.util.Scanner;

class PROBLEM_05{

    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=kb.nextInt();

        int a=0;
        int b=1;
        System.out.print(a+""+b);
        int c;

        for (int i=1;i<=num;i++){
            c=a+b;
            System.out.print(c);
            a=b;
            b=c;

        }












    }






}
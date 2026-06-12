/*import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args){

        Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = sc.nextInt();



        if(num1 > num2 && num1 > num3){
            System.out.println(num1+ " is greater than " + num2 + " and " +num3);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2+ " is greater than "+ num1 + " and " + num3);
        }
        else if(num3 > num2){
            System.out.println(num3+ " is greater than "+ num1 + " and " + num2);
        }
        else{
            System.out.println("All numbers are equal.");
        }

        sc.close();

    }
}
*/









//---------------------------------WAP to find the greatest of three numbers (using nested if)------------------------//

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Greatest number = " + a);
            } else {
                System.out.println("Greatest number = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest number = " + b);
            } else {
                System.out.println("Greatest number = " + c);
            }
        }
        sc.close();
    }
}


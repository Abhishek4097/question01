package com.answer;

import java.util.Scanner;

// Palindrome or Not
public class Palendrome {
    static boolean check(int n) {
        int num1 = n;
        int rev = 0;
        while (num1 > 0) {
            rev += num1 % 10;
            rev *= 10;
            num1 = num1 / 10;
        }
        rev = rev / 10;
        return n == rev;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        if (check(num))
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome");
    }
}
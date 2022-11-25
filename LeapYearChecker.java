package com.bridgelabz.day1;
import  java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year greater than 1582 to check leap year: ");
        int year = sc.nextInt();
        if (((year % 4 == 0) && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Leap year:" +year);
            } else{
                    System.out.println("Not a Leap year:" +year);

            }
        }
    }

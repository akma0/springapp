package kz.iitu.spring;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome!");
    System.out.println("Please enter your account number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Enter your pin: ");
        int pin = in.nextInt();
        System.out.println("Your pin is correct!");


        System.out.println("Main menu");
        System.out.println("1-View my balance");
        System.out.println("2-Withdraw cash");
        System.out.println("3-Deposit funds");
        System.out.println("4-Exit");
        System.out.println("Enter a choice ");
        int ch = in.nextInt();
        switch(ch) {
            case 1:
                System.out.println("Your balance is: 293500tg");
                break;
            case 2:
                System.out.println("Your balance is: 293500tg");
                System.out.println("Please enter the amount to withdraw: ");
                int draw = in.nextInt();
                int result = 293500 - draw;
                System.out.println("Your balance is: "+result+"tg");
                break;
            case 3:
                System.out.println("FD Operation");
                System.out.println("Your balance is: 293500tg");
                System.out.println("Please enter your principal amount: ");
                int prin = in.nextInt();
                System.out.println("Please enter Interest rate: ");
                int rate = in.nextInt();
                System.out.println("Please enter years: ");
                int year = in.nextInt();
                System.out.println("Please enter frequency amount: ");
                int freq = in.nextInt();
                int res = prin*(1+rate/freq)^year*freq;
                System.out.println("The maturity amount is "+res);
                break;
            case 4:
                System.out.println("Operation is completed!");
                break;
            default:
               
        }

    }
}

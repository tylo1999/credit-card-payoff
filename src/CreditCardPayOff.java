/*
* CreditCarPayOff.java
* Author: Anthony Logan Bryant
* Submission Date: 9/6/2017
*
* This program takes a principal balance, annual interest rate, and monthly payment from the user.
* It then takes that information to calculate the minimum number of months it will take to pay that 
* principal off. Also its calculates the total amount of interest you paid and adds that on to the principal 
* balance to give you the total amount that you paid. If you spent any extra, it will calculate that and 
* print that amount that you over-paid
* 
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

import java.util.Scanner;

public class CreditCardPayOff {
 
	public static void main(String [] args) {
	 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Principal: ");
		double principal = keyboard.nextDouble();
		System.out.println("Annual Interest Rate: ");
		double annualInterestRate = keyboard.nextDouble();
		System.out.println("Monthly Payment: ");
		double monthlyPayment = keyboard.nextDouble();
		
		double monthsNeededToPayOff1 = Math.log(monthlyPayment) - Math.log(monthlyPayment - ((annualInterestRate/1200.0) * principal));  
		double monthsNeededToPayOff2 = Math.log((annualInterestRate/1200.0) + 1.0);	
		double monthsNeededToPayOff = monthsNeededToPayOff1/monthsNeededToPayOff2;
		double roundedMonthsToPayOff = Math.ceil(monthsNeededToPayOff);
		int finalMonths = (int)roundedMonthsToPayOff;
		double totalAmountPaid = roundedMonthsToPayOff * monthlyPayment;
		double totalInterestPaid = totalAmountPaid - principal;		
		double overpayment = (roundedMonthsToPayOff * monthlyPayment)- (monthsNeededToPayOff * monthlyPayment);
		
		System.out.println("Principal:  \t\t\t "+ principal);
		System.out.println("Annual Interest Rate (%): \t "+ annualInterestRate);
		System.out.println("Monthly Payment:  \t\t "+ monthlyPayment);
		System.out.println(" ");
		System.out.println("Months Needed To Pay Off:  \t "+ finalMonths);
		System.out.printf("Total Amount Paid: \t\t $%1.2f", totalAmountPaid);
		System.out.println(" ");
		System.out.printf("Total Interest Paid: \t\t $%1.2f", totalInterestPaid);
		System.out.println(" ");
		System.out.printf("Overpayment:  \t\t\t $%1.2f", overpayment);
	}
	
}

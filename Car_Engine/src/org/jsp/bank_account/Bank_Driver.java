package org.jsp.bank_account;

import java.util.Scanner;

public class Bank_Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your bank name");
		String bname = sc.nextLine();
		System.out.println("enter your location");
		String loc = sc.nextLine();
		System.out.println("enter your ifsc code");
		String ifsc_code = sc.nextLine();
		System.out.println("enter your micr code");
		int micr_code = sc.nextInt();

		System.out.println("=========================================");

		Bank bank = new Bank("union_bank", "thane", "UNIN39435BN3", 59587358);
//		System.out.println(bank);
//		System.out.println(bank.account);
//		bank.bankDetails();
//		bank.createAccount(new Account("pavan", "12/03/1999", "1234", 4000, 1234));
//		bank.bankDetails();
//		bank.createAccount(new Account("sachin", "12/03/2003", "1234", 5000, 12345));
//		bank.bankDetails();
//		System.out.println("=========================================");
//		bank.deposite(1234, 500);
//		bank.bankDetails();
//		System.out.println("======================================");
//		bank.withdraw(1234, 4500);
//		bank.bankDetails();
//		bank.deleteAccount();
//		bank.bankDetails();

		boolean option = true;
		Scanner s = new Scanner(System.in);

		System.out.println("Select Your Option");
		System.out.println("1.Create Your Account");
		System.out.println("2.Check your Account Details");
		System.out.println("3.Deposit Your Money");
		System.out.println("4.Withdraw Your Money ");
		System.out.println("5.Delete Your Account");
		System.out.println("6.EXIT");

		while (option) {
			System.out.println("enter your option");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter your Details");
				System.out.println("Enter Your Name");
				String account_holder_name = sc.nextLine();
				sc.next();
				System.out.println("Enter Your Date Of Birth");
				String dob = sc.nextLine();
				sc.next();
				System.out.println("Enter Your PIN");
				String pin = sc.nextLine();
				sc.next();
				System.out.println("Enter Your Amount");
				double money = sc.nextDouble();
				System.out.println("Enter Your Account Number");
				long account_number = sc.nextLong();
				bank.createAccount(new Account(account_holder_name, dob, pin, money, account_number));
				break;

			case 2:
				System.out.println("check your bank Details");
				bank.bankDetails();
				break;
			case 3:
				System.out.println("Deposit Your Money");
				System.out.println("Enter your Account Number");
				account_number = sc.nextLong();
				System.out.println("Enter your Amount");
				money = sc.nextDouble();
				bank.deposite(account_number, money);

				break;
			case 4:
				System.out.println("Withdraw Your Money");
				System.out.println("Enter your Account Number");
				account_number = sc.nextLong();
				System.out.println("Enter your Amount");
				money = sc.nextDouble();
				bank.withdraw(account_number, money);

				break;
			case 5:
				bank.deleteAccount();
				System.out.println("Account Deleted");

				break;
			case 6:
				option = false;
				System.out.println("Exit");

				break;

			default:
				System.out.println("invalid input");

			}
		}
	}

}

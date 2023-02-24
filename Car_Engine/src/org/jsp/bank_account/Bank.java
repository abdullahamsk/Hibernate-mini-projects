package org.jsp.bank_account;

import java.util.Scanner;

public class Bank {
	String bname;
	String loc;
	String ifsc_code;
	int micr_code;

	Account account;

	public Bank(String bname, String loc, String ifsc_code, int micr_code) {
		this.bname = bname;
		this.loc = loc;
		this.ifsc_code = ifsc_code;
		this.micr_code = micr_code;
	}

	public void bankDetails() {
		System.out.println(bname);
		System.out.println(loc);
		System.out.println(ifsc_code);
		System.out.println(micr_code);

		if (account != null) {
			System.out.println(account.account_holder_name);
			System.out.println(account.dob);
			System.out.println(account.pin);
			System.out.println(account.money);
		} else {
			System.out.println("To check details open account first");
		}
	}
//   public void createAccount(String account_holder_name,String dob,String pin,double money) {
//	   account = new Account(account_holder_name, dob, pin, money);
//   }

//@Override
//public String toString() {
//	return "Bank [bname=" + bname + ", loc=" + loc + ", ifsc_code=" + ifsc_code + ", micr_code=" + micr_code + "]";
//}

	public void createAccount(Account account) {
		if (this.account == null) {
			this.account = account;
			System.out.println("Account Successfully Created");
		} else {
			System.out.println("Account is Already Exist");
		}
	}

	public void deposite(long account_number, double money) {
		if (account.account_number == account_number) {
			if (money != 0) {
				account.money = account.money + money;
				System.out.println("deposit money:" + money);
				System.out.println("total ammount is:" + account.money);
			} else {
				System.out.println("Enter the valid amount to add in account");
			}
		} else {
			System.out.println("enter valid account number");

		}
	}

	public void withdraw(long account_number, double money) {
		if (account.account_number == account_number) {
			if (money >= money) {
				account.money = account.money - money;
				System.out.println("withdraw money:" + money);
				System.out.println("total ammount is:" + account.money);
			} else {
				System.out.println("insufficient balance");
			}
		} else {
			System.out.println("enter valid account number");

		}
	}

	public void deleteAccount() {
		this.account = null;
		System.out.println("Account Deleted");
	}

	public void showMenu() {
		int option;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select Your Option");
		System.out.println("1.Create Your Account");
		System.out.println("2.Deposit Your Money");
		System.out.println("3.Withdraw Your Money ");
		System.out.println("4.Delete Your Account");
		System.out.println("5.EXIT");

		while (true) {
			System.out.println("enter your option");
			option = sc.nextInt();
			switch (option) {
			
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
				break;
			case 2:
				long account_number = sc.nextLong();
				System.out.println("Deposit Your Money");
				System.out.println("Enter your Account Number");
				account_number = sc.nextLong();
				System.out.println("Enter your Amount");
				money = sc.nextDouble();
				break;
			case 3:
				System.out.println("Withdraw Your Money");
				System.out.println("Enter your Account Number");
				account_number = sc.nextLong();
				System.out.println("Enter your Amount");
				money = sc.nextDouble();
				break;
			case 4:
				System.out.println("Delete Your Account");

				break;
			case 5:
				System.out.println("Exit");
				break;

			default:
				System.out.println("invalid input");

			}
		}
	}
}
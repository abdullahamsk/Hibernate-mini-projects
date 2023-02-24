package java.org.jsp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.org.jsp.dao.Banking_dao;
import java.org.jsp.dto.Account;
import java.org.jsp.dto.Bank;

public class Banking_controller {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.setBname("SBI");
		bank.setIfsc_code("SBI002456");
		bank.setLoc("Thane");

		Account account = new Account();
		account.setAccount_holder_name("abdullah");
		account.setAcno(51020206);
		account.setDob("12/02/1197");
		account.setPin("1234");
		account.setMoney(5000.00);

		Account account1 = new Account();
		account.setAccount_holder_name("abdul");
		account.setAcno(61020206);
		account.setDob("18/05/1197");
		account.setPin("2626");
		account.setMoney(9000.00);

		List<Account> accounts = new ArrayList<>();
		accounts.add(account);
		accounts.add(account1);

		bank.setAccounts(accounts);

		Banking_dao dao = new Banking_dao();
		dao.createAccount1(bank);

//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.println("Banking system\n");
//			System.out.println("Choose 1 for Create New Account");
//			System.out.println("Choose 2 for Withdraw");
//			System.out.println("Choose 3 for Deposit");
//			System.out.println("Choose 4 for Check Balance");
//			System.out.println("Choose 5 for Close the account");
//			System.out.println("Choose 6 for EXIT\n");
//			System.out.print("Choose the operation:");
//
//			// get choice from user
//
//			int choice = sc.nextInt();
//			switch (choice) {
//			case 1:
//
//				System.out.println("Enter account_holder_name");
//				String account_holder_name = sc.next();
//				System.out.println("Enter acno");
//				long acno = sc.nextLong();
//				System.out.println("Enter dob");
//				String dob = sc.next();
//				System.out.println("Enter pin");
//				String pin = sc.next();
//				System.out.println("first deposit");
//				Double money = sc.nextDouble();
//
//				System.out.println("account is created successfully");
//
//				System.out.println("");
//				break;
//
//			case 2:
//
//				System.out.print("Enter acno to be with1drawn:");
//				acno = sc.nextLong();
//
//				// get the withdrawl money from user
//				System.out.print("Enter money to be withdrawn:");
//
//				money = sc.nextDouble();
//				dao.withdraw(acno, money);
//
//				System.out.println("Please collect your money");
//
//				System.out.println("");
//				break;
//
//			case 3:
//
//				System.out.print("Enter acno to be deposite:");
//				acno = sc.nextLong();
//
//				// get the deposite money from user
//				System.out.print("Enter money to be deposite:");
//
//				money = sc.nextDouble();
//
//				dao.deposite(acno, money);
//
//				System.out.println("Your Money has been successfully depsited");
//				System.out.println("");
//				break;
//
//			case 4:
////			 displaying the total balance of the user
//				System.out.print("Enter acno :");
//				acno = sc.nextLong();
//				System.out.println("Balance : " + account.getMoney());
//				System.out.println("");
//				break;
//
//			case 5:
//
//				System.out.print("Enter acno for closing:");
//				acno = sc.nextLong();
//
//				dao.deleteAccount(acno);
//
//				System.out.println("account is close successfully");
//
//				System.out.println("");
//				break;
//				
//				
//			default:
//				System.out.println("incorrect choice");
//				break;
//
//			}
//
//		}
	}

}

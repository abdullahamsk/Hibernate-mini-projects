package org.jsp.bank_account;

public class Account {
	String account_holder_name;
	String dob;
	String pin;
	double money;
	long account_number;

	public Account(String account_holder_name, String dob, String pin, double money, long account_number) {
		this.account_holder_name = account_holder_name;
		this.dob = dob;
		this.pin = pin;
		this.money = money;
		this.account_number = account_number;
	}

	public void accountDetails() {
		System.out.println(account_holder_name);
		System.out.println(dob);
		System.out.println(pin);
		System.out.println(money);
		System.out.println(account_number);
	}

//	@Override
//	public String toString() {
//		return "Account [account_holder_name=" + account_holder_name + ", dob=" + dob + ", pin=" + pin + ", money="
//				+ money + "]";
//	}

}

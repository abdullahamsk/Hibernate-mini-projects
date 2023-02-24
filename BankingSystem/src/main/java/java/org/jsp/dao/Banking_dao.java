package java.org.jsp.dao;

import java.org.jsp.dto.Account;
import java.org.jsp.dto.Bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Banking_dao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	Account a;

	public void bankDetails(long acno) {

		if (a.getAcno() != acno) {
			entityTransaction.begin();
			Bank bank = entityManager.find(Bank.class, acno);
			entityTransaction.commit();
		} else {
			System.out.println("To check account first");

		}
	}

	public void createAccount1(Bank bank) {

		entityTransaction.begin();
		entityManager.merge(bank);
		entityTransaction.commit();

	}

	public void createAccount(Bank bank, long acno) {
		if (a.getAcno() != acno) {
			entityTransaction.begin();
			entityManager.merge(bank);
			entityTransaction.commit();
			System.out.println("account is created successfully");
		} else {
			System.out.println("account already existing");
		}
	}

//
	public void deposite(long acno, double money) {
		if (a.getAcno() == acno) {
			if (money != 0) {
				a.setMoney(a.getMoney() + money);
				System.out.println("depositing amount" + money);
				System.out.println("total amount" + a.getMoney());

			} else {
				System.out.println("amount value is very low");

			}
		} else {
			System.out.println("account no is unvalid");
		}

	}

	public void withdraw(long acno, double money) {
		if (a.getAcno() == acno) {
			if (money != 0) {
				a.setMoney(a.getMoney() - money);
				System.out.println("depositing amount" + money);
				System.out.println("total amount" + a.getMoney());

			} else {
				System.out.println("amount value is very low");

			}
		} else {
			System.out.println("account no is unvalid");
		}

	}

	public void deleteAccount(long acno) {

		Bank bank = entityManager.find(Bank.class, acno);
		entityTransaction.begin();
		if (bank != null) {
			entityManager.remove(bank);
			entityTransaction.commit();
		} else {
			System.out.println("wrong id");
		}
	}

}

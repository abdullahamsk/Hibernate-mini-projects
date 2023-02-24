package java.org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

@Id
private long acno;
private String account_holder_name;
private String dob;
private String pin;
private Double money;




public String getAccount_holder_name() {
	return account_holder_name;
}
public void setAccount_holder_name(String account_holder_name) {
	this.account_holder_name = account_holder_name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public Double getMoney() {
	return money;
}
public void setMoney(Double money) {
	this.money = money;
}
public long getAcno() {
	return acno;
}
public void setAcno(long acno) {
	this.acno = acno;
}
@Override
public String toString() {
	return "Account [acno=" + acno + ", account_holder_name=" + account_holder_name + ", dob=" + dob + ", pin=" + pin
			+ ", money=" + money + "]";
}







}
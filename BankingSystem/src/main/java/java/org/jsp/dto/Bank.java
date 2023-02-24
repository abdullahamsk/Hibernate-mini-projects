package java.org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Bank {

	@Id
	@GeneratedValue
	private int id;
    private String bname;
	private String loc;
	private String ifsc_code;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Account> accounts;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public String getIfsc_code() {
		return ifsc_code;
	}


	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}


	public List<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	
	
	
	

}

package bankApp;

public class User {

	private String name;
	private String sureName;
	private String email ;
	private Account account;
	
	
	
	
	

	public User(String name, String sureName,  Account account) {
		
		this.name = name;
		
		this.sureName = sureName;
		
		this.account = account;
		
		this.email = this.name + "." + this.sureName + "@xbanka.com";
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSureName() {
		return sureName;
	}

	public void setSureName(String sureName) {
		this.sureName = sureName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	

	@Override
	public String toString() {
		return "User [name=" + name + ", sureName=" + sureName + ", email=" + email + ", account=" + account + "]";
	}
	
	

	
	
	
}

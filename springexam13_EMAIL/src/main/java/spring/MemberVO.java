package spring;

public class MemberVO {
	private long regnum;
	private String id;
	private String password;
	private String email;
	private String authkey;
	private char authstatus;
	public long getRegnum() {
		return regnum;
	}
	public void setRegnum(long regnum) {
		this.regnum = regnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAuthkey() {
		return authkey;
	}
	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}
	public char getAuthstatus() {
		return authstatus;
	}
	public void setAuthstatus(char c) {
		this.authstatus = c;
	}
	@Override
	public String toString() {
		return "MemberVO [regnum=" + regnum + ", id=" + id + ", password=" + password + ", email=" + email
				+ ", authkey=" + authkey + ", authstatus=" + authstatus + "]";
	}
	
	
	
	
	
	
}

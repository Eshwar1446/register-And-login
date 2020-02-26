package comm.module.example.dto;

public class SignUpDTO {

	private String userName;
	private String email;
	private long number;
	private String password;
	private String confirmpassword;
	
	public SignUpDTO() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	@Override
	public String toString() {
		return "SignUpDTO [userName=" + userName + ", email=" + email + ", number=" + number + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
}

package comm.module.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="registration")
public class SignUpEntity implements Serializable{

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name="userName")
	private String userName;
	@Column(name="email")
	private String email;
	@Column(name="number")
	private long number;
	@Column(name="password")
	private String password;
	
	public SignUpEntity() {
		System.out.println("created\t"+this.getClass().getSimpleName());
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

	@Override
	public String toString() {
		return "SignUpEntity [userName=" + userName + ", email=" + email + ", number=" + number + ", password="
				+ password + "]";
	}

	public SignUpEntity(String userName, String email, long number, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.number = number;
		this.password = password;
	}
	
	
}

package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="user")
@XmlRootElement
public class User extends Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Temporal(TemporalType.DATE)
	@Column(name="lastConnect")
	private Date lastConnect;
	@Column(name="accounttype")
	private AccountType type;
		
	@OneToOne
	@JoinColumn(name="loan")
	private Loan loan;
	
	public User() {
		super();
	}
	
	public User(long id, String lastname, String surname, String sex, String picture, String email, Date birthday, String username, String password, Date lastConnect, AccountType type) {
		super(id, lastname, surname, sex, picture, email, birthday);
		this.username = username;
		this.password = password;
		this.lastConnect = lastConnect;
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastConnect() {
		return lastConnect;
	}

	public void setLastConnect(Date lastConnect) {
		this.lastConnect = lastConnect;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

}

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String username;
	private String password;
	private Date lastConnect;

	public User() {
		super();
	}
	
	public User(long id, String username, String password, Date lastConnect) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.lastConnect = lastConnect;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}

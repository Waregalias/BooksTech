package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="loan")
@XmlRootElement
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Temporal(TemporalType.DATE)
	@Column(name="startDate")
	private Date startDate;
	@Column(name="duration")
	private int duration;
	@OneToOne
	@JoinColumn(name="book")
	private Book book;
	@OneToOne
	@JoinColumn(name="user")
	private User user;

	public Loan() {
		super();
	}
	
	public Loan(long id, Date startDate, int duration, Book book, User user) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.duration = duration;
		this.book = book;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

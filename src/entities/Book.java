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
@Table(name="book")
@XmlRootElement
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="title")
	private String title;
	@Column(name="summary")
	private String summary;
	@Column(name="qty")
	private int qty;
	@Column(name="isbn")
	private String isbn;
	@Column(name="picture")
	private String picture;
	@Temporal(TemporalType.DATE)
	@Column(name="datePublish")
	private Date datePublish;
	@JoinColumn(name="category")
	private Category category;
	@JoinColumn(name="author")
	private Author author;
	
	@OneToOne
	@JoinColumn(name="loan")
	private Loan loan;

	public Book() {
		super();
	}
	
	public Book(long id, String title, String summary, int qty, String isbn, String picture, Date datePublish, Category category, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.qty = qty;
		this.isbn = isbn;
		this.picture = picture;
		this.datePublish = datePublish;
		this.category = category;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getDatePublish() {
		return datePublish;
	}

	public void setDatePublish(Date datePublish) {
		this.datePublish = datePublish;
	}

	
	public Category getCategory() {
		return category;
	}

	
	public void setCategory(Category category) {
		this.category = category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}

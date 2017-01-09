package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="author")
@XmlRootElement
public class Author extends Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="about")
	private String about;
	@Column(name="nationality")
	private String nationality;
	@Column(name="typeauthor")
	private TypeAuthor type;

	public Author() {
		super();
	}

	public Author(long id, String lastname, String surname, String sex, String picture, String email, Date birthday, String about, String nationality, TypeAuthor type) {
		super(id, lastname, surname, sex, picture, email, birthday);
		this.about = about;
		this.nationality = nationality;
		this.type = type;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public TypeAuthor getType() {
		return type;
	}

	public void setType(TypeAuthor type) {
		this.type = type;
	}

}

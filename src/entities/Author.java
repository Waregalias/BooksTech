package entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Author implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String about;
	private String nationality;

	public Author() {
		super();
	}

	public Author(long id, String about, String nationality) {
		super();
		this.id = id;
		this.about = about;
		this.nationality = nationality;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}

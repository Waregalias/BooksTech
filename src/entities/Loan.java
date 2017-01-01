package entities;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private Date startDate;
	private int duration;

	public Loan() {
		super();
	}
	
	public Loan(long id, Date startDate, int duration) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.duration = duration;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
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

}

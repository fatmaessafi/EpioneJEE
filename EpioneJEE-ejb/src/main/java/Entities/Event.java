package Entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Events database table.
 * 
 */
@Entity
@Table(name="Events")
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EventId")
	private int eventId;

	@Column(name="Description")
	private Object description;

	@Column(name="End")
	private String end;

	@Column(name="IsFullDay")
	private short isFullDay;

	@Column(name="Start")
	private String start;

	@Column(name="Subject")
	private Object subject;

	@Column(name="ThemeColor")
	private Object themeColor;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User user;

	public Event() {
	}

	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public short getIsFullDay() {
		return this.isFullDay;
	}

	public void setIsFullDay(short isFullDay) {
		this.isFullDay = isFullDay;
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public Object getSubject() {
		return this.subject;
	}

	public void setSubject(Object subject) {
		this.subject = subject;
	}

	public Object getThemeColor() {
		return this.themeColor;
	}

	public void setThemeColor(Object themeColor) {
		this.themeColor = themeColor;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
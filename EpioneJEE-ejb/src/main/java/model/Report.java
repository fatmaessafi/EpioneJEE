package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Reports database table.
 * 
 */
@Entity
@Table(name="Reports")
@NamedQuery(name="Report.findAll", query="SELECT r FROM Report r")
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ReportId")
	private int reportId;

	@Column(name="AppointmentId")
	private int appointmentId;

	@Column(name="ReportDate")
	private String reportDate;

	@Column(name="ReportDescription")
	private Object reportDescription;

	//bi-directional one-to-one association to Appointment
	@OneToOne
	@JoinColumn(name="ReportId")
	private Appointment appointment;

	public Report() {
	}

	public int getReportId() {
		return this.reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public int getAppointmentId() {
		return this.appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public Object getReportDescription() {
		return this.reportDescription;
	}

	public void setReportDescription(Object reportDescription) {
		this.reportDescription = reportDescription;
	}

	public Appointment getAppointment() {
		return this.appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Treatments database table.
 * 
 */
@Entity
@Table(name="Treatments")
@NamedQuery(name="Treatment.findAll", query="SELECT t FROM Treatment t")
public class Treatment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TreatmentId")
	private int treatmentId;

	@Column(name="Illness")
	private Object illness;

	//bi-directional many-to-many association to Appointment
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="Treat"
		, joinColumns={
			@JoinColumn(name="Treatment_TreatmentId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Appointment_AppointmentId")
			}
		)
	private List<Appointment> appointments;

	//bi-directional many-to-one association to Step
	@OneToMany(mappedBy="treatment", fetch=FetchType.EAGER)
	private List<Step> steps;

	public Treatment() {
	}

	public int getTreatmentId() {
		return this.treatmentId;
	}

	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}

	public Object getIllness() {
		return this.illness;
	}

	public void setIllness(Object illness) {
		this.illness = illness;
	}

	public List<Appointment> getAppointments() {
		return this.appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public List<Step> getSteps() {
		return this.steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public Step addStep(Step step) {
		getSteps().add(step);
		step.setTreatment(this);

		return step;
	}

	public Step removeStep(Step step) {
		getSteps().remove(step);
		step.setTreatment(null);

		return step;
	}

}
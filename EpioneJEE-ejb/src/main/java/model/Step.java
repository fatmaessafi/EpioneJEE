package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Steps database table.
 * 
 */
@Entity
@Table(name="Steps")
@NamedQuery(name="Step.findAll", query="SELECT s FROM Step s")
public class Step implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StepId")
	private int stepId;

	@Column(name="LastModificationDate")
	private String lastModificationDate;

	@Column(name="ModificationReason")
	private Object modificationReason;

	@Column(name="NbModifications")
	private int nbModifications;

	@Column(name="StepDate")
	private String stepDate;

	@Column(name="StepDescription")
	private Object stepDescription;

	@Column(name="Validation")
	private boolean validation;

	//bi-directional many-to-one association to Treatment
	@ManyToOne
	@JoinColumn(name="TreatmentId")
	private Treatment treatment;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User user;

	public Step() {
	}

	public int getStepId() {
		return this.stepId;
	}

	public void setStepId(int stepId) {
		this.stepId = stepId;
	}

	public String getLastModificationDate() {
		return this.lastModificationDate;
	}

	public void setLastModificationDate(String lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public Object getModificationReason() {
		return this.modificationReason;
	}

	public void setModificationReason(Object modificationReason) {
		this.modificationReason = modificationReason;
	}

	public int getNbModifications() {
		return this.nbModifications;
	}

	public void setNbModifications(int nbModifications) {
		this.nbModifications = nbModifications;
	}

	public String getStepDate() {
		return this.stepDate;
	}

	public void setStepDate(String stepDate) {
		this.stepDate = stepDate;
	}

	public Object getStepDescription() {
		return this.stepDescription;
	}

	public void setStepDescription(Object stepDescription) {
		this.stepDescription = stepDescription;
	}

	public boolean getValidation() {
		return this.validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public Treatment getTreatment() {
		return this.treatment;
	}

	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
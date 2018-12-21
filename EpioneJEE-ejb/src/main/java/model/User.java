package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="AccessFailedCount")
	private int accessFailedCount;

	@Column(name="Allergies")
	private Object allergies;

	@Column(name="BirthDate")
	private String birthDate;

	@Column(name="Cin")
	private int cin;

	@Column(name="City")
	private Object city;

	@Column(name="CivilStatus")
	private Object civilStatus;

	@Column(name="Discriminator")
	private Object discriminator;

	@Column(name="Email")
	private Object email;

	@Column(name="EmailConfirmed")
	private boolean emailConfirmed;

	@Column(name="Enabled")
	private boolean enabled;

	@Column(name="FirstName")
	private Object firstName;

	@Column(name="Gender")
	private Object gender;

	@Column(name="HomeAddress")
	private Object homeAddress;

	@Column(name="LastName")
	private Object lastName;

	@Column(name="Location")
	private Object location;

	@Column(name="LockoutEnabled")
	private boolean lockoutEnabled;

	@Column(name="LockoutEndDateUtc")
	private String lockoutEndDateUtc;

	@Column(name="PasswordHash")
	private Object passwordHash;

	@Column(name="PhoneNumber")
	private Object phoneNumber;

	@Column(name="PhoneNumberConfirmed")
	private boolean phoneNumberConfirmed;

	@Column(name="Profession")
	private Object profession;

	@Column(name="RegistrationDate")
	private String registrationDate;

	@Column(name="SecurityStamp")
	private Object securityStamp;

	@Column(name="Speciality")
	private Object speciality;

	@Column(name="SpecialReq")
	private Object specialReq;

	@Column(name="Surgeon")
	private boolean surgeon;

	@Column(name="TwoFactorEnabled")
	private boolean twoFactorEnabled;

	@Column(name="UserName")
	private Object userName;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<Appointment> appointments;

	//bi-directional many-to-one association to CustomUserClaim
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<CustomUserClaim> customUserClaims;

	//bi-directional many-to-one association to CustomUserLogin
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<CustomUserLogin> customUserLogins;

	//bi-directional many-to-one association to DayOff
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<DayOff> dayOffs;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<Message> messages;

	//bi-directional many-to-one association to VisitReason
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<VisitReason> visitReasons;

	//bi-directional many-to-one association to Analytic
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<Analytic> analytics;

	//bi-directional many-to-one association to CustomUserRole
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<CustomUserRole> customUserRoles;

	//bi-directional many-to-one association to Step
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<Step> steps;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public Object getAllergies() {
		return this.allergies;
	}

	public void setAllergies(Object allergies) {
		this.allergies = allergies;
	}

	public String getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public Object getCity() {
		return this.city;
	}

	public void setCity(Object city) {
		this.city = city;
	}

	public Object getCivilStatus() {
		return this.civilStatus;
	}

	public void setCivilStatus(Object civilStatus) {
		this.civilStatus = civilStatus;
	}

	public Object getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(Object discriminator) {
		this.discriminator = discriminator;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Object getFirstName() {
		return this.firstName;
	}

	public void setFirstName(Object firstName) {
		this.firstName = firstName;
	}

	public Object getGender() {
		return this.gender;
	}

	public void setGender(Object gender) {
		this.gender = gender;
	}

	public Object getHomeAddress() {
		return this.homeAddress;
	}

	public void setHomeAddress(Object homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Object getLastName() {
		return this.lastName;
	}

	public void setLastName(Object lastName) {
		this.lastName = lastName;
	}

	public Object getLocation() {
		return this.location;
	}

	public void setLocation(Object location) {
		this.location = location;
	}

	public boolean getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public String getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(String lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public Object getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(Object passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Object getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Object phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public Object getProfession() {
		return this.profession;
	}

	public void setProfession(Object profession) {
		this.profession = profession;
	}

	public String getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Object getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(Object securityStamp) {
		this.securityStamp = securityStamp;
	}

	public Object getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(Object speciality) {
		this.speciality = speciality;
	}

	public Object getSpecialReq() {
		return this.specialReq;
	}

	public void setSpecialReq(Object specialReq) {
		this.specialReq = specialReq;
	}

	public boolean getSurgeon() {
		return this.surgeon;
	}

	public void setSurgeon(boolean surgeon) {
		this.surgeon = surgeon;
	}

	public boolean getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public Object getUserName() {
		return this.userName;
	}

	public void setUserName(Object userName) {
		this.userName = userName;
	}

	public List<Appointment> getAppointments() {
		return this.appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Appointment addAppointment(Appointment appointment) {
		getAppointments().add(appointment);
		appointment.setUser(this);

		return appointment;
	}

	public Appointment removeAppointment(Appointment appointment) {
		getAppointments().remove(appointment);
		appointment.setUser(null);

		return appointment;
	}

	public List<CustomUserClaim> getCustomUserClaims() {
		return this.customUserClaims;
	}

	public void setCustomUserClaims(List<CustomUserClaim> customUserClaims) {
		this.customUserClaims = customUserClaims;
	}

	public CustomUserClaim addCustomUserClaim(CustomUserClaim customUserClaim) {
		getCustomUserClaims().add(customUserClaim);
		customUserClaim.setUser(this);

		return customUserClaim;
	}

	public CustomUserClaim removeCustomUserClaim(CustomUserClaim customUserClaim) {
		getCustomUserClaims().remove(customUserClaim);
		customUserClaim.setUser(null);

		return customUserClaim;
	}

	public List<CustomUserLogin> getCustomUserLogins() {
		return this.customUserLogins;
	}

	public void setCustomUserLogins(List<CustomUserLogin> customUserLogins) {
		this.customUserLogins = customUserLogins;
	}

	public CustomUserLogin addCustomUserLogin(CustomUserLogin customUserLogin) {
		getCustomUserLogins().add(customUserLogin);
		customUserLogin.setUser(this);

		return customUserLogin;
	}

	public CustomUserLogin removeCustomUserLogin(CustomUserLogin customUserLogin) {
		getCustomUserLogins().remove(customUserLogin);
		customUserLogin.setUser(null);

		return customUserLogin;
	}

	public List<DayOff> getDayOffs() {
		return this.dayOffs;
	}

	public void setDayOffs(List<DayOff> dayOffs) {
		this.dayOffs = dayOffs;
	}

	public DayOff addDayOff(DayOff dayOff) {
		getDayOffs().add(dayOff);
		dayOff.setUser(this);

		return dayOff;
	}

	public DayOff removeDayOff(DayOff dayOff) {
		getDayOffs().remove(dayOff);
		dayOff.setUser(null);

		return dayOff;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setUser(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setUser(null);

		return message;
	}

	public List<VisitReason> getVisitReasons() {
		return this.visitReasons;
	}

	public void setVisitReasons(List<VisitReason> visitReasons) {
		this.visitReasons = visitReasons;
	}

	public VisitReason addVisitReason(VisitReason visitReason) {
		getVisitReasons().add(visitReason);
		visitReason.setUser(this);

		return visitReason;
	}

	public VisitReason removeVisitReason(VisitReason visitReason) {
		getVisitReasons().remove(visitReason);
		visitReason.setUser(null);

		return visitReason;
	}

	public List<Analytic> getAnalytics() {
		return this.analytics;
	}

	public void setAnalytics(List<Analytic> analytics) {
		this.analytics = analytics;
	}

	public Analytic addAnalytic(Analytic analytic) {
		getAnalytics().add(analytic);
		analytic.setUser(this);

		return analytic;
	}

	public Analytic removeAnalytic(Analytic analytic) {
		getAnalytics().remove(analytic);
		analytic.setUser(null);

		return analytic;
	}

	public List<CustomUserRole> getCustomUserRoles() {
		return this.customUserRoles;
	}

	public void setCustomUserRoles(List<CustomUserRole> customUserRoles) {
		this.customUserRoles = customUserRoles;
	}

	public CustomUserRole addCustomUserRole(CustomUserRole customUserRole) {
		getCustomUserRoles().add(customUserRole);
		customUserRole.setUser(this);

		return customUserRole;
	}

	public CustomUserRole removeCustomUserRole(CustomUserRole customUserRole) {
		getCustomUserRoles().remove(customUserRole);
		customUserRole.setUser(null);

		return customUserRole;
	}

	public List<Step> getSteps() {
		return this.steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public Step addStep(Step step) {
		getSteps().add(step);
		step.setUser(this);

		return step;
	}

	public Step removeStep(Step step) {
		getSteps().remove(step);
		step.setUser(null);

		return step;
	}

}
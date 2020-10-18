// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "encuesta", uniqueConstraints = @UniqueConstraint(columnNames = "Username"))
public class Usuario implements java.io.Serializable {

	private Integer usuarioId;
	private String birthDate;
	private String email;
	private Byte enabled;
	private String firstName;
	private String gender;
	private String initials;
	private String lastName;
	private String middleName;
	private String password;
	private String title;
	private String username;
	private Set<Rol> rols = new HashSet<Rol>(0);
	private Set<Surveyparticipant> surveyparticipants = new HashSet<Surveyparticipant>(0);

	public Usuario() {
	}

	public Usuario(String username) {
		this.username = username;
	}

	public Usuario(String birthDate, String email, Byte enabled, String firstName, String gender, String initials,
			String lastName, String middleName, String password, String title, String username, Set<Rol> rols,
			Set<Surveyparticipant> surveyparticipants) {
		this.birthDate = birthDate;
		this.email = email;
		this.enabled = enabled;
		this.firstName = firstName;
		this.gender = gender;
		this.initials = initials;
		this.lastName = lastName;
		this.middleName = middleName;
		this.password = password;
		this.title = title;
		this.username = username;
		this.rols = rols;
		this.surveyparticipants = surveyparticipants;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "UsuarioID", unique = true, nullable = false)
	public Integer getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Column(name = "BirthDate", length = 40)
	public String getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "Email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Enabled")
	public Byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Byte enabled) {
		this.enabled = enabled;
	}

	@Column(name = "FirstName", length = 40)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "Gender", length = 40)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "Initials", length = 40)
	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	@Column(name = "LastName", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "MiddleName", length = 15)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "Password", length = 60)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "Title", length = 40)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "Username", unique = true, nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_has_rol", catalog = "encuesta", joinColumns = {
			@JoinColumn(name = "Usuario_UsuarioID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "rol_RolID", nullable = false, updatable = false) })
	public Set<Rol> getRols() {
		return this.rols;
	}

	public void setRols(Set<Rol> rols) {
		this.rols = rols;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Surveyparticipant> getSurveyparticipants() {
		return this.surveyparticipants;
	}

	public void setSurveyparticipants(Set<Surveyparticipant> surveyparticipants) {
		this.surveyparticipants = surveyparticipants;
	}

}

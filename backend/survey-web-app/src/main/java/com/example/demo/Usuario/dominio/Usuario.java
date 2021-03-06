package com.example.demo.Usuario.dominio;

// default package
// Generated 13 sep 2020 0:50:31 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import com.example.demo.rol.dominio.Rol;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "encuesta")

public class Usuario implements java.io.Serializable {
	
	@JsonView(Views.User.class)
	private int usuarioId;
	@JsonView(Views.User.class)
	private String username;
	@JsonView(Views.User.class)
	private String birthDate;
	@JsonView(Views.User.class)
	private String firstName;
	@JsonView(Views.User.class)
	private String gender;
	@JsonView(Views.User.class)
	private String initials;
	@JsonView(Views.User.class)
	private String lastName;
	@JsonView(Views.User.class)
	private String middleName;
	@JsonView(Views.User.class)
	private String title;
	@JsonView(Views.User.class)
	private String password;
	@JsonView(Views.User.class)
	private Byte enabled;
	@JsonView(Views.User.class)
	private String email;
	@JsonView(Views.User.class)
	private Set<Surveyparticipant> surveyparticipants = new HashSet<Surveyparticipant>(0);
	@JsonView(Views.User.class)
	private Set<Rol> rols = new HashSet<Rol>(0);

	public Usuario() {
	}

	public Usuario(int usuarioId, String username) {
		this.usuarioId = usuarioId;
		this.username = username;
	}

	public Usuario(int usuarioId, String username, String birthDate, String firstName, String gender,
			String initials, String lastName, String middleName, String title, String password, Byte enabled,
			String email, Set<Surveyparticipant> surveyparticipants, Set<Rol> rols) {
		this.usuarioId = usuarioId;
		this.username = username;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.gender = gender;
		this.initials = initials;
		this.lastName = lastName;
		this.middleName = middleName;
		this.title = title;
		this.password = password;
		this.enabled = enabled;
		this.email = email;
		this.surveyparticipants = surveyparticipants;
		this.rols = rols;
	}

	public Usuario(String nombre, String nombreUsuario, String email, String encode) {
		this.firstName = nombre;
		this.username = nombreUsuario;
		this.email = email;
		this.password = encode;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UsuarioID", unique = true, nullable = false)
	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Column(name = "Username", unique = true, nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "BirthDate", length = 40)
	public String getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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

	@Column(name = "Title", length = 40)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "Password", length = 60)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "Enabled")
	public Byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Byte enabled) {
		this.enabled = enabled;
	}

	@Column(name = "Email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Surveyparticipant> getSurveyparticipants() {
		return this.surveyparticipants;
	}

	public void setSurveyparticipants(Set<Surveyparticipant> surveyparticipants) {
		this.surveyparticipants = surveyparticipants;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuario_has_rol", catalog = "encuesta", joinColumns = {
			@JoinColumn(name = "Usuario_UsuarioID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "rol_RolID", nullable = false, updatable = false) })
	
	public Set<Rol> getRols() {
		return this.rols;
	}

	public void setRols(Set<Rol> rols) {
		this.rols = rols;
	}

}

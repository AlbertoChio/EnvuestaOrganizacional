package com.example.demo.rol.dominio;

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
import javax.persistence.Table;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name = "rol", catalog = "encuesta")
public class Rol implements java.io.Serializable {
	
	
	private int rolId;
	@JsonView(Views.User.class)
	private String rolNombre;
	@JsonView(Views.InfiniteRecursion.class)
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public Rol() {
	}

	public Rol(int rolId, String rolNombre) {
		this.rolId = rolId;
		this.rolNombre = rolNombre;
	}

	public Rol(int rolId, String rolNombre, Set<Usuario> usuarios) {
		this.rolId = rolId;
		this.rolNombre = rolNombre;
		this.usuarios = usuarios;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RolID", unique = true, nullable = false)
	public int getRolId() {
		return this.rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	@Column(name = "RolNombre", nullable = false, length = 45)
	public String getRolNombre() {
		return this.rolNombre;
	}

	public void setRolNombre(String rolNombre) {
		this.rolNombre = rolNombre;
	}
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_has_rol", catalog = "encuesta", joinColumns = {
			@JoinColumn(name = "rol_RolID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Usuario_UsuarioID", nullable = false, updatable = false) })
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
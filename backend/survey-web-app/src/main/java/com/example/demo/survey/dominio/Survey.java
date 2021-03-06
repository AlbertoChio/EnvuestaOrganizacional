package com.example.demo.survey.dominio;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;

// default package
// Generated 15 sep 2020 12:52:23 by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.demo.question.dominio.Question;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/**
 * Survey generated by hbm2java
 */
@Entity
@Table(name = "survey", catalog = "encuesta")
public class Survey implements java.io.Serializable {
	@JsonView(Views.Admin.class)
	private int surveyId;
	
	@JsonView(Views.User.class)
	private String surveyDescription;
	
	@JsonView(Views.User.class)
	private String surveyExitMessage;
	
	@JsonView(Views.User.class)
	private Date surveyExpirationDate;
	
	@JsonView(Views.User.class)
	private String surveyName;
	
	@JsonView(Views.User.class)
	private Date surveyPublicationDate;
	
	@JsonView(Views.User.class)
	private Date surveyStartDate;
	
	@JsonView(Views.User.class)
	private String surveyWelcomeMessage;
	
	@JsonView(Views.User.class)
	private boolean surveyActive;
	
	@JsonView(Views.User.class)
	private Set<Question> questions = new HashSet<Question>(0);
	
	private Set<Surveyparticipant> surveyparticipants = new HashSet<Surveyparticipant>(0);
	
	@JsonView(Views.User.class)
	private Set<Segmentation> segmentations = new HashSet<Segmentation>(0);
	
	public Survey() {
	}

	public Survey(boolean surveyActive, String surveyName) {
		this.surveyActive = surveyActive;
		this.surveyName = surveyName;
	}

	public Survey(boolean surveyActive, String surveyDescription, String surveyExitMessage, Date surveyExpirationDate,
			String surveyName, Date surveyPublicationDate, Date surveyStartDate, String surveyWelcomeMessage,
			Set<Surveyparticipant> surveyparticipants, Set<Segmentation> segmentations, Set<Question> questions) {
		this.surveyActive = surveyActive;
		this.surveyDescription = surveyDescription;
		this.surveyExitMessage = surveyExitMessage;
		this.surveyExpirationDate = surveyExpirationDate;
		this.surveyName = surveyName;
		this.surveyPublicationDate = surveyPublicationDate;
		this.surveyStartDate = surveyStartDate;
		this.surveyWelcomeMessage = surveyWelcomeMessage;
		this.surveyparticipants = surveyparticipants;
		this.segmentations = segmentations;
		this.questions = questions;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SurveyID", unique = true, nullable = false)
	public int getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	@Column(name = "SurveyDescription")
	public String getSurveyDescription() {
		return this.surveyDescription;
	}

	public void setSurveyDescription(String surveyDescription) {
		this.surveyDescription = surveyDescription;
	}

	@Column(name = "SurveyExitMessage")
	public String getSurveyExitMessage() {
		return this.surveyExitMessage;
	}

	public void setSurveyExitMessage(String surveyExitMessage) {
		this.surveyExitMessage = surveyExitMessage;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SurveyExpirationDate", length = 26)
	public Date getSurveyExpirationDate() {
		return this.surveyExpirationDate;
	}

	public void setSurveyExpirationDate(Date surveyExpirationDate) {
		this.surveyExpirationDate = surveyExpirationDate;
	}

	@Column(name = "SurveyName", length = 40,unique = true, nullable = false)
	public String getSurveyName() {
		return this.surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SurveyPublicationDate", length = 26)
	public Date getSurveyPublicationDate() {
		return this.surveyPublicationDate;
	}

	public void setSurveyPublicationDate(Date surveyPublicationDate) {
		this.surveyPublicationDate = surveyPublicationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SurveyStartDate", length = 26)
	public Date getSurveyStartDate() {
		return this.surveyStartDate;
	}

	public void setSurveyStartDate(Date surveyStartDate) {
		this.surveyStartDate = surveyStartDate;
	}

	@Column(name = "SurveyWelcomeMessage")
	public String getSurveyWelcomeMessage() {
		return this.surveyWelcomeMessage;
	}

	public void setSurveyWelcomeMessage(String surveyWelcomeMessage) {
		this.surveyWelcomeMessage = surveyWelcomeMessage;
	}
	
	@Column(name = "SurveyActive", nullable = false)
	public boolean getSurveyActive() {
		return this.surveyActive;
	}

	public void setSurveyActive(boolean surveyActive) {
		this.surveyActive = surveyActive;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "survey")
	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "survey")
	public Set<Surveyparticipant> getSurveyparticipants() {
		return this.surveyparticipants;
	}

	public void setSurveyparticipants(Set<Surveyparticipant> surveyparticipants) {
		this.surveyparticipants = surveyparticipants;
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "survey_has_segmentation", catalog = "encuesta", joinColumns = {
			@JoinColumn(name = "survey_SurveyID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "segmentation_segmentationID", nullable = false, updatable = false) })
	public Set<Segmentation> getSegmentations() {
		return this.segmentations;
	}

	public void setSegmentations(Set<Segmentation> segmentations) {
		this.segmentations = segmentations;
	}


	public Boolean surveyExpired() {
		TimeZone timeZone = TimeZone.getTimeZone("America/Mexico_City");
	    Calendar calendar = Calendar.getInstance(timeZone);
	    calendar.set(Calendar.HOUR_OF_DAY, -5);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MILLISECOND, 0);
		if(surveyStartDate==null || surveyExpirationDate==null)
			return false;
		return  calendar.getTime().before(surveyStartDate) || calendar.getTime().after(surveyExpirationDate);
	}

	public Date currenDate() {
		TimeZone timeZone = TimeZone.getTimeZone("America/Mexico_City");
	    Calendar calendar = Calendar.getInstance(timeZone);
	    calendar.set(Calendar.HOUR_OF_DAY, -5);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
}

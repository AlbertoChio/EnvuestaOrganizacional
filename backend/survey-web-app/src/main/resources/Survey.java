// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Survey generated by hbm2java
 */
@Entity
@Table(name = "survey", catalog = "encuesta", uniqueConstraints = @UniqueConstraint(columnNames = "SurveyName"))
public class Survey implements java.io.Serializable {

	private Integer surveyId;
	private boolean surveyActive;
	private String surveyDescription;
	private String surveyExitMessage;
	private Date surveyExpirationDate;
	private String surveyName;
	private Date surveyPublicationDate;
	private Date surveyStartDate;
	private String surveyWelcomeMessage;
	private Set<Surveyparticipant> surveyparticipants = new HashSet<Surveyparticipant>(0);
	private Set<Question> questions = new HashSet<Question>(0);
	private Set<Segmentation> segmentations = new HashSet<Segmentation>(0);

	public Survey() {
	}

	public Survey(boolean surveyActive, String surveyName) {
		this.surveyActive = surveyActive;
		this.surveyName = surveyName;
	}

	public Survey(boolean surveyActive, String surveyDescription, String surveyExitMessage, Date surveyExpirationDate,
			String surveyName, Date surveyPublicationDate, Date surveyStartDate, String surveyWelcomeMessage,
			Set<Surveyparticipant> surveyparticipants, Set<Question> questions, Set<Segmentation> segmentations) {
		this.surveyActive = surveyActive;
		this.surveyDescription = surveyDescription;
		this.surveyExitMessage = surveyExitMessage;
		this.surveyExpirationDate = surveyExpirationDate;
		this.surveyName = surveyName;
		this.surveyPublicationDate = surveyPublicationDate;
		this.surveyStartDate = surveyStartDate;
		this.surveyWelcomeMessage = surveyWelcomeMessage;
		this.surveyparticipants = surveyparticipants;
		this.questions = questions;
		this.segmentations = segmentations;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "SurveyID", unique = true, nullable = false)
	public Integer getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	@Column(name = "SurveyActive", nullable = false)
	public boolean isSurveyActive() {
		return this.surveyActive;
	}

	public void setSurveyActive(boolean surveyActive) {
		this.surveyActive = surveyActive;
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

	@Column(name = "SurveyName", unique = true, nullable = false, length = 40)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "survey")
	public Set<Surveyparticipant> getSurveyparticipants() {
		return this.surveyparticipants;
	}

	public void setSurveyparticipants(Set<Surveyparticipant> surveyparticipants) {
		this.surveyparticipants = surveyparticipants;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "survey")
	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
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

}

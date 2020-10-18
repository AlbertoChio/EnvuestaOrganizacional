// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UserSummaryByFileIoType generated by hbm2java
 */
@Entity
@Table(name = "user_summary_by_file_io_type", catalog = "sys")
public class UserSummaryByFileIoType implements java.io.Serializable {

	private UserSummaryByFileIoTypeId id;

	public UserSummaryByFileIoType() {
	}

	public UserSummaryByFileIoType(UserSummaryByFileIoTypeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "user", column = @Column(name = "user", length = 32)),
			@AttributeOverride(name = "eventName", column = @Column(name = "event_name", nullable = false, length = 128)),
			@AttributeOverride(name = "total", column = @Column(name = "total", nullable = false)),
			@AttributeOverride(name = "latency", column = @Column(name = "latency", length = 65535)),
			@AttributeOverride(name = "maxLatency", column = @Column(name = "max_latency", length = 65535)) })
	public UserSummaryByFileIoTypeId getId() {
		return this.id;
	}

	public void setId(UserSummaryByFileIoTypeId id) {
		this.id = id;
	}

}

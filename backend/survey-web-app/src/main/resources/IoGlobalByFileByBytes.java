// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * IoGlobalByFileByBytes generated by hbm2java
 */
@Entity
@Table(name = "io_global_by_file_by_bytes", catalog = "sys")
public class IoGlobalByFileByBytes implements java.io.Serializable {

	private IoGlobalByFileByBytesId id;

	public IoGlobalByFileByBytes() {
	}

	public IoGlobalByFileByBytes(IoGlobalByFileByBytesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "file", column = @Column(name = "file", length = 512)),
			@AttributeOverride(name = "countRead", column = @Column(name = "count_read", nullable = false)),
			@AttributeOverride(name = "totalRead", column = @Column(name = "total_read", length = 65535)),
			@AttributeOverride(name = "avgRead", column = @Column(name = "avg_read", length = 65535)),
			@AttributeOverride(name = "countWrite", column = @Column(name = "count_write", nullable = false)),
			@AttributeOverride(name = "totalWritten", column = @Column(name = "total_written", length = 65535)),
			@AttributeOverride(name = "avgWrite", column = @Column(name = "avg_write", length = 65535)),
			@AttributeOverride(name = "total", column = @Column(name = "total", length = 65535)),
			@AttributeOverride(name = "writePct", column = @Column(name = "write_pct", nullable = false, precision = 26)) })
	public IoGlobalByFileByBytesId getId() {
		return this.id;
	}

	public void setId(IoGlobalByFileByBytesId id) {
		this.id = id;
	}

}

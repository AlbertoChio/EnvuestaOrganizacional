// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * IoGlobalByWaitByLatency generated by hbm2java
 */
@Entity
@Table(name = "io_global_by_wait_by_latency", catalog = "sys")
public class IoGlobalByWaitByLatency implements java.io.Serializable {

	private IoGlobalByWaitByLatencyId id;

	public IoGlobalByWaitByLatency() {
	}

	public IoGlobalByWaitByLatency(IoGlobalByWaitByLatencyId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "eventName", column = @Column(name = "event_name", length = 128)),
			@AttributeOverride(name = "total", column = @Column(name = "total", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 65535)),
			@AttributeOverride(name = "avgLatency", column = @Column(name = "avg_latency", length = 65535)),
			@AttributeOverride(name = "maxLatency", column = @Column(name = "max_latency", length = 65535)),
			@AttributeOverride(name = "readLatency", column = @Column(name = "read_latency", length = 65535)),
			@AttributeOverride(name = "writeLatency", column = @Column(name = "write_latency", length = 65535)),
			@AttributeOverride(name = "miscLatency", column = @Column(name = "misc_latency", length = 65535)),
			@AttributeOverride(name = "countRead", column = @Column(name = "count_read", nullable = false)),
			@AttributeOverride(name = "totalRead", column = @Column(name = "total_read", length = 65535)),
			@AttributeOverride(name = "avgRead", column = @Column(name = "avg_read", length = 65535)),
			@AttributeOverride(name = "countWrite", column = @Column(name = "count_write", nullable = false)),
			@AttributeOverride(name = "totalWritten", column = @Column(name = "total_written", length = 65535)),
			@AttributeOverride(name = "avgWritten", column = @Column(name = "avg_written", length = 65535)) })
	public IoGlobalByWaitByLatencyId getId() {
		return this.id;
	}

	public void setId(IoGlobalByWaitByLatencyId id) {
		this.id = id;
	}

}

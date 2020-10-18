// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IoByThreadByLatencyId generated by hbm2java
 */
@Embeddable
public class IoByThreadByLatencyId implements java.io.Serializable {

	private String user;
	private BigDecimal total;
	private String totalLatency;
	private String minLatency;
	private String avgLatency;
	private String maxLatency;
	private long threadId;
	private Long processlistId;

	public IoByThreadByLatencyId() {
	}

	public IoByThreadByLatencyId(long threadId) {
		this.threadId = threadId;
	}

	public IoByThreadByLatencyId(String user, BigDecimal total, String totalLatency, String minLatency,
			String avgLatency, String maxLatency, long threadId, Long processlistId) {
		this.user = user;
		this.total = total;
		this.totalLatency = totalLatency;
		this.minLatency = minLatency;
		this.avgLatency = avgLatency;
		this.maxLatency = maxLatency;
		this.threadId = threadId;
		this.processlistId = processlistId;
	}

	@Column(name = "user", length = 288)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "total", precision = 42, scale = 0)
	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Column(name = "total_latency", length = 65535)
	public String getTotalLatency() {
		return this.totalLatency;
	}

	public void setTotalLatency(String totalLatency) {
		this.totalLatency = totalLatency;
	}

	@Column(name = "min_latency", length = 65535)
	public String getMinLatency() {
		return this.minLatency;
	}

	public void setMinLatency(String minLatency) {
		this.minLatency = minLatency;
	}

	@Column(name = "avg_latency", length = 65535)
	public String getAvgLatency() {
		return this.avgLatency;
	}

	public void setAvgLatency(String avgLatency) {
		this.avgLatency = avgLatency;
	}

	@Column(name = "max_latency", length = 65535)
	public String getMaxLatency() {
		return this.maxLatency;
	}

	public void setMaxLatency(String maxLatency) {
		this.maxLatency = maxLatency;
	}

	@Column(name = "thread_id", nullable = false)
	public long getThreadId() {
		return this.threadId;
	}

	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}

	@Column(name = "processlist_id")
	public Long getProcesslistId() {
		return this.processlistId;
	}

	public void setProcesslistId(Long processlistId) {
		this.processlistId = processlistId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IoByThreadByLatencyId))
			return false;
		IoByThreadByLatencyId castOther = (IoByThreadByLatencyId) other;

		return ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
				&& this.getUser().equals(castOther.getUser())))
				&& ((this.getTotal() == castOther.getTotal()) || (this.getTotal() != null
						&& castOther.getTotal() != null && this.getTotal().equals(castOther.getTotal())))
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getMinLatency() == castOther.getMinLatency()) || (this.getMinLatency() != null
						&& castOther.getMinLatency() != null && this.getMinLatency().equals(castOther.getMinLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency()) || (this.getAvgLatency() != null
						&& castOther.getAvgLatency() != null && this.getAvgLatency().equals(castOther.getAvgLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency()) || (this.getMaxLatency() != null
						&& castOther.getMaxLatency() != null && this.getMaxLatency().equals(castOther.getMaxLatency())))
				&& (this.getThreadId() == castOther.getThreadId())
				&& ((this.getProcesslistId() == castOther.getProcesslistId())
						|| (this.getProcesslistId() != null && castOther.getProcesslistId() != null
								&& this.getProcesslistId().equals(castOther.getProcesslistId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getTotal() == null ? 0 : this.getTotal().hashCode());
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getMinLatency() == null ? 0 : this.getMinLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		result = 37 * result + (int) this.getThreadId();
		result = 37 * result + (getProcesslistId() == null ? 0 : this.getProcesslistId().hashCode());
		return result;
	}

}

// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StatementsWithRuntimesIn95thPercentileId generated by hbm2java
 */
@Embeddable
public class StatementsWithRuntimesIn95thPercentileId implements java.io.Serializable {

	private String query;
	private String db;
	private String fullScan;
	private long execCount;
	private long errCount;
	private long warnCount;
	private String totalLatency;
	private String maxLatency;
	private String avgLatency;
	private long rowsSent;
	private BigDecimal rowsSentAvg;
	private long rowsExamined;
	private BigDecimal rowsExaminedAvg;
	private Date firstSeen;
	private Date lastSeen;
	private String digest;

	public StatementsWithRuntimesIn95thPercentileId() {
	}

	public StatementsWithRuntimesIn95thPercentileId(String fullScan, long execCount, long errCount, long warnCount,
			long rowsSent, BigDecimal rowsSentAvg, long rowsExamined, BigDecimal rowsExaminedAvg, Date firstSeen,
			Date lastSeen) {
		this.fullScan = fullScan;
		this.execCount = execCount;
		this.errCount = errCount;
		this.warnCount = warnCount;
		this.rowsSent = rowsSent;
		this.rowsSentAvg = rowsSentAvg;
		this.rowsExamined = rowsExamined;
		this.rowsExaminedAvg = rowsExaminedAvg;
		this.firstSeen = firstSeen;
		this.lastSeen = lastSeen;
	}

	public StatementsWithRuntimesIn95thPercentileId(String query, String db, String fullScan, long execCount,
			long errCount, long warnCount, String totalLatency, String maxLatency, String avgLatency, long rowsSent,
			BigDecimal rowsSentAvg, long rowsExamined, BigDecimal rowsExaminedAvg, Date firstSeen, Date lastSeen,
			String digest) {
		this.query = query;
		this.db = db;
		this.fullScan = fullScan;
		this.execCount = execCount;
		this.errCount = errCount;
		this.warnCount = warnCount;
		this.totalLatency = totalLatency;
		this.maxLatency = maxLatency;
		this.avgLatency = avgLatency;
		this.rowsSent = rowsSent;
		this.rowsSentAvg = rowsSentAvg;
		this.rowsExamined = rowsExamined;
		this.rowsExaminedAvg = rowsExaminedAvg;
		this.firstSeen = firstSeen;
		this.lastSeen = lastSeen;
		this.digest = digest;
	}

	@Column(name = "query")
	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Column(name = "db", length = 64)
	public String getDb() {
		return this.db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	@Column(name = "full_scan", nullable = false, length = 1)
	public String getFullScan() {
		return this.fullScan;
	}

	public void setFullScan(String fullScan) {
		this.fullScan = fullScan;
	}

	@Column(name = "exec_count", nullable = false)
	public long getExecCount() {
		return this.execCount;
	}

	public void setExecCount(long execCount) {
		this.execCount = execCount;
	}

	@Column(name = "err_count", nullable = false)
	public long getErrCount() {
		return this.errCount;
	}

	public void setErrCount(long errCount) {
		this.errCount = errCount;
	}

	@Column(name = "warn_count", nullable = false)
	public long getWarnCount() {
		return this.warnCount;
	}

	public void setWarnCount(long warnCount) {
		this.warnCount = warnCount;
	}

	@Column(name = "total_latency", length = 65535)
	public String getTotalLatency() {
		return this.totalLatency;
	}

	public void setTotalLatency(String totalLatency) {
		this.totalLatency = totalLatency;
	}

	@Column(name = "max_latency", length = 65535)
	public String getMaxLatency() {
		return this.maxLatency;
	}

	public void setMaxLatency(String maxLatency) {
		this.maxLatency = maxLatency;
	}

	@Column(name = "avg_latency", length = 65535)
	public String getAvgLatency() {
		return this.avgLatency;
	}

	public void setAvgLatency(String avgLatency) {
		this.avgLatency = avgLatency;
	}

	@Column(name = "rows_sent", nullable = false)
	public long getRowsSent() {
		return this.rowsSent;
	}

	public void setRowsSent(long rowsSent) {
		this.rowsSent = rowsSent;
	}

	@Column(name = "rows_sent_avg", nullable = false, precision = 21, scale = 0)
	public BigDecimal getRowsSentAvg() {
		return this.rowsSentAvg;
	}

	public void setRowsSentAvg(BigDecimal rowsSentAvg) {
		this.rowsSentAvg = rowsSentAvg;
	}

	@Column(name = "rows_examined", nullable = false)
	public long getRowsExamined() {
		return this.rowsExamined;
	}

	public void setRowsExamined(long rowsExamined) {
		this.rowsExamined = rowsExamined;
	}

	@Column(name = "rows_examined_avg", nullable = false, precision = 21, scale = 0)
	public BigDecimal getRowsExaminedAvg() {
		return this.rowsExaminedAvg;
	}

	public void setRowsExaminedAvg(BigDecimal rowsExaminedAvg) {
		this.rowsExaminedAvg = rowsExaminedAvg;
	}

	@Column(name = "first_seen", nullable = false, length = 26)
	public Date getFirstSeen() {
		return this.firstSeen;
	}

	public void setFirstSeen(Date firstSeen) {
		this.firstSeen = firstSeen;
	}

	@Column(name = "last_seen", nullable = false, length = 26)
	public Date getLastSeen() {
		return this.lastSeen;
	}

	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	@Column(name = "digest", length = 64)
	public String getDigest() {
		return this.digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StatementsWithRuntimesIn95thPercentileId))
			return false;
		StatementsWithRuntimesIn95thPercentileId castOther = (StatementsWithRuntimesIn95thPercentileId) other;

		return ((this.getQuery() == castOther.getQuery()) || (this.getQuery() != null && castOther.getQuery() != null
				&& this.getQuery().equals(castOther.getQuery())))
				&& ((this.getDb() == castOther.getDb()) || (this.getDb() != null && castOther.getDb() != null
						&& this.getDb().equals(castOther.getDb())))
				&& ((this.getFullScan() == castOther.getFullScan()) || (this.getFullScan() != null
						&& castOther.getFullScan() != null && this.getFullScan().equals(castOther.getFullScan())))
				&& (this.getExecCount() == castOther.getExecCount()) && (this.getErrCount() == castOther.getErrCount())
				&& (this.getWarnCount() == castOther.getWarnCount())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency()) || (this.getMaxLatency() != null
						&& castOther.getMaxLatency() != null && this.getMaxLatency().equals(castOther.getMaxLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency()) || (this.getAvgLatency() != null
						&& castOther.getAvgLatency() != null && this.getAvgLatency().equals(castOther.getAvgLatency())))
				&& (this.getRowsSent() == castOther.getRowsSent())
				&& ((this.getRowsSentAvg() == castOther.getRowsSentAvg())
						|| (this.getRowsSentAvg() != null && castOther.getRowsSentAvg() != null
								&& this.getRowsSentAvg().equals(castOther.getRowsSentAvg())))
				&& (this.getRowsExamined() == castOther.getRowsExamined())
				&& ((this.getRowsExaminedAvg() == castOther.getRowsExaminedAvg())
						|| (this.getRowsExaminedAvg() != null && castOther.getRowsExaminedAvg() != null
								&& this.getRowsExaminedAvg().equals(castOther.getRowsExaminedAvg())))
				&& ((this.getFirstSeen() == castOther.getFirstSeen()) || (this.getFirstSeen() != null
						&& castOther.getFirstSeen() != null && this.getFirstSeen().equals(castOther.getFirstSeen())))
				&& ((this.getLastSeen() == castOther.getLastSeen()) || (this.getLastSeen() != null
						&& castOther.getLastSeen() != null && this.getLastSeen().equals(castOther.getLastSeen())))
				&& ((this.getDigest() == castOther.getDigest()) || (this.getDigest() != null
						&& castOther.getDigest() != null && this.getDigest().equals(castOther.getDigest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getQuery() == null ? 0 : this.getQuery().hashCode());
		result = 37 * result + (getDb() == null ? 0 : this.getDb().hashCode());
		result = 37 * result + (getFullScan() == null ? 0 : this.getFullScan().hashCode());
		result = 37 * result + (int) this.getExecCount();
		result = 37 * result + (int) this.getErrCount();
		result = 37 * result + (int) this.getWarnCount();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		result = 37 * result + (int) this.getRowsSent();
		result = 37 * result + (getRowsSentAvg() == null ? 0 : this.getRowsSentAvg().hashCode());
		result = 37 * result + (int) this.getRowsExamined();
		result = 37 * result + (getRowsExaminedAvg() == null ? 0 : this.getRowsExaminedAvg().hashCode());
		result = 37 * result + (getFirstSeen() == null ? 0 : this.getFirstSeen().hashCode());
		result = 37 * result + (getLastSeen() == null ? 0 : this.getLastSeen().hashCode());
		result = 37 * result + (getDigest() == null ? 0 : this.getDigest().hashCode());
		return result;
	}

}

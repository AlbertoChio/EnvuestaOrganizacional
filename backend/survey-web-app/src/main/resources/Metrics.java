// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Metrics generated by hbm2java
 */
@Entity
@Table(name = "metrics", catalog = "sys")
public class Metrics implements java.io.Serializable {

	private MetricsId id;

	public Metrics() {
	}

	public Metrics(MetricsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "variableName", column = @Column(name = "Variable_name", nullable = false, length = 193)),
			@AttributeOverride(name = "variableValue", column = @Column(name = "Variable_value", length = 65535)),
			@AttributeOverride(name = "type", column = @Column(name = "Type", nullable = false, length = 210)),
			@AttributeOverride(name = "enabled", column = @Column(name = "Enabled", nullable = false, length = 7)) })
	public MetricsId getId() {
		return this.id;
	}

	public void setId(MetricsId id) {
		this.id = id;
	}

}

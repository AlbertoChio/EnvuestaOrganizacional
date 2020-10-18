// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import X.psDigestAvgLatencyDistributionId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.psDigestAvgLatencyDistribution generated by hbm2java
 */
@Entity
@Table(name="x$ps_digest_avg_latency_distribution"
    ,catalog="sys"
)
public class X.psDigestAvgLatencyDistribution  implements java.io.Serializable {


     private X.psDigestAvgLatencyDistributionId id;

    public X.psDigestAvgLatencyDistribution() {
    }

    public X.psDigestAvgLatencyDistribution(X.psDigestAvgLatencyDistributionId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="cnt", column=@Column(name="cnt", nullable=false) ), 
        @AttributeOverride(name="avgUs", column=@Column(name="avg_us", precision=21, scale=0) ) } )
    public X.psDigestAvgLatencyDistributionId getId() {
        return this.id;
    }
    
    public void setId(X.psDigestAvgLatencyDistributionId id) {
        this.id = id;
    }




}



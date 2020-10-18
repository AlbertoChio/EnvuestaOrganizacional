// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import X.psDigest95thPercentileByAvgUsId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.psDigest95thPercentileByAvgUs generated by hbm2java
 */
@Entity
@Table(name="x$ps_digest_95th_percentile_by_avg_us"
    ,catalog="sys"
)
public class X.psDigest95thPercentileByAvgUs  implements java.io.Serializable {


     private X.psDigest95thPercentileByAvgUsId id;

    public X.psDigest95thPercentileByAvgUs() {
    }

    public X.psDigest95thPercentileByAvgUs(X.psDigest95thPercentileByAvgUsId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="avgUs", column=@Column(name="avg_us", precision=21, scale=0) ), 
        @AttributeOverride(name="percentile", column=@Column(name="percentile", nullable=false, precision=46, scale=4) ) } )
    public X.psDigest95thPercentileByAvgUsId getId() {
        return this.id;
    }
    
    public void setId(X.psDigest95thPercentileByAvgUsId id) {
        this.id = id;
    }




}


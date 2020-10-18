// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import X.waitsGlobalByLatencyId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.waitsGlobalByLatency generated by hbm2java
 */
@Entity
@Table(name="x$waits_global_by_latency"
    ,catalog="sys"
)
public class X.waitsGlobalByLatency  implements java.io.Serializable {


     private X.waitsGlobalByLatencyId id;

    public X.waitsGlobalByLatency() {
    }

    public X.waitsGlobalByLatency(X.waitsGlobalByLatencyId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="events", column=@Column(name="events", nullable=false, length=128) ), 
        @AttributeOverride(name="total", column=@Column(name="total", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="avgLatency", column=@Column(name="avg_latency", nullable=false) ), 
        @AttributeOverride(name="maxLatency", column=@Column(name="max_latency", nullable=false) ) } )
    public X.waitsGlobalByLatencyId getId() {
        return this.id;
    }
    
    public void setId(X.waitsGlobalByLatencyId id) {
        this.id = id;
    }




}



// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import X.waitsByUserByLatencyId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.waitsByUserByLatency generated by hbm2java
 */
@Entity
@Table(name="x$waits_by_user_by_latency"
    ,catalog="sys"
)
public class X.waitsByUserByLatency  implements java.io.Serializable {


     private X.waitsByUserByLatencyId id;

    public X.waitsByUserByLatency() {
    }

    public X.waitsByUserByLatency(X.waitsByUserByLatencyId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="user", column=@Column(name="user", length=32) ), 
        @AttributeOverride(name="event", column=@Column(name="event", nullable=false, length=128) ), 
        @AttributeOverride(name="total", column=@Column(name="total", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="avgLatency", column=@Column(name="avg_latency", nullable=false) ), 
        @AttributeOverride(name="maxLatency", column=@Column(name="max_latency", nullable=false) ) } )
    public X.waitsByUserByLatencyId getId() {
        return this.id;
    }
    
    public void setId(X.waitsByUserByLatencyId id) {
        this.id = id;
    }




}



// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import X.ioByThreadByLatencyId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.ioByThreadByLatency generated by hbm2java
 */
@Entity
@Table(name="x$io_by_thread_by_latency"
    ,catalog="sys"
)
public class X.ioByThreadByLatency  implements java.io.Serializable {


     private X.ioByThreadByLatencyId id;

    public X.ioByThreadByLatency() {
    }

    public X.ioByThreadByLatency(X.ioByThreadByLatencyId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="user", column=@Column(name="user", length=288) ), 
        @AttributeOverride(name="total", column=@Column(name="total", precision=42, scale=0) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", precision=42, scale=0) ), 
        @AttributeOverride(name="minLatency", column=@Column(name="min_latency") ), 
        @AttributeOverride(name="avgLatency", column=@Column(name="avg_latency", precision=24, scale=4) ), 
        @AttributeOverride(name="maxLatency", column=@Column(name="max_latency") ), 
        @AttributeOverride(name="threadId", column=@Column(name="thread_id", nullable=false) ), 
        @AttributeOverride(name="processlistId", column=@Column(name="processlist_id") ) } )
    public X.ioByThreadByLatencyId getId() {
        return this.id;
    }
    
    public void setId(X.ioByThreadByLatencyId id) {
        this.id = id;
    }




}



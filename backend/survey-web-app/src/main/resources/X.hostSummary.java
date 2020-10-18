// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import X.hostSummaryId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.hostSummary generated by hbm2java
 */
@Entity
@Table(name="x$host_summary"
    ,catalog="sys"
)
public class X.hostSummary  implements java.io.Serializable {


     private X.hostSummaryId id;

    public X.hostSummary() {
    }

    public X.hostSummary(X.hostSummaryId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="host") ), 
        @AttributeOverride(name="statements", column=@Column(name="statements", precision=64, scale=0) ), 
        @AttributeOverride(name="statementLatency", column=@Column(name="statement_latency", precision=64, scale=0) ), 
        @AttributeOverride(name="statementAvgLatency", column=@Column(name="statement_avg_latency", precision=65, scale=4) ), 
        @AttributeOverride(name="tableScans", column=@Column(name="table_scans", precision=65, scale=0) ), 
        @AttributeOverride(name="fileIos", column=@Column(name="file_ios", precision=64, scale=0) ), 
        @AttributeOverride(name="fileIoLatency", column=@Column(name="file_io_latency", precision=64, scale=0) ), 
        @AttributeOverride(name="currentConnections", column=@Column(name="current_connections", precision=41, scale=0) ), 
        @AttributeOverride(name="totalConnections", column=@Column(name="total_connections", precision=41, scale=0) ), 
        @AttributeOverride(name="uniqueUsers", column=@Column(name="unique_users", nullable=false) ), 
        @AttributeOverride(name="currentMemory", column=@Column(name="current_memory", precision=63, scale=0) ), 
        @AttributeOverride(name="totalMemoryAllocated", column=@Column(name="total_memory_allocated", precision=64, scale=0) ) } )
    public X.hostSummaryId getId() {
        return this.id;
    }
    
    public void setId(X.hostSummaryId id) {
        this.id = id;
    }




}



// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import X.memoryByUserByCurrentBytesId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.memoryByUserByCurrentBytes generated by hbm2java
 */
@Entity
@Table(name="x$memory_by_user_by_current_bytes"
    ,catalog="sys"
)
public class X.memoryByUserByCurrentBytes  implements java.io.Serializable {


     private X.memoryByUserByCurrentBytesId id;

    public X.memoryByUserByCurrentBytes() {
    }

    public X.memoryByUserByCurrentBytes(X.memoryByUserByCurrentBytesId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="user", column=@Column(name="user", length=32) ), 
        @AttributeOverride(name="currentCountUsed", column=@Column(name="current_count_used", precision=41, scale=0) ), 
        @AttributeOverride(name="currentAllocated", column=@Column(name="current_allocated", precision=41, scale=0) ), 
        @AttributeOverride(name="currentAvgAlloc", column=@Column(name="current_avg_alloc", nullable=false, precision=45, scale=4) ), 
        @AttributeOverride(name="currentMaxAlloc", column=@Column(name="current_max_alloc") ), 
        @AttributeOverride(name="totalAllocated", column=@Column(name="total_allocated", precision=42, scale=0) ) } )
    public X.memoryByUserByCurrentBytesId getId() {
        return this.id;
    }
    
    public void setId(X.memoryByUserByCurrentBytesId id) {
        this.id = id;
    }




}



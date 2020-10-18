// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.userSummaryByStatementLatencyId generated by hbm2java
 */
@Embeddable
public class X.userSummaryByStatementLatencyId  implements java.io.Serializable {


     private String user;
     private BigDecimal total;
     private BigDecimal totalLatency;
     private BigDecimal maxLatency;
     private BigDecimal lockLatency;
     private BigDecimal rowsSent;
     private BigDecimal rowsExamined;
     private BigDecimal rowsAffected;
     private BigDecimal fullScans;

    public X.userSummaryByStatementLatencyId() {
    }

    public X.userSummaryByStatementLatencyId(String user, BigDecimal total, BigDecimal totalLatency, BigDecimal maxLatency, BigDecimal lockLatency, BigDecimal rowsSent, BigDecimal rowsExamined, BigDecimal rowsAffected, BigDecimal fullScans) {
       this.user = user;
       this.total = total;
       this.totalLatency = totalLatency;
       this.maxLatency = maxLatency;
       this.lockLatency = lockLatency;
       this.rowsSent = rowsSent;
       this.rowsExamined = rowsExamined;
       this.rowsAffected = rowsAffected;
       this.fullScans = fullScans;
    }
   


    @Column(name="user", length=32)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }


    @Column(name="total", precision=42, scale=0)
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }


    @Column(name="total_latency", precision=42, scale=0)
    public BigDecimal getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(BigDecimal totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="max_latency", precision=42, scale=0)
    public BigDecimal getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(BigDecimal maxLatency) {
        this.maxLatency = maxLatency;
    }


    @Column(name="lock_latency", precision=42, scale=0)
    public BigDecimal getLockLatency() {
        return this.lockLatency;
    }
    
    public void setLockLatency(BigDecimal lockLatency) {
        this.lockLatency = lockLatency;
    }


    @Column(name="rows_sent", precision=42, scale=0)
    public BigDecimal getRowsSent() {
        return this.rowsSent;
    }
    
    public void setRowsSent(BigDecimal rowsSent) {
        this.rowsSent = rowsSent;
    }


    @Column(name="rows_examined", precision=42, scale=0)
    public BigDecimal getRowsExamined() {
        return this.rowsExamined;
    }
    
    public void setRowsExamined(BigDecimal rowsExamined) {
        this.rowsExamined = rowsExamined;
    }


    @Column(name="rows_affected", precision=42, scale=0)
    public BigDecimal getRowsAffected() {
        return this.rowsAffected;
    }
    
    public void setRowsAffected(BigDecimal rowsAffected) {
        this.rowsAffected = rowsAffected;
    }


    @Column(name="full_scans", precision=43, scale=0)
    public BigDecimal getFullScans() {
        return this.fullScans;
    }
    
    public void setFullScans(BigDecimal fullScans) {
        this.fullScans = fullScans;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.userSummaryByStatementLatencyId) ) return false;
		 X.userSummaryByStatementLatencyId castOther = ( X.userSummaryByStatementLatencyId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getTotal()==castOther.getTotal()) || ( this.getTotal()!=null && castOther.getTotal()!=null && this.getTotal().equals(castOther.getTotal()) ) )
 && ( (this.getTotalLatency()==castOther.getTotalLatency()) || ( this.getTotalLatency()!=null && castOther.getTotalLatency()!=null && this.getTotalLatency().equals(castOther.getTotalLatency()) ) )
 && ( (this.getMaxLatency()==castOther.getMaxLatency()) || ( this.getMaxLatency()!=null && castOther.getMaxLatency()!=null && this.getMaxLatency().equals(castOther.getMaxLatency()) ) )
 && ( (this.getLockLatency()==castOther.getLockLatency()) || ( this.getLockLatency()!=null && castOther.getLockLatency()!=null && this.getLockLatency().equals(castOther.getLockLatency()) ) )
 && ( (this.getRowsSent()==castOther.getRowsSent()) || ( this.getRowsSent()!=null && castOther.getRowsSent()!=null && this.getRowsSent().equals(castOther.getRowsSent()) ) )
 && ( (this.getRowsExamined()==castOther.getRowsExamined()) || ( this.getRowsExamined()!=null && castOther.getRowsExamined()!=null && this.getRowsExamined().equals(castOther.getRowsExamined()) ) )
 && ( (this.getRowsAffected()==castOther.getRowsAffected()) || ( this.getRowsAffected()!=null && castOther.getRowsAffected()!=null && this.getRowsAffected().equals(castOther.getRowsAffected()) ) )
 && ( (this.getFullScans()==castOther.getFullScans()) || ( this.getFullScans()!=null && castOther.getFullScans()!=null && this.getFullScans().equals(castOther.getFullScans()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getTotal() == null ? 0 : this.getTotal().hashCode() );
         result = 37 * result + ( getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode() );
         result = 37 * result + ( getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode() );
         result = 37 * result + ( getLockLatency() == null ? 0 : this.getLockLatency().hashCode() );
         result = 37 * result + ( getRowsSent() == null ? 0 : this.getRowsSent().hashCode() );
         result = 37 * result + ( getRowsExamined() == null ? 0 : this.getRowsExamined().hashCode() );
         result = 37 * result + ( getRowsAffected() == null ? 0 : this.getRowsAffected().hashCode() );
         result = 37 * result + ( getFullScans() == null ? 0 : this.getFullScans().hashCode() );
         return result;
   }   


}



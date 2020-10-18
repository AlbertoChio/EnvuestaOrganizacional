// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.userSummaryId generated by hbm2java
 */
@Embeddable
public class X.userSummaryId  implements java.io.Serializable {


     private String user;
     private BigDecimal statements;
     private BigDecimal statementLatency;
     private BigDecimal statementAvgLatency;
     private BigDecimal tableScans;
     private BigDecimal fileIos;
     private BigDecimal fileIoLatency;
     private BigDecimal currentConnections;
     private BigDecimal totalConnections;
     private long uniqueHosts;
     private BigDecimal currentMemory;
     private BigDecimal totalMemoryAllocated;

    public X.userSummaryId() {
    }

	
    public X.userSummaryId(BigDecimal statementAvgLatency, long uniqueHosts) {
        this.statementAvgLatency = statementAvgLatency;
        this.uniqueHosts = uniqueHosts;
    }
    public X.userSummaryId(String user, BigDecimal statements, BigDecimal statementLatency, BigDecimal statementAvgLatency, BigDecimal tableScans, BigDecimal fileIos, BigDecimal fileIoLatency, BigDecimal currentConnections, BigDecimal totalConnections, long uniqueHosts, BigDecimal currentMemory, BigDecimal totalMemoryAllocated) {
       this.user = user;
       this.statements = statements;
       this.statementLatency = statementLatency;
       this.statementAvgLatency = statementAvgLatency;
       this.tableScans = tableScans;
       this.fileIos = fileIos;
       this.fileIoLatency = fileIoLatency;
       this.currentConnections = currentConnections;
       this.totalConnections = totalConnections;
       this.uniqueHosts = uniqueHosts;
       this.currentMemory = currentMemory;
       this.totalMemoryAllocated = totalMemoryAllocated;
    }
   


    @Column(name="user", length=32)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }


    @Column(name="statements", precision=64, scale=0)
    public BigDecimal getStatements() {
        return this.statements;
    }
    
    public void setStatements(BigDecimal statements) {
        this.statements = statements;
    }


    @Column(name="statement_latency", precision=64, scale=0)
    public BigDecimal getStatementLatency() {
        return this.statementLatency;
    }
    
    public void setStatementLatency(BigDecimal statementLatency) {
        this.statementLatency = statementLatency;
    }


    @Column(name="statement_avg_latency", nullable=false, precision=65, scale=4)
    public BigDecimal getStatementAvgLatency() {
        return this.statementAvgLatency;
    }
    
    public void setStatementAvgLatency(BigDecimal statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }


    @Column(name="table_scans", precision=65, scale=0)
    public BigDecimal getTableScans() {
        return this.tableScans;
    }
    
    public void setTableScans(BigDecimal tableScans) {
        this.tableScans = tableScans;
    }


    @Column(name="file_ios", precision=64, scale=0)
    public BigDecimal getFileIos() {
        return this.fileIos;
    }
    
    public void setFileIos(BigDecimal fileIos) {
        this.fileIos = fileIos;
    }


    @Column(name="file_io_latency", precision=64, scale=0)
    public BigDecimal getFileIoLatency() {
        return this.fileIoLatency;
    }
    
    public void setFileIoLatency(BigDecimal fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }


    @Column(name="current_connections", precision=41, scale=0)
    public BigDecimal getCurrentConnections() {
        return this.currentConnections;
    }
    
    public void setCurrentConnections(BigDecimal currentConnections) {
        this.currentConnections = currentConnections;
    }


    @Column(name="total_connections", precision=41, scale=0)
    public BigDecimal getTotalConnections() {
        return this.totalConnections;
    }
    
    public void setTotalConnections(BigDecimal totalConnections) {
        this.totalConnections = totalConnections;
    }


    @Column(name="unique_hosts", nullable=false)
    public long getUniqueHosts() {
        return this.uniqueHosts;
    }
    
    public void setUniqueHosts(long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
    }


    @Column(name="current_memory", precision=63, scale=0)
    public BigDecimal getCurrentMemory() {
        return this.currentMemory;
    }
    
    public void setCurrentMemory(BigDecimal currentMemory) {
        this.currentMemory = currentMemory;
    }


    @Column(name="total_memory_allocated", precision=64, scale=0)
    public BigDecimal getTotalMemoryAllocated() {
        return this.totalMemoryAllocated;
    }
    
    public void setTotalMemoryAllocated(BigDecimal totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.userSummaryId) ) return false;
		 X.userSummaryId castOther = ( X.userSummaryId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getStatements()==castOther.getStatements()) || ( this.getStatements()!=null && castOther.getStatements()!=null && this.getStatements().equals(castOther.getStatements()) ) )
 && ( (this.getStatementLatency()==castOther.getStatementLatency()) || ( this.getStatementLatency()!=null && castOther.getStatementLatency()!=null && this.getStatementLatency().equals(castOther.getStatementLatency()) ) )
 && ( (this.getStatementAvgLatency()==castOther.getStatementAvgLatency()) || ( this.getStatementAvgLatency()!=null && castOther.getStatementAvgLatency()!=null && this.getStatementAvgLatency().equals(castOther.getStatementAvgLatency()) ) )
 && ( (this.getTableScans()==castOther.getTableScans()) || ( this.getTableScans()!=null && castOther.getTableScans()!=null && this.getTableScans().equals(castOther.getTableScans()) ) )
 && ( (this.getFileIos()==castOther.getFileIos()) || ( this.getFileIos()!=null && castOther.getFileIos()!=null && this.getFileIos().equals(castOther.getFileIos()) ) )
 && ( (this.getFileIoLatency()==castOther.getFileIoLatency()) || ( this.getFileIoLatency()!=null && castOther.getFileIoLatency()!=null && this.getFileIoLatency().equals(castOther.getFileIoLatency()) ) )
 && ( (this.getCurrentConnections()==castOther.getCurrentConnections()) || ( this.getCurrentConnections()!=null && castOther.getCurrentConnections()!=null && this.getCurrentConnections().equals(castOther.getCurrentConnections()) ) )
 && ( (this.getTotalConnections()==castOther.getTotalConnections()) || ( this.getTotalConnections()!=null && castOther.getTotalConnections()!=null && this.getTotalConnections().equals(castOther.getTotalConnections()) ) )
 && (this.getUniqueHosts()==castOther.getUniqueHosts())
 && ( (this.getCurrentMemory()==castOther.getCurrentMemory()) || ( this.getCurrentMemory()!=null && castOther.getCurrentMemory()!=null && this.getCurrentMemory().equals(castOther.getCurrentMemory()) ) )
 && ( (this.getTotalMemoryAllocated()==castOther.getTotalMemoryAllocated()) || ( this.getTotalMemoryAllocated()!=null && castOther.getTotalMemoryAllocated()!=null && this.getTotalMemoryAllocated().equals(castOther.getTotalMemoryAllocated()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getStatements() == null ? 0 : this.getStatements().hashCode() );
         result = 37 * result + ( getStatementLatency() == null ? 0 : this.getStatementLatency().hashCode() );
         result = 37 * result + ( getStatementAvgLatency() == null ? 0 : this.getStatementAvgLatency().hashCode() );
         result = 37 * result + ( getTableScans() == null ? 0 : this.getTableScans().hashCode() );
         result = 37 * result + ( getFileIos() == null ? 0 : this.getFileIos().hashCode() );
         result = 37 * result + ( getFileIoLatency() == null ? 0 : this.getFileIoLatency().hashCode() );
         result = 37 * result + ( getCurrentConnections() == null ? 0 : this.getCurrentConnections().hashCode() );
         result = 37 * result + ( getTotalConnections() == null ? 0 : this.getTotalConnections().hashCode() );
         result = 37 * result + (int) this.getUniqueHosts();
         result = 37 * result + ( getCurrentMemory() == null ? 0 : this.getCurrentMemory().hashCode() );
         result = 37 * result + ( getTotalMemoryAllocated() == null ? 0 : this.getTotalMemoryAllocated().hashCode() );
         return result;
   }   


}



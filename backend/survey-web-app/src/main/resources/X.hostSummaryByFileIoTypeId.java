// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.hostSummaryByFileIoTypeId generated by hbm2java
 */
@Embeddable
public class X.hostSummaryByFileIoTypeId  implements java.io.Serializable {


     private String host;
     private String eventName;
     private long total;
     private long totalLatency;
     private long maxLatency;

    public X.hostSummaryByFileIoTypeId() {
    }

	
    public X.hostSummaryByFileIoTypeId(String eventName, long total, long totalLatency, long maxLatency) {
        this.eventName = eventName;
        this.total = total;
        this.totalLatency = totalLatency;
        this.maxLatency = maxLatency;
    }
    public X.hostSummaryByFileIoTypeId(String host, String eventName, long total, long totalLatency, long maxLatency) {
       this.host = host;
       this.eventName = eventName;
       this.total = total;
       this.totalLatency = totalLatency;
       this.maxLatency = maxLatency;
    }
   


    @Column(name="host")
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }


    @Column(name="event_name", nullable=false, length=128)
    public String getEventName() {
        return this.eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    @Column(name="total", nullable=false)
    public long getTotal() {
        return this.total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }


    @Column(name="total_latency", nullable=false)
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="max_latency", nullable=false)
    public long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.hostSummaryByFileIoTypeId) ) return false;
		 X.hostSummaryByFileIoTypeId castOther = ( X.hostSummaryByFileIoTypeId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getEventName()==castOther.getEventName()) || ( this.getEventName()!=null && castOther.getEventName()!=null && this.getEventName().equals(castOther.getEventName()) ) )
 && (this.getTotal()==castOther.getTotal())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getMaxLatency()==castOther.getMaxLatency());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getEventName() == null ? 0 : this.getEventName().hashCode() );
         result = 37 * result + (int) this.getTotal();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getMaxLatency();
         return result;
   }   


}



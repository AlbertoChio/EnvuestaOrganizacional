// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.hostSummaryByFileIoId generated by hbm2java
 */
@Embeddable
public class X.hostSummaryByFileIoId  implements java.io.Serializable {


     private String host;
     private BigDecimal ios;
     private BigDecimal ioLatency;

    public X.hostSummaryByFileIoId() {
    }

    public X.hostSummaryByFileIoId(String host, BigDecimal ios, BigDecimal ioLatency) {
       this.host = host;
       this.ios = ios;
       this.ioLatency = ioLatency;
    }
   


    @Column(name="host")
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }


    @Column(name="ios", precision=42, scale=0)
    public BigDecimal getIos() {
        return this.ios;
    }
    
    public void setIos(BigDecimal ios) {
        this.ios = ios;
    }


    @Column(name="io_latency", precision=42, scale=0)
    public BigDecimal getIoLatency() {
        return this.ioLatency;
    }
    
    public void setIoLatency(BigDecimal ioLatency) {
        this.ioLatency = ioLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.hostSummaryByFileIoId) ) return false;
		 X.hostSummaryByFileIoId castOther = ( X.hostSummaryByFileIoId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getIos()==castOther.getIos()) || ( this.getIos()!=null && castOther.getIos()!=null && this.getIos().equals(castOther.getIos()) ) )
 && ( (this.getIoLatency()==castOther.getIoLatency()) || ( this.getIoLatency()!=null && castOther.getIoLatency()!=null && this.getIoLatency().equals(castOther.getIoLatency()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getIos() == null ? 0 : this.getIos().hashCode() );
         result = 37 * result + ( getIoLatency() == null ? 0 : this.getIoLatency().hashCode() );
         return result;
   }   


}



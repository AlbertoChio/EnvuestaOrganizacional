// default package
// Generated 15 oct 2020 12:48:45 by Hibernate Tools 5.1.10.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.innodbBufferStatsByTableId generated by hbm2java
 */
@Embeddable
public class X.innodbBufferStatsByTableId  implements java.io.Serializable {


     private String objectSchema;
     private String objectName;
     private BigDecimal allocated;
     private BigDecimal data;
     private long pages;
     private long pagesHashed;
     private long pagesOld;
     private BigDecimal rowsCached;

    public X.innodbBufferStatsByTableId() {
    }

	
    public X.innodbBufferStatsByTableId(long pages, long pagesHashed, long pagesOld, BigDecimal rowsCached) {
        this.pages = pages;
        this.pagesHashed = pagesHashed;
        this.pagesOld = pagesOld;
        this.rowsCached = rowsCached;
    }
    public X.innodbBufferStatsByTableId(String objectSchema, String objectName, BigDecimal allocated, BigDecimal data, long pages, long pagesHashed, long pagesOld, BigDecimal rowsCached) {
       this.objectSchema = objectSchema;
       this.objectName = objectName;
       this.allocated = allocated;
       this.data = data;
       this.pages = pages;
       this.pagesHashed = pagesHashed;
       this.pagesOld = pagesOld;
       this.rowsCached = rowsCached;
    }
   


    @Column(name="object_schema", length=65535)
    public String getObjectSchema() {
        return this.objectSchema;
    }
    
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }


    @Column(name="object_name", length=65535)
    public String getObjectName() {
        return this.objectName;
    }
    
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }


    @Column(name="allocated", precision=43, scale=0)
    public BigDecimal getAllocated() {
        return this.allocated;
    }
    
    public void setAllocated(BigDecimal allocated) {
        this.allocated = allocated;
    }


    @Column(name="data", precision=43, scale=0)
    public BigDecimal getData() {
        return this.data;
    }
    
    public void setData(BigDecimal data) {
        this.data = data;
    }


    @Column(name="pages", nullable=false)
    public long getPages() {
        return this.pages;
    }
    
    public void setPages(long pages) {
        this.pages = pages;
    }


    @Column(name="pages_hashed", nullable=false)
    public long getPagesHashed() {
        return this.pagesHashed;
    }
    
    public void setPagesHashed(long pagesHashed) {
        this.pagesHashed = pagesHashed;
    }


    @Column(name="pages_old", nullable=false)
    public long getPagesOld() {
        return this.pagesOld;
    }
    
    public void setPagesOld(long pagesOld) {
        this.pagesOld = pagesOld;
    }


    @Column(name="rows_cached", nullable=false, precision=44, scale=0)
    public BigDecimal getRowsCached() {
        return this.rowsCached;
    }
    
    public void setRowsCached(BigDecimal rowsCached) {
        this.rowsCached = rowsCached;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.innodbBufferStatsByTableId) ) return false;
		 X.innodbBufferStatsByTableId castOther = ( X.innodbBufferStatsByTableId ) other; 
         
		 return ( (this.getObjectSchema()==castOther.getObjectSchema()) || ( this.getObjectSchema()!=null && castOther.getObjectSchema()!=null && this.getObjectSchema().equals(castOther.getObjectSchema()) ) )
 && ( (this.getObjectName()==castOther.getObjectName()) || ( this.getObjectName()!=null && castOther.getObjectName()!=null && this.getObjectName().equals(castOther.getObjectName()) ) )
 && ( (this.getAllocated()==castOther.getAllocated()) || ( this.getAllocated()!=null && castOther.getAllocated()!=null && this.getAllocated().equals(castOther.getAllocated()) ) )
 && ( (this.getData()==castOther.getData()) || ( this.getData()!=null && castOther.getData()!=null && this.getData().equals(castOther.getData()) ) )
 && (this.getPages()==castOther.getPages())
 && (this.getPagesHashed()==castOther.getPagesHashed())
 && (this.getPagesOld()==castOther.getPagesOld())
 && ( (this.getRowsCached()==castOther.getRowsCached()) || ( this.getRowsCached()!=null && castOther.getRowsCached()!=null && this.getRowsCached().equals(castOther.getRowsCached()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getObjectSchema() == null ? 0 : this.getObjectSchema().hashCode() );
         result = 37 * result + ( getObjectName() == null ? 0 : this.getObjectName().hashCode() );
         result = 37 * result + ( getAllocated() == null ? 0 : this.getAllocated().hashCode() );
         result = 37 * result + ( getData() == null ? 0 : this.getData().hashCode() );
         result = 37 * result + (int) this.getPages();
         result = 37 * result + (int) this.getPagesHashed();
         result = 37 * result + (int) this.getPagesOld();
         result = 37 * result + ( getRowsCached() == null ? 0 : this.getRowsCached().hashCode() );
         return result;
   }   


}



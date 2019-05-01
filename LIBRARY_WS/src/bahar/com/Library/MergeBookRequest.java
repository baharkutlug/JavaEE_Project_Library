/**
 * MergeBookRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bahar.com.Library;

public class MergeBookRequest  implements java.io.Serializable {
    private long idx;

    private java.lang.String name;

    private java.lang.String orjName;

    private java.lang.String author;

    private java.lang.String translator;

    private int publishYear;

    private java.lang.String publisher;

    private java.lang.String bookType;

    private int numOfPages;

    public MergeBookRequest() {
    }

    public MergeBookRequest(
           long idx,
           java.lang.String name,
           java.lang.String orjName,
           java.lang.String author,
           java.lang.String translator,
           int publishYear,
           java.lang.String publisher,
           java.lang.String bookType,
           int numOfPages) {
           this.idx = idx;
           this.name = name;
           this.orjName = orjName;
           this.author = author;
           this.translator = translator;
           this.publishYear = publishYear;
           this.publisher = publisher;
           this.bookType = bookType;
           this.numOfPages = numOfPages;
    }


    /**
     * Gets the idx value for this MergeBookRequest.
     * 
     * @return idx
     */
    public long getIdx() {
        return idx;
    }


    /**
     * Sets the idx value for this MergeBookRequest.
     * 
     * @param idx
     */
    public void setIdx(long idx) {
        this.idx = idx;
    }


    /**
     * Gets the name value for this MergeBookRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MergeBookRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the orjName value for this MergeBookRequest.
     * 
     * @return orjName
     */
    public java.lang.String getOrjName() {
        return orjName;
    }


    /**
     * Sets the orjName value for this MergeBookRequest.
     * 
     * @param orjName
     */
    public void setOrjName(java.lang.String orjName) {
        this.orjName = orjName;
    }


    /**
     * Gets the author value for this MergeBookRequest.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this MergeBookRequest.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }


    /**
     * Gets the translator value for this MergeBookRequest.
     * 
     * @return translator
     */
    public java.lang.String getTranslator() {
        return translator;
    }


    /**
     * Sets the translator value for this MergeBookRequest.
     * 
     * @param translator
     */
    public void setTranslator(java.lang.String translator) {
        this.translator = translator;
    }


    /**
     * Gets the publishYear value for this MergeBookRequest.
     * 
     * @return publishYear
     */
    public int getPublishYear() {
        return publishYear;
    }


    /**
     * Sets the publishYear value for this MergeBookRequest.
     * 
     * @param publishYear
     */
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }


    /**
     * Gets the publisher value for this MergeBookRequest.
     * 
     * @return publisher
     */
    public java.lang.String getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this MergeBookRequest.
     * 
     * @param publisher
     */
    public void setPublisher(java.lang.String publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the bookType value for this MergeBookRequest.
     * 
     * @return bookType
     */
    public java.lang.String getBookType() {
        return bookType;
    }


    /**
     * Sets the bookType value for this MergeBookRequest.
     * 
     * @param bookType
     */
    public void setBookType(java.lang.String bookType) {
        this.bookType = bookType;
    }


    /**
     * Gets the numOfPages value for this MergeBookRequest.
     * 
     * @return numOfPages
     */
    public int getNumOfPages() {
        return numOfPages;
    }


    /**
     * Sets the numOfPages value for this MergeBookRequest.
     * 
     * @param numOfPages
     */
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MergeBookRequest)) return false;
        MergeBookRequest other = (MergeBookRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idx == other.getIdx() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.orjName==null && other.getOrjName()==null) || 
             (this.orjName!=null &&
              this.orjName.equals(other.getOrjName()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.translator==null && other.getTranslator()==null) || 
             (this.translator!=null &&
              this.translator.equals(other.getTranslator()))) &&
            this.publishYear == other.getPublishYear() &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.bookType==null && other.getBookType()==null) || 
             (this.bookType!=null &&
              this.bookType.equals(other.getBookType()))) &&
            this.numOfPages == other.getNumOfPages();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getIdx()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOrjName() != null) {
            _hashCode += getOrjName().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getTranslator() != null) {
            _hashCode += getTranslator().hashCode();
        }
        _hashCode += getPublishYear();
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getBookType() != null) {
            _hashCode += getBookType().hashCode();
        }
        _hashCode += getNumOfPages();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MergeBookRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.bahar/Library", ">mergeBookRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orjName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orjName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publishYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfPages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numOfPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

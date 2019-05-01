/**
 * FindBooksByNameRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bahar.com.Library;

public class FindBooksByNameRequest  implements java.io.Serializable {
    private java.lang.String bookName;

    public FindBooksByNameRequest() {
    }

    public FindBooksByNameRequest(
           java.lang.String bookName) {
           this.bookName = bookName;
    }


    /**
     * Gets the bookName value for this FindBooksByNameRequest.
     * 
     * @return bookName
     */
    public java.lang.String getBookName() {
        return bookName;
    }


    /**
     * Sets the bookName value for this FindBooksByNameRequest.
     * 
     * @param bookName
     */
    public void setBookName(java.lang.String bookName) {
        this.bookName = bookName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindBooksByNameRequest)) return false;
        FindBooksByNameRequest other = (FindBooksByNameRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookName==null && other.getBookName()==null) || 
             (this.bookName!=null &&
              this.bookName.equals(other.getBookName())));
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
        if (getBookName() != null) {
            _hashCode += getBookName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindBooksByNameRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

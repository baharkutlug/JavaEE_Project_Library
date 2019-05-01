/**
 * LibraryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bahar.com.Library;

public interface LibraryService extends javax.xml.rpc.Service {
    public java.lang.String getLibraryPortAddress();

    public bahar.com.Library.LibraryPortType getLibraryPort() throws javax.xml.rpc.ServiceException;

    public bahar.com.Library.LibraryPortType getLibraryPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

/**
 * LibraryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bahar.com.Library;

public class LibraryServiceLocator extends org.apache.axis.client.Service implements bahar.com.Library.LibraryService {

    public LibraryServiceLocator() {
    }


    public LibraryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LibraryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LibraryPort
    private java.lang.String LibraryPort_address = "http://localhost:7001/LibraryService/LibraryPortTypeBean";

    public java.lang.String getLibraryPortAddress() {
        return LibraryPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LibraryPortWSDDServiceName = "LibraryPort";

    public java.lang.String getLibraryPortWSDDServiceName() {
        return LibraryPortWSDDServiceName;
    }

    public void setLibraryPortWSDDServiceName(java.lang.String name) {
        LibraryPortWSDDServiceName = name;
    }

    public bahar.com.Library.LibraryPortType getLibraryPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LibraryPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLibraryPort(endpoint);
    }

    public bahar.com.Library.LibraryPortType getLibraryPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bahar.com.Library.LibrarySoapBindingStub _stub = new bahar.com.Library.LibrarySoapBindingStub(portAddress, this);
            _stub.setPortName(getLibraryPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLibraryPortEndpointAddress(java.lang.String address) {
        LibraryPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bahar.com.Library.LibraryPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                bahar.com.Library.LibrarySoapBindingStub _stub = new bahar.com.Library.LibrarySoapBindingStub(new java.net.URL(LibraryPort_address), this);
                _stub.setPortName(getLibraryPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LibraryPort".equals(inputPortName)) {
            return getLibraryPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com.bahar/Library", "LibraryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com.bahar/Library", "LibraryPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LibraryPort".equals(portName)) {
            setLibraryPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

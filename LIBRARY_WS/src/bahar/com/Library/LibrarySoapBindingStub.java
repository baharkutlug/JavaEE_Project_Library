/**
 * LibrarySoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bahar.com.Library;

public class LibrarySoapBindingStub extends org.apache.axis.client.Stub implements bahar.com.Library.LibraryPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findBooksByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByNameRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameRequest"), bahar.com.Library.FindBooksByNameRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameResponse"));
        oper.setReturnClass(bahar.com.Library.FindBooksByNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByNameResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findBooksByAuthor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByAuthorRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByAuthorRequest"), bahar.com.Library.FindBooksByAuthorRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameResponse"));
        oper.setReturnClass(bahar.com.Library.FindBooksByNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByNameResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findBooksByIDX");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByIDXRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByIDXRequest"), bahar.com.Library.FindBooksByIDXRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByIDXResponse"));
        oper.setReturnClass(bahar.com.Library.FindBooksByIDXResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByIDXResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveBook");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "saveBookRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">saveBookRequest"), bahar.com.Library.SaveBookRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">saveBookResponse"));
        oper.setReturnClass(bahar.com.Library.SaveBookResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com.bahar/Library", "saveBookResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mergeBook");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "mergeBookRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">mergeBookRequest"), bahar.com.Library.MergeBookRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">mergeBookResponse"));
        oper.setReturnClass(bahar.com.Library.MergeBookResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://com.bahar/Library", "mergeBookResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public LibrarySoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LibrarySoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LibrarySoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByAuthorRequest");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.FindBooksByAuthorRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByIDXRequest");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.FindBooksByIDXRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByIDXResponse");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.FindBooksByIDXResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameRequest");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.FindBooksByNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameResponse");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.FindBooksByNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">mergeBookRequest");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.MergeBookRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">mergeBookResponse");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.MergeBookResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">saveBookRequest");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.SaveBookRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", ">saveBookResponse");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.SaveBookResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://com.bahar/Library", "libBookList");
            cachedSerQNames.add(qName);
            cls = bahar.com.Library.LibBookList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public bahar.com.Library.FindBooksByNameResponse findBooksByName(bahar.com.Library.FindBooksByNameRequest parameter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("findBooksByName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "findBooksByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bahar.com.Library.FindBooksByNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (bahar.com.Library.FindBooksByNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, bahar.com.Library.FindBooksByNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bahar.com.Library.FindBooksByNameResponse findBooksByAuthor(bahar.com.Library.FindBooksByAuthorRequest parameter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("findBooksByAuthor");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "findBooksByAuthor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bahar.com.Library.FindBooksByNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (bahar.com.Library.FindBooksByNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, bahar.com.Library.FindBooksByNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bahar.com.Library.FindBooksByIDXResponse findBooksByIDX(bahar.com.Library.FindBooksByIDXRequest parameter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("findBooksByIDX");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "findBooksByIDX"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bahar.com.Library.FindBooksByIDXResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (bahar.com.Library.FindBooksByIDXResponse) org.apache.axis.utils.JavaUtils.convert(_resp, bahar.com.Library.FindBooksByIDXResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bahar.com.Library.SaveBookResponse saveBook(bahar.com.Library.SaveBookRequest parameter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("saveBook");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "saveBook"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bahar.com.Library.SaveBookResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (bahar.com.Library.SaveBookResponse) org.apache.axis.utils.JavaUtils.convert(_resp, bahar.com.Library.SaveBookResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bahar.com.Library.MergeBookResponse mergeBook(bahar.com.Library.MergeBookRequest parameter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("mergeBook");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "mergeBook"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bahar.com.Library.MergeBookResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (bahar.com.Library.MergeBookResponse) org.apache.axis.utils.JavaUtils.convert(_resp, bahar.com.Library.MergeBookResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

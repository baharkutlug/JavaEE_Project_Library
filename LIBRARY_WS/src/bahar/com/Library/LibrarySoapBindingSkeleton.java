/**
 * LibrarySoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bahar.com.Library;

public class LibrarySoapBindingSkeleton implements bahar.com.Library.LibraryPortType, org.apache.axis.wsdl.Skeleton {
    private bahar.com.Library.LibraryPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByNameRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameRequest"), bahar.com.Library.FindBooksByNameRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("findBooksByName", _params, new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByNameResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "findBooksByName"));
        _oper.setSoapAction("findBooksByName");
        _myOperationsList.add(_oper);
        if (_myOperations.get("findBooksByName") == null) {
            _myOperations.put("findBooksByName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("findBooksByName")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByAuthorRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByAuthorRequest"), bahar.com.Library.FindBooksByAuthorRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("findBooksByAuthor", _params, new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByNameResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByNameResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "findBooksByAuthor"));
        _oper.setSoapAction("findBooksByAuthor");
        _myOperationsList.add(_oper);
        if (_myOperations.get("findBooksByAuthor") == null) {
            _myOperations.put("findBooksByAuthor", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("findBooksByAuthor")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByIDXRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByIDXRequest"), bahar.com.Library.FindBooksByIDXRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("findBooksByIDX", _params, new javax.xml.namespace.QName("http://com.bahar/Library", "findBooksByIDXResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">findBooksByIDXResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "findBooksByIDX"));
        _oper.setSoapAction("findBooksByIDX");
        _myOperationsList.add(_oper);
        if (_myOperations.get("findBooksByIDX") == null) {
            _myOperations.put("findBooksByIDX", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("findBooksByIDX")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "saveBookRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">saveBookRequest"), bahar.com.Library.SaveBookRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("saveBook", _params, new javax.xml.namespace.QName("http://com.bahar/Library", "saveBookResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">saveBookResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "saveBook"));
        _oper.setSoapAction("saveBook");
        _myOperationsList.add(_oper);
        if (_myOperations.get("saveBook") == null) {
            _myOperations.put("saveBook", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("saveBook")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.bahar/Library", "mergeBookRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.bahar/Library", ">mergeBookRequest"), bahar.com.Library.MergeBookRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mergeBook", _params, new javax.xml.namespace.QName("http://com.bahar/Library", "mergeBookResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com.bahar/Library", ">mergeBookResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "mergeBook"));
        _oper.setSoapAction("mergeBook");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mergeBook") == null) {
            _myOperations.put("mergeBook", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mergeBook")).add(_oper);
    }

    public LibrarySoapBindingSkeleton() {
        this.impl = new bahar.com.Library.LibrarySoapBindingImpl();
    }

    public LibrarySoapBindingSkeleton(bahar.com.Library.LibraryPortType impl) {
        this.impl = impl;
    }
    public bahar.com.Library.FindBooksByNameResponse findBooksByName(bahar.com.Library.FindBooksByNameRequest parameter) throws java.rmi.RemoteException
    {
        bahar.com.Library.FindBooksByNameResponse ret = impl.findBooksByName(parameter);
        return ret;
    }

    public bahar.com.Library.FindBooksByNameResponse findBooksByAuthor(bahar.com.Library.FindBooksByAuthorRequest parameter) throws java.rmi.RemoteException
    {
        bahar.com.Library.FindBooksByNameResponse ret = impl.findBooksByAuthor(parameter);
        return ret;
    }

    public bahar.com.Library.FindBooksByIDXResponse findBooksByIDX(bahar.com.Library.FindBooksByIDXRequest parameter) throws java.rmi.RemoteException
    {
        bahar.com.Library.FindBooksByIDXResponse ret = impl.findBooksByIDX(parameter);
        return ret;
    }

    public bahar.com.Library.SaveBookResponse saveBook(bahar.com.Library.SaveBookRequest parameter) throws java.rmi.RemoteException
    {
        bahar.com.Library.SaveBookResponse ret = impl.saveBook(parameter);
        return ret;
    }

    public bahar.com.Library.MergeBookResponse mergeBook(bahar.com.Library.MergeBookRequest parameter) throws java.rmi.RemoteException
    {
        bahar.com.Library.MergeBookResponse ret = impl.mergeBook(parameter);
        return ret;
    }

}

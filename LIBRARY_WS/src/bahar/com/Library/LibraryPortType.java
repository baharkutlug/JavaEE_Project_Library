/**
 * LibraryPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bahar.com.Library;

public interface LibraryPortType extends java.rmi.Remote {
    public bahar.com.Library.FindBooksByNameResponse findBooksByName(bahar.com.Library.FindBooksByNameRequest parameter) throws java.rmi.RemoteException;
    public bahar.com.Library.FindBooksByNameResponse findBooksByAuthor(bahar.com.Library.FindBooksByAuthorRequest parameter) throws java.rmi.RemoteException;
    public bahar.com.Library.FindBooksByIDXResponse findBooksByIDX(bahar.com.Library.FindBooksByIDXRequest parameter) throws java.rmi.RemoteException;
    public bahar.com.Library.SaveBookResponse saveBook(bahar.com.Library.SaveBookRequest parameter) throws java.rmi.RemoteException;
    public bahar.com.Library.MergeBookResponse mergeBook(bahar.com.Library.MergeBookRequest parameter) throws java.rmi.RemoteException;
}

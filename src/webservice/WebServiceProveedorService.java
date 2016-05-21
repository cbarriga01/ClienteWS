/**
 * WebServiceProveedorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface WebServiceProveedorService extends javax.xml.rpc.Service {
    public java.lang.String getWebServiceProveedorAddress();

    public webservice.WebServiceProveedor getWebServiceProveedor() throws javax.xml.rpc.ServiceException;

    public webservice.WebServiceProveedor getWebServiceProveedor(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

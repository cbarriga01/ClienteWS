package webservice;

public class WebServiceProveedorProxy implements webservice.WebServiceProveedor {
  private String _endpoint = null;
  private webservice.WebServiceProveedor webServiceProveedor = null;
  
  public WebServiceProveedorProxy() {
    _initWebServiceProveedorProxy();
  }
  
  public WebServiceProveedorProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceProveedorProxy();
  }
  
  private void _initWebServiceProveedorProxy() {
    try {
      webServiceProveedor = (new webservice.WebServiceProveedorServiceLocator()).getWebServiceProveedor();
      if (webServiceProveedor != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceProveedor)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceProveedor)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceProveedor != null)
      ((javax.xml.rpc.Stub)webServiceProveedor)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.WebServiceProveedor getWebServiceProveedor() {
    if (webServiceProveedor == null)
      _initWebServiceProveedorProxy();
    return webServiceProveedor;
  }
  
  public java.lang.String busquedaAvanzadaCont(java.lang.String run, java.lang.String nombre, java.lang.String apellido, java.lang.String mail, java.lang.String telefono, java.lang.String pais, java.lang.String region, java.lang.String ciudad, java.lang.String direccion) throws java.rmi.RemoteException, org.orm.PersistentException{
    if (webServiceProveedor == null)
      _initWebServiceProveedorProxy();
    return webServiceProveedor.busquedaAvanzadaCont(run, nombre, apellido, mail, telefono, pais, region, ciudad, direccion);
  }
  
  public java.lang.String busquedaSimpleCont(java.lang.String busqueda) throws java.rmi.RemoteException, org.orm.PersistentException{
    if (webServiceProveedor == null)
      _initWebServiceProveedorProxy();
    return webServiceProveedor.busquedaSimpleCont(busqueda);
  }
  
  
}
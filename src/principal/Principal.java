package principal;

import webservice.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
		     WebServiceProveedorServiceLocator Locator = new WebServiceProveedorServiceLocator();
	         WebServiceProveedor ws = Locator.getWebServiceProveedor();
	         String resultadoBusquedaS = ws.busquedaSimpleCont("Claudia");
	         String resultadoBusquedaA = ws.busquedaAvanzadaCont("15.656.844-9", "", "", "", "", "", "", "", "");

	        if(resultadoBusquedaA!= null ){    
	        System.out.println("resultado busqueda Avanzada: " +resultadoBusquedaA);
	        }
	       
	        if(resultadoBusquedaS!= null ){    
	        System.out.println("resultado busqueda Simple: " +resultadoBusquedaS);
	             }      
	         
		  } catch (Exception e) {

	          e.printStackTrace();
		  
	    }

	}

}

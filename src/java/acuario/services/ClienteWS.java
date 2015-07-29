/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.ClienteFacade;
import acuario.clases.Cliente;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "ClienteWS")
public class ClienteWS {
    @EJB
    private ClienteFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createCliente")
    public boolean createCliente(@WebParam(name = "entity") Cliente entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdCliente")
    public Integer createIdCliente(@WebParam(name = "entity") Cliente entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editCliente")
    public boolean editCliente(@WebParam(name = "entity") Cliente entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeCliente")
    public boolean removeCliente(@WebParam(name = "entity") Cliente entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findCliente")
    public Cliente findCliente(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllCliente")
    public List<Cliente> findAllCliente() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countCliente")
    public int countCliente() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findClienteByNombre")
    public List<Cliente> findClienteByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findClienteByNombre(nombre);
    }

    @WebMethod(operationName = "findClienteByIdentidad")
    public List<Cliente> findClienteByIdentidad(@WebParam(name = "rut") String rut) {
        return ejbRef.findClienteByIdentidad(rut);
    }
    
}

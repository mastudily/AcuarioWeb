/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.FormapagoFacade;
import acuario.clases.Formapago;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "FormapagoWS")
public class FormapagoWS {
    @EJB
    private FormapagoFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createFormapago")
    public boolean createFormapago(@WebParam(name = "entity") Formapago entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdFormapago")
    public Integer createIdFormapago(@WebParam(name = "entity") Formapago entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editFormapago")
    public boolean editFormapago(@WebParam(name = "entity") Formapago entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeFormapago")
    public boolean removeFormapago(@WebParam(name = "entity") Formapago entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findFormapago")
    public Formapago findFormapago(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllFormapago")
    public List<Formapago> findAllFormapago() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countFormapago")
    public int countFormapago() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findFormapagoById")
    public List<Formapago> findFormapagoById(@WebParam(name = "id") Integer id) {
        return ejbRef.findFormapagoById(id);
    }

    @WebMethod(operationName = "findFormapagoByNombre")
    public List<Formapago> findFormapagoByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findFormapagoByNombre(nombre);
    }
    
}

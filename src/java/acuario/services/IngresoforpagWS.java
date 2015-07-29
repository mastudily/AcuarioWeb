/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.IngresoforpagFacade;
import acuario.clases.Ingresoforpag;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "IngresoforpagWS")
public class IngresoforpagWS {
    @EJB
    private IngresoforpagFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createIngresoforpag")
    public boolean createIngresoforpag(@WebParam(name = "entity") Ingresoforpag entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdIngresoforpag")
    public Integer createIdIngresoforpag(@WebParam(name = "entity") Ingresoforpag entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editIngresoforpag")
    public boolean editIngresoforpag(@WebParam(name = "entity") Ingresoforpag entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeIngresoforpag")
    public boolean removeIngresoforpag(@WebParam(name = "entity") Ingresoforpag entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findIngresoforpag")
    public Ingresoforpag findIngresoforpag(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllIngresoforpag")
    public List<Ingresoforpag> findAllIngresoforpag() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countIngresoforpag")
    public int countIngresoforpag() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByIngresoforpagIngresoid")
    public List<Ingresoforpag> findByIngresoforpagIngresoid(@WebParam(name = "id") Integer id) {
        return ejbRef.findByIngresoforpagIngresoid(id);
    }
    
}

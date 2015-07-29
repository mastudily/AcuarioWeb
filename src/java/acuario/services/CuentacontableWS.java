/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.CuentacontableFacade;
import acuario.clases.Cuentacontable;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "CuentacontableWS")
public class CuentacontableWS {
    @EJB
    private CuentacontableFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createCuentacontable")
    public boolean createCuentacontable(@WebParam(name = "entity") Cuentacontable entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdCuentacontable")
    public Integer createIdCuentacontable(@WebParam(name = "entity") Cuentacontable entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editCuentacontable")
    public boolean editCuentacontable(@WebParam(name = "entity") Cuentacontable entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeCuentacontable")
    public boolean removeCuentacontable(@WebParam(name = "entity") Cuentacontable entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findCuentacontable")
    public Cuentacontable findCuentacontable(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllCuentacontable")
    public List<Cuentacontable> findAllCuentacontable() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countCuentacontable")
    public int countCuentacontable() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByCuentacontablecodigo")
    public Cuentacontable findByCuentacontablecodigo(@WebParam(name = "codigo") String codigo, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findByCuentacontablecodigo(codigo, empresaid);
    }

    @WebMethod(operationName = "findCuentacontableByCodigo")
    public List<Cuentacontable> findCuentacontableByCodigo(@WebParam(name = "codigo") String codigo, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findCuentacontableByCodigo(codigo, empresaid);
    }

    @WebMethod(operationName = "findCuentacontableByNombre")
    public List<Cuentacontable> findCuentacontableByNombre(@WebParam(name = "nombre") String nombre, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findCuentacontableByNombre(nombre, empresaid);
    }

    @WebMethod(operationName = "findByCuentacontablemayor")
    public List<Cuentacontable> findByCuentacontablemayor(@WebParam(name = "mayor") boolean mayor, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findByCuentacontablemayor(mayor, empresaid);
    }
    
}

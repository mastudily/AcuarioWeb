/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.IngresoFacade;
import acuario.clases.Ingreso;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "IngresoWS")
public class IngresoWS {
    @EJB
    private IngresoFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createIngreso")
    public boolean createIngreso(@WebParam(name = "entity") Ingreso entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdIngreso")
    public Integer createIdIngreso(@WebParam(name = "entity") Ingreso entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editIngreso")
    public boolean editIngreso(@WebParam(name = "entity") Ingreso entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeIngreso")
    public boolean removeIngreso(@WebParam(name = "entity") Ingreso entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findIngreso")
    public Ingreso findIngreso(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllIngreso")
    public List<Ingreso> findAllIngreso() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countIngreso")
    public int countIngreso() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByIngresoid")
    public Ingreso findByIngresoid(@WebParam(name = "id") Integer id) {
        return ejbRef.findByIngresoid(id);
    }

    @WebMethod(operationName = "findIngresoByFecha")
    public List<Ingreso> findIngresoByFecha(@WebParam(name = "fecha") Date fecha) {
        return ejbRef.findIngresoByFecha(fecha);
    }

    @WebMethod(operationName = "findIngresoByNombre")
    public List<Ingreso> findIngresoByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findIngresoByNombre(nombre);
    }

    @WebMethod(operationName = "findIngresoByIdentidad")
    public List<Ingreso> findIngresoByIdentidad(@WebParam(name = "rut") String rut) {
        return ejbRef.findIngresoByIdentidad(rut);
    }
    
}

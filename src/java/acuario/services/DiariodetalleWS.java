/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.DiariodetalleFacade;
import acuario.clases.Diariodetalle;
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
@WebService(serviceName = "DiariodetalleWS")
public class DiariodetalleWS {
    @EJB
    private DiariodetalleFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createDiariodetalle")
    public boolean createDiariodetalle(@WebParam(name = "entity") Diariodetalle entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdDiariodetalle")
    public Integer createIdDiariodetalle(@WebParam(name = "entity") Diariodetalle entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editDiariodetalle")
    public boolean editDiariodetalle(@WebParam(name = "entity") Diariodetalle entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeDiariodetalle")
    public boolean removeDiariodetalle(@WebParam(name = "entity") Diariodetalle entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findDiariodetalle")
    public Diariodetalle findDiariodetalle(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllDiariodetalle")
    public List<Diariodetalle> findAllDiariodetalle() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countDiariodetalle")
    public int countDiariodetalle() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByDiarioid")
    public List<Diariodetalle> findByDiarioid(@WebParam(name = "id") Integer id) {
        return ejbRef.findByDiarioid(id);
    }

    @WebMethod(operationName = "findByCuentacontableid")
    public List<Diariodetalle> findByCuentacontableid(@WebParam(name = "id") Integer id) {
        return ejbRef.findByCuentacontableid(id);
    }

    @WebMethod(operationName = "findDiariodetalleByFecha")
    public List<Diariodetalle> findDiariodetalleByFecha(@WebParam(name = "fechaInicial") Date fechaInicial, @WebParam(name = "fechaFinal") Date fechaFinal, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findDiariodetalleByFecha(fechaInicial, fechaFinal, empresaid);
    }
    
}

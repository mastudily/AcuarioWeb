/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.DiarioFacade;
import acuario.clases.Diario;
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
@WebService(serviceName = "DiarioWS")
public class DiarioWS {
    @EJB
    private DiarioFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createDiario")
    public boolean createDiario(@WebParam(name = "entity") Diario entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdDiario")
    public Integer createIdDiario(@WebParam(name = "entity") Diario entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editDiario")
    public boolean editDiario(@WebParam(name = "entity") Diario entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeDiario")
    public boolean removeDiario(@WebParam(name = "entity") Diario entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findDiario")
    public Diario findDiario(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllDiario")
    public List<Diario> findAllDiario() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countDiario")
    public int countDiario() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findDiarioByFecha")
    public List<Diario> findDiarioByFecha(@WebParam(name = "fecha") Date fecha, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findDiarioByFecha(fecha, empresaid);
    }
    
}

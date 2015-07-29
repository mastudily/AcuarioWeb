/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.AuditoriaFacade;
import acuario.clases.Auditoria;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "AuditoriaWS")
public class AuditoriaWS {
    @EJB
    private AuditoriaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createAuditoria")
    public boolean createAuditoria(@WebParam(name = "entity") Auditoria entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdAuditoria")
    public Integer createIdAuditoria(@WebParam(name = "entity") Auditoria entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editAuditoria")
    public boolean editAuditoria(@WebParam(name = "entity") Auditoria entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeAuditoria")
    public boolean removeAuditoria(@WebParam(name = "entity") Auditoria entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findAuditoria")
    public Auditoria findAuditoria(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllAuditoria")
    public List<Auditoria> findAllAuditoria() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countAuditoria")
    public int countAuditoria() {
        return ejbRef.count();
    }
    
}

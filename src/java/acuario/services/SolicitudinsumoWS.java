/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.SolicitudinsumoFacade;
import acuario.clases.Solicitudinsumo;
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
@WebService(serviceName = "SolicitudinsumoWS")
public class SolicitudinsumoWS {
    @EJB
    private SolicitudinsumoFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createSolicitudinsumo")
    public boolean createSolicitudinsumo(@WebParam(name = "entity") Solicitudinsumo entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdSolicitudinsumo")
    public Integer createIdSolicitudinsumo(@WebParam(name = "entity") Solicitudinsumo entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editSolicitudinsumo")
    public boolean editSolicitudinsumo(@WebParam(name = "entity") Solicitudinsumo entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeSolicitudinsumo")
    public boolean removeSolicitudinsumo(@WebParam(name = "entity") Solicitudinsumo entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findSolicitudinsumo")
    public Solicitudinsumo findSolicitudinsumo(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllSolicitudinsumo")
    public List<Solicitudinsumo> findAllSolicitudinsumo() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countSolicitudinsumo")
    public int countSolicitudinsumo() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findSolicitudinsumoid")
    public Solicitudinsumo findSolicitudinsumoid(@WebParam(name = "id") Integer id) {
        return ejbRef.findSolicitudinsumoid(id);
    }

    @WebMethod(operationName = "findSolicitudinsumoByFecha")
    public List<Solicitudinsumo> findSolicitudinsumoByFecha(@WebParam(name = "fecha") Date fecha, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findSolicitudinsumoByFecha(fecha, empresaid);
    }
    
}

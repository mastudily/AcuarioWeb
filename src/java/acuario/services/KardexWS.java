/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.KardexFacade;
import acuario.clases.Kardex;
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
@WebService(serviceName = "KardexWS")
public class KardexWS {
    @EJB
    private KardexFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createKardex")
    public boolean createKardex(@WebParam(name = "entity") Kardex entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdKardex")
    public Integer createIdKardex(@WebParam(name = "entity") Kardex entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editKardex")
    public boolean editKardex(@WebParam(name = "entity") Kardex entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeKardex")
    public boolean removeKardex(@WebParam(name = "entity") Kardex entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findKardex")
    public Kardex findKardex(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllKardex")
    public List<Kardex> findAllKardex() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countKardex")
    public int countKardex() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findBySolicitudinsumoid")
    public List<Kardex> findBySolicitudinsumoid(@WebParam(name = "id") Integer id) {
        return ejbRef.findBySolicitudinsumoid(id);
    }

    @WebMethod(operationName = "findByInsumoidPeriodo")
    public List<Kardex> findByInsumoidPeriodo(@WebParam(name = "id") Integer id, @WebParam(name = "fecini") Date fecini, @WebParam(name = "fecfin") Date fecfin, @WebParam(name = "estado") String estado) {
        return ejbRef.findByInsumoidPeriodo(id, fecini, fecfin, estado);
    }
    
}

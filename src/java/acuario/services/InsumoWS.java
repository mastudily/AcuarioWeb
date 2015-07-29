/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.InsumoFacade;
import acuario.clases.Insumo;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "InsumoWS")
public class InsumoWS {
    @EJB
    private InsumoFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createInsumo")
    public boolean createInsumo(@WebParam(name = "entity") Insumo entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdInsumo")
    public Integer createIdInsumo(@WebParam(name = "entity") Insumo entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editInsumo")
    public boolean editInsumo(@WebParam(name = "entity") Insumo entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeInsumo")
    public boolean removeInsumo(@WebParam(name = "entity") Insumo entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findInsumo")
    public Insumo findInsumo(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllInsumo")
    public List<Insumo> findAllInsumo() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countInsumo")
    public int countInsumo() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByInsumoid")
    public Insumo findByInsumoid(@WebParam(name = "id") Integer id) {
        return ejbRef.findByInsumoid(id);
    }

    @WebMethod(operationName = "findByInsumocodigo")
    public Insumo findByInsumocodigo(@WebParam(name = "codigo") String codigo) {
        return ejbRef.findByInsumocodigo(codigo);
    }

    @WebMethod(operationName = "findInsumoByCodigo")
    public List<Insumo> findInsumoByCodigo(@WebParam(name = "codigo") String codigo) {
        return ejbRef.findInsumoByCodigo(codigo);
    }

    @WebMethod(operationName = "findInsumoByNombre")
    public List<Insumo> findInsumoByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findInsumoByNombre(nombre);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.InsumoempresaFacade;
import acuario.clases.Insumoempresa;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "InsumoempresaWS")
public class InsumoempresaWS {
    @EJB
    private InsumoempresaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createInsumoempresa")
    public boolean createInsumoempresa(@WebParam(name = "entity") Insumoempresa entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdInsumoempresa")
    public Integer createIdInsumoempresa(@WebParam(name = "entity") Insumoempresa entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editInsumoempresa")
    public boolean editInsumoempresa(@WebParam(name = "entity") Insumoempresa entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeInsumoempresa")
    public boolean removeInsumoempresa(@WebParam(name = "entity") Insumoempresa entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findInsumoempresa")
    public Insumoempresa findInsumoempresa(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllInsumoempresa")
    public List<Insumoempresa> findAllInsumoempresa() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countInsumoempresa")
    public int countInsumoempresa() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findByInsumoempresacodigo")
    public Insumoempresa findByInsumoempresacodigo(@WebParam(name = "codigo") String codigo, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findByInsumoempresacodigo(codigo, empresaid);
    }

    @WebMethod(operationName = "findInsumoempresaByCodigo")
    public List<Insumoempresa> findInsumoempresaByCodigo(@WebParam(name = "codigo") String codigo, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findInsumoempresaByCodigo(codigo, empresaid);
    }

    @WebMethod(operationName = "findInsumoempresaByNombre")
    public List<Insumoempresa> findInsumoempresaByNombre(@WebParam(name = "nombre") String nombre, @WebParam(name = "empresaid") Integer empresaid) {
        return ejbRef.findInsumoempresaByNombre(nombre, empresaid);
    }
    
}

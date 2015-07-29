/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.ConstanteFacade;
import acuario.clases.Constante;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "ConstanteWS")
public class ConstanteWS {
    @EJB
    private ConstanteFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createConstante")
    public boolean createConstante(@WebParam(name = "entity") Constante entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdConstante")
    public Integer createIdConstante(@WebParam(name = "entity") Constante entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editConstante")
    public boolean editConstante(@WebParam(name = "entity") Constante entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeConstante")
    public boolean removeConstante(@WebParam(name = "entity") Constante entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findConstante")
    public Constante findConstante(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllConstante")
    public List<Constante> findAllConstante() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countConstante")
    public int countConstante() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findConstanteByCodigo")
    public List<Constante> findConstanteByCodigo(@WebParam(name = "constantecodigo") String constantecodigo) {
        return ejbRef.findConstanteByCodigo(constantecodigo);
    }

    @WebMethod(operationName = "findConstanteByCodigoMnt")
    public List<Constante> findConstanteByCodigoMnt(@WebParam(name = "constantecodigo") String constantecodigo) {
        return ejbRef.findConstanteByCodigoMnt(constantecodigo);
    }

    @WebMethod(operationName = "findConstanteByCodigoTipo")
    public Constante findConstanteByCodigoTipo(@WebParam(name = "codigo") String codigo, @WebParam(name = "tipo") String tipo) {
        return ejbRef.findConstanteByCodigoTipo(codigo, tipo);
    }
    
}

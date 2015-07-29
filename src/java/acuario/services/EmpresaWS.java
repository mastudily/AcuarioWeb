/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.EmpresaFacade;
import acuario.clases.Empresa;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "EmpresaWS")
public class EmpresaWS {
    @EJB
    private EmpresaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createEmpresa")
    public boolean createEmpresa(@WebParam(name = "entity") Empresa entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdEmpresa")
    public Integer createIdEmpresa(@WebParam(name = "entity") Empresa entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editEmpresa")
    public boolean editEmpresa(@WebParam(name = "entity") Empresa entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeEmpresa")
    public boolean removeEmpresa(@WebParam(name = "entity") Empresa entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findEmpresa")
    public Empresa findEmpresa(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllEmpresa")
    public List<Empresa> findAllEmpresa() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countEmpresa")
    public int countEmpresa() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findEmpresaByNombre")
    public List<Empresa> findEmpresaByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findEmpresaByNombre(nombre);
    }

    @WebMethod(operationName = "findEmpresaByIdentidad")
    public List<Empresa> findEmpresaByIdentidad(@WebParam(name = "rut") String rut) {
        return ejbRef.findEmpresaByIdentidad(rut);
    }
    
}

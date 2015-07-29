/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.PerfilFacade;
import acuario.clases.Perfil;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "PerfilWS")
public class PerfilWS {
    @EJB
    private PerfilFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createPerfil")
    public boolean createPerfil(@WebParam(name = "entity") Perfil entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdPerfil")
    public Integer createIdPerfil(@WebParam(name = "entity") Perfil entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editPerfil")
    public boolean editPerfil(@WebParam(name = "entity") Perfil entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removePerfil")
    public boolean removePerfil(@WebParam(name = "entity") Perfil entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findPerfil")
    public Perfil findPerfil(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllPerfil")
    public List<Perfil> findAllPerfil() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countPerfil")
    public int countPerfil() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findPerfilById")
    public List<Perfil> findPerfilById(@WebParam(name = "id") Integer id) {
        return ejbRef.findPerfilById(id);
    }

    @WebMethod(operationName = "findPerfilByNombre")
    public List<Perfil> findPerfilByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findPerfilByNombre(nombre);
    }
    
}
